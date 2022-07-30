package org.myrobotlab.codec;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.module.noctordeser.NoCtorDeserModule;
import org.myrobotlab.codec.json.GsonPolymorphicBuilderFactory;
import org.myrobotlab.codec.json.JacksonPolymorphicModule;
import org.myrobotlab.framework.MRLListener;
import org.myrobotlab.framework.Message;
import org.myrobotlab.logging.Level;
import org.myrobotlab.logging.LoggerFactory;
import org.myrobotlab.logging.LoggingFactory;
import org.myrobotlab.service.config.ServiceConfig;
import org.slf4j.Logger;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

/**
 * handles all encoding and decoding of MRL messages or api(s) assumed context -
 * services can add an assumed context as a prefix
 * /api/returnEncoding/inputEncoding/service/method/param1/param2/ ...
 *
 * xmpp for example assumes (/api/string/gson)/service/method/param1/param2/ ...
 *
 * scheme = alpha *( alpha | digit | "+" | "-" | "." ) Components of all URIs: [
 * &lt;scheme&gt;:]&lt;scheme-specific-part&gt;[#&lt;fragment&gt;]
 *
 * branch API test 5
 *
 * @see <a href="http://stackoverflow.com/questions/3641722/valid-characters-for-uri-schemes">Valid characters for URI schemes</a>
 */
public class CodecUtils {

  public final static Logger log = LoggerFactory.getLogger(CodecUtils.class);

  public static class ApiDescription {
    String key;
    String path; // {scheme}://{host}:{port}/api/messages
    String exampleUri;
    String description;

    public ApiDescription(String key, String uriDescription, String exampleUri, String description) {
      this.key = key;
      this.path = uriDescription;
      this.exampleUri = exampleUri;
      this.description = description;
    }
  }

  public final static String PARAMETER_API = "/api/";
  public final static String PREFIX_API = "api";

  // mime-types
  /**
   * The MIME type used to specify JSON data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types">MIME types</a>
   */
  public final static String MIME_TYPE_JSON = "application/json";

  /**
   * Whether we are using the GSON JSON backend or not. If false,
   * use Jackson.
   * TODO Replace with enum to allow extension for multiple backends
   */
  public static final boolean USING_GSON = true;


  /**
   * The key used to locate type information
   * in a JSON dictionary. This is used to serialize
   * type information into the JSON and to deserialize
   * JSON into the correct type.
   */
  public static final String CLASS_META_KEY = "class";


  /**
   * The type that GSON uses when it attempts to deserialize
   * without knowing the target type, e.g. if the target
   * is {@link Object}.
   */
  private static final Class<?> GSON_DEFAULT_OBJECT_TYPE = LinkedTreeMap.class;

  /**
   * The type that Jackson uses when it attempts to deserialize
   * without knowing the target type, e.g. if the target
   * is {@link Object} and no field matching {@link #CLASS_META_KEY}
   * is found.
   */
  private static final Class<?> JACKSON_DEFAULT_OBJECT_TYPE = LinkedHashMap.class;

  /**
   * The type that the chosen JSON backend uses when it attempts to deserialize
   * without knowing the target type, e.g. if the target
   * is {@link Object} and no field matching {@link #CLASS_META_KEY}
   * is found.
   */
  public static final Class<?> JSON_DEFAULT_OBJECT_TYPE = (USING_GSON) ? GSON_DEFAULT_OBJECT_TYPE : JACKSON_DEFAULT_OBJECT_TYPE;

  /**
   * The {@link Gson} object used for JSON operations when the selected backend is
   * Gson.
   *
   * @see #USING_GSON
   */
  private static final Gson gson = GsonPolymorphicBuilderFactory.createPolymorphicGsonBuilder()
          .setDateFormat("yyyy-MM-dd HH:mm:ss.SSS").disableHtmlEscaping().create();

  /**
   * The {@link Gson} object used to pretty-print JSON.
   */
  private static final Gson prettyGson = GsonPolymorphicBuilderFactory.createPolymorphicGsonBuilder()
          .setDateFormat("yyyy-MM-dd HH:mm:ss.SSS").setPrettyPrinting().disableHtmlEscaping().create();

  /**
   * The Jackson {@link ObjectMapper} used for JSON operations when
   * the selected backend is Jackson.
   *
   * @see #USING_GSON
   */
  private static final ObjectMapper mapper = new ObjectMapper();

