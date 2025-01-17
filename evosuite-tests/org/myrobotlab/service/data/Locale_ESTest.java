/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 04:26:39 GMT 2024
 */

package org.myrobotlab.service.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.myrobotlab.service.data.Locale;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Locale_ESTest extends Locale_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Jh^-=Q'x");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "org.myrobotlab.logging.LoggerFactory");
      Properties properties0 = Locale.loadLocalizations("Jh^-=Q'x");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = new Locale("");
      String string0 = locale0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = new Locale(".E3hj]", "");
      locale0.tag = "";
      locale0.toString();
      assertEquals("", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.getDefault();
      locale0.tag = "";
      locale0.getTag();
      assertEquals("", locale0.getTag());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Map<String, Locale> map0 = Locale.getLocaleMap(stringArray0);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Map<String, Locale> map0 = Locale.getLanguageMap(stringArray0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = new Locale("en-US");
      assertEquals("en", locale0.getLanguage());
      
      locale0.language = null;
      locale0.getLanguage();
      assertEquals("en-US", locale0.getTag());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.getDefault();
      locale0.language = "";
      locale0.getLanguage();
      assertEquals("", locale0.getLanguage());
      assertEquals("en", locale0.getTag());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = new Locale("#)rq*;Af\"", "");
      String string0 = locale0.getDisplayLanguage();
      assertNotNull(string0);
      assertEquals("#)rq*;af\"", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = new Locale("\"@+$ZJ+Y4d", "");
      locale0.displayLanguage = "";
      String string0 = locale0.getDisplayLanguage();
      assertEquals("", locale0.getDisplayLanguage());
      assertNotNull(string0);
      assertEquals("\"@+$zj+y4d", locale0.getTag());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = new Locale("cn-ZH");
      String string0 = locale0.getDisplayCountry();
      assertEquals("ZH", string0);
      assertNotNull(string0);
      assertEquals("cn-ZH", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = new Locale("\"@+$ZJ+Y4d", "");
      locale0.displayCountry = "z.?";
      locale0.displayCountry = "";
      String string0 = locale0.getDisplayCountry();
      assertNotNull(string0);
      assertEquals("", locale0.getDisplayCountry());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = new Locale("en-US");
      String string0 = locale0.getCountry();
      assertEquals("US", string0);
      assertEquals("English", locale0.getDisplayLanguage());
      assertEquals("en-US", locale0.getTag());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = new Locale("=eUfe)D8");
      locale0.country = "";
      String string0 = locale0.getCountry();
      assertNotNull(string0);
      assertEquals("=eUfe)D8", locale0.getLanguage());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = new Locale("", "");
      // Undeclared exception!
      try { 
        locale0.transform();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Locale", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Map<String, Locale> map0 = Locale.getDefaults();
      // Undeclared exception!
      try { 
        Locale.hasLanguage(map0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        Locale.getLanguageMap(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Locale", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = null;
      try {
        locale0 = new Locale((java.util.Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.getDefault();
      String string0 = locale0.getLanguage();
      assertEquals("en", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.getDefault();
      String string0 = locale0.getTag();
      assertEquals("en", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = Locale.hasLanguage((Map<String, Locale>) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "c-";
      Map<String, Locale> map0 = Locale.getLocaleMap(stringArray0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        Locale.getLocaleMap(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Locale", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = new Locale("P-", (String) null);
      assertEquals("p", locale0.getTag());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = new Locale((String) null, "ZWVe$,k{\"v<AnU");
      String string0 = locale0.getTag();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Map<String, Locale> map0 = Locale.getAvailableLanguages();
      boolean boolean0 = Locale.hasLanguage(map0, (String) null);
      assertEquals(203, map0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = new Locale((String) null);
      assertEquals("English", locale0.getDisplayLanguage());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = new Locale(".E3hj]", "");
      String string0 = locale0.toString();
      assertEquals(".e3hj]", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "w";
      stringArray0[1] = "w";
      stringArray0[2] = "w";
      stringArray0[3] = "w";
      Map<String, Locale> map0 = Locale.getLanguageMap(stringArray0);
      boolean boolean0 = Locale.hasLanguage(map0, "w");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Properties properties0 = Locale.loadLocalizations("Pg+!7?");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Map<String, Locale> map0 = Locale.getDefaults();
      boolean boolean0 = Locale.hasLanguage(map0, "/aN&|");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = new Locale("\"@+$ZJ+Y4d", "");
      String string0 = locale0.getDisplayCountry();
      assertNull(string0);
      assertEquals("\"@+$zj+y4d", locale0.getTag());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.getDefault();
      java.util.Locale locale1 = locale0.transform();
      Locale locale2 = new Locale(locale1);
      assertEquals("English", locale2.getDisplayLanguage());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = new Locale("=eUfe)D8");
      String string0 = locale0.getCountry();
      assertNull(string0);
      assertEquals("=eUfe)D8", locale0.getLanguage());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = new Locale("", "");
      String string0 = locale0.getDisplayLanguage();
      assertNull(string0);
  }
}
