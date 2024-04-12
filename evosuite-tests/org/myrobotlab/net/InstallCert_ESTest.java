/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 05:11:09 GMT 2024
 */

package org.myrobotlab.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.myrobotlab.net.InstallCert;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InstallCert_ESTest extends InstallCert_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      try { 
        InstallCert.install("org.myrobotlab.logging.LoggerFactory", "org.myrobotlab.logging.LoggerFactory", (String) null);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      try { 
        InstallCert.install("[8", (String) null, "[8");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[6];
      InstallCert.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = ":";
      // Undeclared exception!
      try { 
        InstallCert.main(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("org.myrobotlab.net.InstallCert", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("jssecacerts");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        InstallCert.main(stringArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("jssecacerts");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "TLS");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "TLS";
      try { 
        InstallCert.main(stringArray0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("jssecacerts");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      try { 
        InstallCert.install("", "", "");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("jssecacerts");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Could not obtain server certificate chain");
      try { 
        InstallCert.install("Could not obtain server certificate chain", "Could not obtain server certificate chain", "Could not obtain server certificate chain");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("jssecacerts");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      try { 
        InstallCert.install("", (Integer) null, "");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("jssecacerts");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "org.myrobotlab.logging.LoggerFactory");
      try { 
        InstallCert.install("org.myrobotlab.logging.LoggerFactory", (Integer) null, "org.myrobotlab.logging.LoggerFactory");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("jssecacerts");
      FileSystemHandling.createFolder(evoSuiteFile0);
      Integer integer0 = new Integer(255);
      try { 
        InstallCert.install("71oy/ut,", integer0, (String) null);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/usr/lib/jvm/java-11-openjdk-amd64/lib/security/jssecacerts");
      FileSystemHandling.createFolder(evoSuiteFile0);
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("jssecacerts");
      FileSystemHandling.createFolder(evoSuiteFile1);
      Integer integer0 = new Integer((-1308));
      try { 
        InstallCert.install("\"\"8U-^=tlaaK}OJ#l%", integer0, "\"\"8U-^=tlaaK}OJ#l%");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      try { 
        InstallCert.install("", integer0, "");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "TzS8 9";
      try { 
        InstallCert.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.myrobotlab.loggiJ:LogOe'acEoky";
      // Undeclared exception!
      try { 
        InstallCert.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"LogOe'acEoky\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        InstallCert.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.net.InstallCert", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[0];
      InstallCert.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      try { 
        InstallCert.install("$");
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: $
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      try { 
        InstallCert.install("", "");
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: 
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InstallCert installCert0 = new InstallCert();
  }
}