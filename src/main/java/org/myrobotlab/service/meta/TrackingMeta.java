package org.myrobotlab.service.meta;

import java.util.LinkedHashMap;

import org.myrobotlab.framework.Platform;
import org.myrobotlab.framework.interfaces.ServiceInterface;
import org.myrobotlab.logging.LoggerFactory;
import org.myrobotlab.service.Pid.PidData;
import org.myrobotlab.service.config.ArduinoConfig;
import org.myrobotlab.service.config.OpenCVConfig;
import org.myrobotlab.service.config.PidConfig;
import org.myrobotlab.service.config.ServiceConfig;
import org.myrobotlab.service.config.ServoConfig;
import org.myrobotlab.service.config.TrackingConfig;
import org.myrobotlab.service.meta.abstracts.MetaData;
import org.slf4j.Logger;

public class TrackingMeta extends MetaData {
  private static final long serialVersionUID = 1L;
  public final static Logger log = LoggerFactory.getLogger(TrackingMeta.class);

  /**
   * This class is contains all the meta data details of a service. It's peers,
   * dependencies, and all other meta data related to the service.
   * 
   * @param name
   *          n
   * 
   */
  public TrackingMeta(String name) {

    super(name);
    Platform platform = Platform.getLocalInstance();

    addDescription("tracks objects through video stream given a simple pan, tilt servo camera rig");
    addCategory("sensors","tracking", "vision");
    // addPeer
  }

  static public LinkedHashMap<String, ServiceConfig> getDefault(String name) {

    LinkedHashMap<String, ServiceConfig> config = new LinkedHashMap<>();

    TrackingConfig trackingConfig = new TrackingConfig();

    // set local names and config
    String controller = name + ".controller";
    trackingConfig.cv = name + ".cv";
    trackingConfig.pan = name + ".pan";
    trackingConfig.tilt = name + ".tilt";
    trackingConfig.pid = name + ".pid";
    trackingConfig.enabled = false;

    // build a config with all peer defaults
    config.putAll(ServiceInterface.getDefault(controller, "Arduino"));
    config.putAll(ServiceInterface.getDefault(trackingConfig.cv, "OpenCV"));
    config.putAll(ServiceInterface.getDefault(trackingConfig.pan, "Servo"));
    config.putAll(ServiceInterface.getDefault(trackingConfig.tilt, "Servo"));
    config.putAll(ServiceInterface.getDefault(trackingConfig.pid, "Pid"));

    // pull out config this service default wants to modify
    ArduinoConfig controllerConfig = (ArduinoConfig) config.get(controller);
    controllerConfig.connect = true;
    controllerConfig.port = "/dev/ttyACM0";

    OpenCVConfig cvConfig = (OpenCVConfig) config.get(trackingConfig.cv);
    cvConfig.cameraIndex = 0;
    cvConfig.capturing = true;
    cvConfig.inputSource = "camera";
    cvConfig.grabberType = "OpenCV";

    ServoConfig panConfig = (ServoConfig) config.get(trackingConfig.pan);
    panConfig.pin = "7";
    panConfig.autoDisable = true;
    panConfig.idleTimeout = 3000; // AHAHAH - I did 3 originally
    panConfig.controller = controller;

    ServoConfig tiltConfig = (ServoConfig) config.get(trackingConfig.tilt);
    tiltConfig.pin = "5";
    tiltConfig.autoDisable = true;
    tiltConfig.idleTimeout = 3000;
    tiltConfig.controller = controller;

    PidConfig pidConfig = (PidConfig) config.get(trackingConfig.pid);
    PidData panData = new PidData();
    panData.kp = 0.015;
    panData.ki = 0.001;
    panData.kd = 0.0;

    pidConfig.data.put(trackingConfig.pan, panData);

    PidData tiltData = new PidData();
    tiltData.kp = 0.035;
    tiltData.ki = 0.001;
    tiltData.kd = 0.0;

    pidConfig.data.put(trackingConfig.tilt, tiltData);

    // put self in
    config.put(name, trackingConfig);

    return config;
  }  
  
}