  /**
   * The {@link TypeFactory} used to generate type information for
   * {@link #mapper} when the selected backend is Jackson.
   *
   * No analogue exists for Gson, as it uses a different mechanism
   * to represent types.
   *
   * @see #USING_GSON
   */
  private static final TypeFactory typeFactory = TypeFactory.defaultInstance();


  //Class initializer to setup mapper when the class is loaded
  static {
    //This allows Jackson to work just like GSON when no default constructor is available
    mapper.registerModule(new NoCtorDeserModule());

    //Actually add our polymorphic support
    mapper.registerModule(JacksonPolymorphicModule.getPolymorphicModule());

    //Disables Jackson's automatic property detection
    mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE);
    mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
    mapper.setVisibility(PropertyAccessor.SETTER, JsonAutoDetect.Visibility.ANY);

    //Make jackson behave like gson in that unknown properties are ignored
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
  }

  /**
   * Ensures a service type name is fully qualified.
   * If the type name is short, it will assume the type
   * exists in the {@code org.myrobotlab.service} package.
   *
   * @param type The service type name, either shortened or
   *             fully qualified.
   * @return Null if type is null, otherwise fully qualified name.
   */
  public static String makeFullTypeName(String type) {
    if (type == null) {
      return null;
    }
    if (!type.contains(".")) {
      return String.format("org.myrobotlab.service.%s", type);
    }
    return type;
  }


  /**
   * Set of all known wrapper types, which are classes that correspond to
   * Java primitives (plus {@link Void}).
   *
   * @see <a href="https://www.w3schools.com/java/java_wrapper_classes.asp">Java Wrapper Classes</a>
   */
  public static final Set<Class<?>> WRAPPER_TYPES = new HashSet<>(
          Arrays.asList(Boolean.class, Character.class, Byte.class, Short.class, Integer.class, Long.class,
                  Float.class, Double.class, Void.class));

  /**
   * Set of the fully-qualified (AKA canonical) names of {@link #WRAPPER_TYPES}.
   *
   * @see <a href="https://www.w3schools.com/java/java_wrapper_classes.asp">Java Wrapper Classes</a>
   */
  public static final Set<String> WRAPPER_TYPES_CANONICAL =
          WRAPPER_TYPES.stream().map(Object::getClass).map(Class::getCanonicalName).collect(Collectors.toSet());

  @Deprecated /* use MethodCache */
  final static HashMap<String, Method> methodCache = new HashMap<String, Method>();

  /**
   * a method signature map based on name and number of methods - the String[]
   * will be the keys into the methodCache A method key is generated by input
   * from some encoded protocol - the method key is object name + method name +
   * parameter number - this returns a full method signature key which is used
   * to look up the method in the methodCache
   */
  final static HashMap<String, ArrayList<Method>> methodOrdinal = new HashMap<String, ArrayList<Method>>();

  final static HashSet<String> objectsCached = new HashSet<String>();

  public static String capitalize(final String line) {
    return Character.toUpperCase(line.charAt(0)) + line.substring(1);
  }

  /**
   * Deserializes a JSON string into the target object
   * (or subclass of if {@link #CLASS_META_KEY} exists)
   * using the selected JSON backend.
   *
   * @param json The JSON to be deserialized in String form
   * @param clazz The target class.
   * @return An object of the specified class (or a subclass of) with the state
   * given by the json.
   * @param <T> The type of the target class.
   * @see #USING_GSON
   * @throws RuntimeException if an error during deserialization occurs.
   */
  public static <T extends Object> T fromJson(String json, Class<T> clazz) {
    if (USING_GSON)
      return gson.fromJson(json, clazz);
    try {
      return mapper.readValue(json, clazz);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }


  /**
   * Deserializes a JSON string into the target object
   * (or subclass of if {@link #CLASS_META_KEY} exists)
   * using the selected JSON backend.
   *
   * @param json The JSON to be deserialized in String form
   * @param genericClass The target class.
   * @param parameterized The list of types used as the genericClass type parameters
   *                      of genericClass.
   * @return An object of the specified class (or a subclass of) with the state
   * given by the json.
   * @param <T> The type of the target class.
   * @see #USING_GSON
   * @throws RuntimeException if an error during deserialization occurs.
   */
  public static <T extends Object> T fromJson(String json, Class<?> genericClass, Class<?>... parameterized) {
    if(USING_GSON)
      return gson.fromJson(json, getType(genericClass, parameterized));
    try {
      return mapper.readValue(json, typeFactory.constructParametricType(genericClass, parameterized));
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }


  /**
   * Deserializes a JSON string into the target object
   * (or subclass of if {@link #CLASS_META_KEY} exists)
   * using the selected JSON backend.
   *
   * @param json The JSON to be deserialized in String form
   * @param type The target type.
   * @return An object of the specified class (or a subclass of) with the state
   * given by the json.
   * @param <T> The type of the target class.
   * @see #USING_GSON
   * @throws RuntimeException if an error during deserialization occurs.
   */
  public static <T extends Object> T fromJson(String json, Type type) {
    if(USING_GSON)
      return gson.fromJson(json, type);
    try {
      return mapper.readValue(json, typeFactory.constructType(type));
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  @SuppressWarnings("unchecked")
  public static LinkedTreeMap<String, Object> toTree(String json) {
    if(USING_GSON)
      return gson.fromJson(json, LinkedTreeMap.class);
    try {
      return (LinkedTreeMap<String, Object>) mapper.readValue(json, LinkedTreeMap.class);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  public static Type getType(final Class<?> rawClass, final Class<?>... parameterClasses) {
    return new ParameterizedType() {
      @Override
      public Type[] getActualTypeArguments() {
        return parameterClasses;
      }

      @Override
      public Type getRawType() {
        return rawClass;
      }

      @Override
      public Type getOwnerType() {
        return null;
      }

    };
  }

  static public byte[] getBytes(Object o) throws IOException {
    ByteArrayOutputStream byteStream = new ByteArrayOutputStream(5000);
    ObjectOutputStream os = new ObjectOutputStream(new BufferedOutputStream(byteStream));
    os.flush();
    os.writeObject(o);
    os.flush();
    return byteStream.toByteArray();
  }

  static public String shortName(String name) {
    if (name == null) {
      return null;
    }
    if (name.contains("@")) {
      return name.substring(0, name.indexOf("@"));
    } else {
      return name;
    }
  }

  /**
   * Gets the instance id from a service name
   * 
   * @param name
   *          the name of the instance
   * @return the name of the instance
   * 
   */
  static public String getId(String name) {
    if (name == null) {
      return null;
    }
    if (name.contains("@")) {
      return name.substring(name.lastIndexOf("@") + 1);
    } else {
      return null;
    }
  }


  /**
   * Converts a topic method name to the name of the method that is
   * used for callbacks. Usually this involves prepending the string
   * "on", removing any "get" or "publish" prefix, and converting
   * it all to proper camelCase.
   *
   * @param topicMethod The topic method name, such as "publishState"
   * @return The name for the callback method, such as "onState"
   */
  static public String getCallbackTopicName(String topicMethod) {
    // replacements
    if (topicMethod.startsWith("publish")) {
      return String.format("on%s", capitalize(topicMethod.substring("publish".length())));
    } else if (topicMethod.startsWith("get")) {
      return String.format("on%s", capitalize(topicMethod.substring("get".length())));
    }

    // no replacement - just pefix and capitalize
    // FIXME - subscribe to onMethod --- gets ---> onOnMethod :P
    return String.format("on%s", capitalize(topicMethod));
  }

  // TODO
  // public static Object encode(Object, encoding) - dispatches appropriately
  //should be simple using an enum and map to a new Encoder functional interface

  /**
   * Gets a String representation of a Message
   * @param msg The message
   * @return The String representation of the message
   */
  static public String getMsgKey(Message msg) {
    if (msg.sendingMethod != null) {
      return String.format("%s.%s --> %s.%s(%s) - %d", msg.sender, msg.sendingMethod, msg.name, msg.method, CodecUtils.getParameterSignature(msg.data), msg.msgId);
    } else {
      return String.format("%s --> %s.%s(%s) - %d", msg.sender, msg.name, msg.method, CodecUtils.getParameterSignature(msg.data), msg.msgId);
    }
  }

  static public String getParameterSignature(final Object[] data) {
    if (data == null) {
      return "";
    }

    StringBuffer ret = new StringBuffer();
    for (int i = 0; i < data.length; ++i) {
      if (data[i] != null) {
        Class<?> c = data[i].getClass(); // not all data types are safe
        // toString() e.g.
        // SerializableImage
        //if (c == String.class || c == Integer.class || c == Boolean.class || c == Float.class || c == MRLListener.class) {
        if(WRAPPER_TYPES.stream().anyMatch(n->n.equals(c)) || MRLListener.class.equals(c)) {
          ret.append(data[i].toString());
        } else {
          String type = data[i].getClass().getCanonicalName();
          String shortTypeName = type.substring(type.lastIndexOf(".") + 1);
          ret.append(shortTypeName);
        }

        if (data.length != i + 1) {
          ret.append(",");
        }
      } else {
        ret.append("null");
      }

    }
    return ret.toString();

  }

  static public String getServiceType(String inType) {
    if (inType == null) {
      return null;
    }
    if (inType.contains(".")) {
      return inType;
    }
    return String.format("org.myrobotlab.service.%s", inType);
  }

  public static Message gsonToMsg(String gsonData) {
    return gson.fromJson(gsonData, Message.class);
  }

  /**
   * most lossy protocols need conversion of parameters into correctly typed
   * elements this method is used to query a candidate method to see if a simple
   * conversion is possible
   * 
   * @param clazz
   *          the class
   * @return true/false
   */
  public static boolean isSimpleType(Class<?> clazz) {
    return WRAPPER_TYPES.contains(clazz) || clazz == String.class;
  }

  public static boolean isWrapper(Class<?> clazz) {
    return WRAPPER_TYPES.contains(clazz);
  }

  public static boolean isWrapper(String className) {
    return WRAPPER_TYPES_CANONICAL.contains(className);
  }

  static public String toCamelCase(String s) {
    String[] parts = s.split("_");
    String camelCaseString = "";
    for (String part : parts) {
      camelCaseString = camelCaseString + toCCase(part);
    }
    return String.format("%s%s", camelCaseString.substring(0, 1).toLowerCase(), camelCaseString.substring(1));
  }

  static public String toCCase(String s) {
    return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
  }

  public static String toJson(Object o) {
    if(USING_GSON)
      return gson.toJson(o);
    try {
      return mapper.writeValueAsString(o);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  static public void toJson(OutputStream out, Object obj) throws IOException {
    String json;
    if(USING_GSON)
      json = gson.toJson(obj);
    else
      json = mapper.writeValueAsString(obj);
    if (json != null)
      out.write(json.getBytes());
  }

  public static String toJson(Object o, Class<?> clazz) {
    if(USING_GSON)
      return gson.toJson(o, clazz);
    try {
      return mapper.writerFor(clazz).writeValueAsString(o);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  public static void toJsonFile(Object o, String filename) throws IOException {
    FileOutputStream fos = new FileOutputStream(new File(filename));
    if(USING_GSON)
      fos.write(gson.toJson(o).getBytes());
    else
      fos.write(mapper.writeValueAsBytes(o));
    fos.close();
  }

  // === method signatures begin ===

  static public String toUnderScore(String camelCase) {
    return toUnderScore(camelCase, false);
  }

  static public String toUnderScore(String camelCase, Boolean toLowerCase) {

    byte[] a = camelCase.getBytes();
    boolean lastLetterLower = false;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < a.length; ++i) {
      boolean currentCaseUpper = Character.isUpperCase(a[i]);

      Character newChar = null;
      if (toLowerCase != null) {
        if (toLowerCase) {
          newChar = (char) Character.toLowerCase(a[i]);
        } else {
          newChar = (char) Character.toUpperCase(a[i]);
        }
      } else {
        newChar = (char) a[i];
      }

      sb.append(String.format("%s%c", (lastLetterLower && currentCaseUpper) ? "_" : "", newChar));
      lastLetterLower = !currentCaseUpper;
    }

    return sb.toString();

  }

  public static boolean tryParseInt(String string) {
    try {
      Integer.parseInt(string);
      return true;
    } catch (Exception e) {

    }
    return false;
  }

  public static String type(String type) {
    int pos0 = type.indexOf(".");
    if (pos0 > 0) {
      return type;
    }
    return String.format("org.myrobotlab.service.%s", type);
  }

  static final String JSON = "application/javascript";

  public static final String API_MESSAGES = "messages";
  public static final String API_SERVICE = "service";

  public static String getSimpleName(String serviceType) {
    int pos = serviceType.lastIndexOf(".");
    if (pos > -1) {
      return serviceType.substring(pos + 1);
    }
    return serviceType;
  }

  public static String getSafeReferenceName(String name) {
    return name.replaceAll("[@/ .-]", "_");
  }

  public static String toPrettyJson(Object ret) {
    return prettyGson.toJson(ret);
  }

  static public Object[] decodeArray(Object data) throws Exception {
    // ITS GOT TO BE STRING - it just has to be !!! :)
    String instr = (String) data;
    // array of Strings ? - don't want to double encode !
    Object[] ret = null;
    synchronized (data) {
      //ret = gson.fromJson(instr, Object[].class);
      ret = mapper.readValue(instr, Object[].class);
    }
    return ret;
  }

  /**
   * This is the Cli encoder - it takes a line of text and generates the
   * appropriate msg from it to either invoke (locally) or sendBlockingRemote
   * (remotely)
   * 
   * <pre>
   * 
   * The expectation of this encoding is:
   *    if "/api/service/" is found - the end of that string is the starting point
   *    if "/api/service/" is not found - then the starting point of the string should be the service
   *      e.g "runtime/getUptime"
   * 
   * Important to remember getRequestURI is NOT decoded and getPathInfo is.
   * 
   * 
            
            Method              URL-Decoded Result           
            ----------------------------------------------------
            getContextPath()        no      /app
            getLocalAddr()                  127.0.0.1
            getLocalName()                  30thh.loc
            getLocalPort()                  8480
            getMethod()                     GET
            getPathInfo()           yes     /a?+b
            getProtocol()                   HTTP/1.1
            getQueryString()        no      p+1=c+dp+2=e+f
            getRequestedSessionId() no      S%3F+ID
            getRequestURI()         no      /app/test%3F/a%3F+b;jsessionid=S+ID
            getRequestURL()         no      http://30thh.loc:8480/app/test%3F/a%3F+b;jsessionid=S+ID
            getScheme()                     http
            getServerName()                 30thh.loc
            getServerPort()                 8480
            getServletPath()        yes     /test?
            getParameterNames()     yes     [p 2, p 1]
            getParameter("p 1")     yes     c d
   * </pre>
   * 
   * @param contextPath
   *          - prefix to be added if supplied
   * 
   * @param from
   *          - sender
   * @param to
   *          - target service
   * @param cmd
   *          - cli encoded msg
   * @return - a Message derived from cli
   */
  static public Message cliToMsg(String contextPath, String from, String to, String cmd) {
    Message msg = Message.createMessage(from, to, "ls", null);

    /**
     * <pre>
     
     The key to this interface is leading "/" ...
     "/" is absolute path - dir or execute
     without "/" means runtime method - spaces and quotes can be delimiters
    
    "/"  -  list services
    "/{serviceName}" - list data of service
    "/{serviceName}/" - list methods of service
    "/{serviceName}/{method}" - invoke method
    "/{serviceName}/{method}/" - list parameters of method
    "/{serviceName}/{method}/p0/p1/p2" - invoke method with parameters
    
     or runtime
     {method}
     {method}/
     {method}/p01
     * 
     * 
     * </pre>
     */

    cmd = cmd.trim();

    // remove uninteresting api prefix
    if (cmd.startsWith("/api/service")) {
      cmd = cmd.substring("/api/service".length());
    }

    if (contextPath != null) {
      cmd = contextPath + cmd;
    }

    // assume runtime as 'default'
    if (msg.name == null) {
      msg.name = "runtime";
    }

    // two possibilities - either it begins with "/" or it does not
    // if it does begin with "/" its an absolute path to a dir, ls, or invoke
    // if not then its a runtime method

    if (cmd.startsWith("/")) {
      // ABSOLUTE PATH !!!
      String[] parts = cmd.split("/");

      if (parts.length < 3) {
        msg.method = "ls";
        msg.data = new Object[] { "\"" + cmd + "\"" };
        return msg;
      }

      // fix me diff from 2 & 3 "/"
      if (parts.length >= 3) {
        // prepare to parse the arguments

        msg.name = parts[1];
        // prepare the method
        msg.method = parts[2].trim();

        // FIXME - to encode or not to encode that is the question ...
        // This source comes from the cli - which is "all" strings
        // in theory it needs to be decoded from an all strings interface
        // json is an all string interface so we will decode from cli strings
        // (not json)
        // using a json decoder - cuz it will work :P - and string will decode
        // to a string
        Object[] payload = new Object[parts.length - 3];
        for (int i = 3; i < parts.length; ++i) {
          if (isInteger(parts[i])) {
            payload[i - 3] = makeInteger(parts[i]);
          } else if (isDouble(parts[i])) {
            payload[i - 3] = makeDouble(parts[i]);
          } else if (parts[i].equals("true") || parts[i].equals("false")) {
            payload[i - 3] = makeBoolean(parts[i]);
          } else { // String
            // sloppy as the cli does not require quotes \" but json does
            // humans won't add quotes - but we will
            payload[i - 3] = parts[i];
          }
        }

        msg.data = payload;
      }
      return msg;
    } else {
      // NOT ABOSLUTE PATH - SIMILAR TO EXECUTING IN THE RUNTIME /usr/bin path
      // (ie runtime methods!)
      // spaces for parameter delimiters ?
      String[] spaces = cmd.split(" ");
      // FIXME - need to deal with double quotes e.g. func A "B and C" D - p0 =
      // "A" p1 = "B and C" p3 = "D"
      msg.method = spaces[0];
      Object[] payload = new Object[spaces.length - 1];
      for (int i = 1; i < spaces.length; ++i) {
        // webgui will never use this section of code
        // currently the codepath is only excercised by InProcessCli
        // all of this methods will be "optimized" single commands to runtime (i
        // think)
        // so we are going to error on the side of String parameters - other
        // data types will have problems
        payload[i - 1] = "\"" + spaces[i] + "\"";
      }
      msg.data = payload;

      return msg;
    }
  }

  static public Integer makeInteger(String data) {
    try {
      return Integer.parseInt(data);
    } catch (Exception e) {
    }
    return null;
  }

  static public boolean isInteger(String data) {
    try {
      Integer.parseInt(data);
      return true;
    } catch (Exception e) {
    }
    return false;
  }

  static public boolean isDouble(String data) {
    try {
      Double.parseDouble(data);
      return true;
    } catch (Exception e) {
    }
    return false;
  }

  static public Double makeDouble(String data) {
    try {
      return Double.parseDouble(data);
    } catch (Exception e) {
    }
    return null;
  }

  static public Boolean isBoolean(String data) {
    return Boolean.parseBoolean(data);
  }

  static public Boolean makeBoolean(String data) {
    try {
      return Boolean.parseBoolean(data);
    } catch (Exception e) {
    }
    return null;
  }

  static public List<ApiDescription> getApis() {
    List<ApiDescription> ret = new ArrayList<>();
    ret.add(new ApiDescription("message", "{scheme}://{host}:{port}/api/messages", "ws://localhost:8888/api/messages",
        "An asynchronous api useful for bi-directional websocket communication, primary messages api for the webgui.  URI is /api/messages data contains a json encoded Message structure"));
    ret.add(new ApiDescription("service", "{scheme}://{host}:{port}/api/service", "http://localhost:8888/api/service/runtime/getUptime",
        "An synchronous api useful for simple REST responses"));
    return ret;
  }

  /**
   * Creates a properly double encoded Json msg string. Why double encode ? -
   * because initial decode should decode router and header information. The
   * first decode will leave the payload a array of json strings. The header
   * will send it to a another process or it will go to the MethodCache of some
   * service. The MethodCache will decode a 2nd time based on a method signature
   * key match (key based on parameter types).
   * 
   * @param sender
   *          the sender of the message
   * @param sendingMethod
   *          the method sending it
   * @param name
   *          dest service
   * @param method
   *          dest method
   * @param params
   *          params to pass
   * @return the string representation of the json message
   * 
   */
  public static String createJsonMsg(String sender, String sendingMethod, String name, String method, Object... params) {
    Message msg = Message.createMessage(sender, name, method, null);
    msg.sendingMethod = sendingMethod;
    Object[] d = null;
    if (params != null) {
      d = new Object[params.length];
      for (int i = 0; i < params.length; ++i) {
        d[i] = CodecUtils.toJson(params[i]);
      }
      msg.setData(d);
    }
    return CodecUtils.toJson(msg);
  }

  public static String toJsonMsg(Message inMsg) {
    if ("json".equals(inMsg.encoding)) {
      // msg already has json encoded data parameters
      // just encode the msg envelope
      return CodecUtils.toJson(inMsg);
    }
    Message msg = new Message(inMsg);
    msg.encoding = "json";
    Object[] params = inMsg.getData();
    Object[] d = null;
    if (params != null) {
      d = new Object[params.length];
      for (int i = 0; i < params.length; ++i) {
        d[i] = CodecUtils.toJson(params[i]);
      }
      msg.setData(d);
    }
    return CodecUtils.toJson(msg);
  }

  @Deprecated
  public static Message toJsonParameters(Message msg) {
    Object[] data = msg.getData();
    if (data != null) {
      Object[] params = new Object[data.length];
      for (int i = 0; i < params.length; ++i) {
        params[i] = toJson(data[i]);
      }
      msg.setData(params);
    }
    return msg;
  }

  public static String toYaml(Object o) {
    // not thread safe - so we new here
    DumperOptions options = new DumperOptions();
    options.setIndent(2);
    options.setPrettyFlow(true);
    // options.setBeanAccess(BeanAccess.FIELD);
    options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
    /**
     * <pre>
     *  How to suppress null fields if desired
     Representer representer = new Representer() {
       &#64;Override
       protected NodeTuple representJavaBeanProperty(Object javaBean, Property property, Object propertyValue, Tag customTag) {
         // if value of property is null, ignore it.
         if (propertyValue == null) {
           return null;
         } else {
           return super.representJavaBeanProperty(javaBean, property, propertyValue, customTag);
         }
       }
     };
     * </pre>
     */

    Yaml yaml = new Yaml(options);
    // yaml.setBeanAccess(BeanAccess.FIELD);
    String c = yaml.dump(o);
    return c;
  }

  public static String allToYaml(Iterator<? extends Object> o) {
    // not thread safe - so we new here
    DumperOptions options = new DumperOptions();
    options.setIndent(2);
    options.setPrettyFlow(true);
    options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);

    Yaml yaml = new Yaml(options);
    // yaml.setBeanAccess(BeanAccess.FIELD);
    String c = yaml.dumpAll(o);
    return c;
  }

  public static Iterable<Object> allFromYaml(InputStream is) {
    // Yaml yaml = new Yaml(new Constructor(clazz));
    Yaml yaml = new Yaml();
    // yaml.setBeanAccess(BeanAccess.FIELD);
    return yaml.loadAll(is);
  }

  public static <T extends Object> T fromYaml(String data, Class<T> clazz) {
    Yaml yaml = new Yaml(new Constructor(clazz));
    // yaml.setBeanAccess(BeanAccess.FIELD);
    return (T) yaml.load(data);
  }

  public static boolean isLocal(String name, String id) {
    if (!name.contains("@")) {
      return true;
    }
    if (name.substring(name.indexOf("@") + 1).equals(id)) {
      return true;
    }
    return false;
  }
  
  public static ServiceConfig readServiceConfig(String filename) throws IOException {
    String data = new String(Files.readAllBytes(Paths.get(filename)), StandardCharsets.UTF_8);
    Yaml yaml = new Yaml();
    return (ServiceConfig)yaml.load(data);
  }

  public static void setField(Object o, String field, Object value) {
    try {
      // TODO - handle all types :P
     Field f =  o.getClass().getDeclaredField(field);
     f.setAccessible(true);
     f.set(o, value);
    } catch (Exception e) {
      /** don't care - if its not there don't set it */
    }
  }
  
  
  public static void main(String[] args) {
    LoggingFactory.init(Level.INFO);

    try {
      
      Object o = readServiceConfig("data/config/InMoov2_FingerStarter/i01.chatBot.yml");
      
      String json = CodecUtils.fromJson("test", String.class);
      log.info("json {}", json);
      json = CodecUtils.fromJson("a test", String.class);
      log.info("json {}", json);
      json = CodecUtils.fromJson("\"a/test\"", String.class);
      log.info("json {}", json);
      CodecUtils.fromJson("a/test", String.class);

    } catch (Exception e) {
      log.error("main threw", e);
    }
  }

  
  
  
}
