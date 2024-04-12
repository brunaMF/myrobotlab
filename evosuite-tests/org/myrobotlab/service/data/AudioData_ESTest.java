/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 04:30:57 GMT 2024
 */

package org.myrobotlab.service.data;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.InputStream;
import java.io.PipedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.myrobotlab.service.data.AudioData;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AudioData_ESTest extends AudioData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AudioData audioData0 = new AudioData("5%R:t6_Xyw5hL~m~5M");
      audioData0.mode = "blocking";
      String string0 = audioData0.toString();
      assertEquals("file : 5%R:t6_Xyw5hL~m~5M  mode : blocking trackId : 1392409281320001 ", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AudioData audioData0 = new AudioData("");
      Integer integer0 = Integer.valueOf((-38));
      audioData0.repeat = integer0;
      String string0 = audioData0.toString();
      assertEquals("file :   mode : queued trackId : 1392409281320001 repeat -38 times", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AudioData audioData0 = new AudioData("5%R:t6_Xyw5hL~m~5M");
      assertEquals("5%R:t6_Xyw5hL~m~5M", audioData0.getFileName());
      assertEquals(1392409281320001L, audioData0.trackId);
      
      AudioData audioData1 = new AudioData((InputStream) null);
      assertEquals(1392409281320002L, audioData1.trackId);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AudioData audioData0 = new AudioData("");
      assertEquals("", audioData0.getFileName());
      
      AudioData audioData1 = new AudioData("queued");
      assertEquals(1392409281320002L, audioData1.trackId);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AudioData audioData0 = new AudioData("5%R:t6_Xyw5hL~m~5M");
      audioData0.startTs = (Long) 1615L;
      audioData0.stopTs = audioData0.startTs;
      Long long0 = audioData0.getLength();
      assertEquals(0L, (long)long0);
      assertEquals("5%R:t6_Xyw5hL~m~5M", audioData0.getFileName());
      assertEquals(1392409281320001L, audioData0.trackId);
      assertNotNull(long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AudioData audioData0 = new AudioData((String) null);
      String string0 = audioData0.getFileName();
      assertNull(string0);
      assertEquals(1392409281320001L, audioData0.trackId);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AudioData audioData0 = new AudioData(" will be added");
      String string0 = audioData0.getFileName();
      assertEquals(1392409281320001L, audioData0.trackId);
      assertEquals(" will be added", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AudioData audioData0 = new AudioData("");
      Integer integer0 = Integer.valueOf((-1));
      audioData0.repeat = integer0;
      String string0 = audioData0.toString();
      assertEquals("file :   mode : queued trackId : 1392409281320001 repeat forever", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AudioData audioData0 = new AudioData("OPkS");
      Integer integer0 = Integer.valueOf(2634);
      audioData0.repeat = integer0;
      String string0 = audioData0.toString();
      assertEquals("file : OPkS  mode : queued trackId : 1392409281320001 repeat 2634 times", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AudioData audioData0 = new AudioData("5%R:t6_Xyw5hL~m~5M");
      audioData0.stopTs = null;
      audioData0.startTs = (Long) 1615L;
      audioData0.stopTs = (Long) 1392409281320001L;
      Long long0 = audioData0.getLength();
      assertNotNull(long0);
      assertEquals(1392409281318386L, (long)long0);
      assertEquals(1392409281320001L, audioData0.trackId);
      assertEquals("5%R:t6_Xyw5hL~m~5M", audioData0.getFileName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AudioData audioData0 = new AudioData("5%R:t6_Xyw5hL~m~5M");
      audioData0.startTs = (Long) 1615L;
      audioData0.getLength();
      assertEquals(1392409281320001L, audioData0.trackId);
      assertEquals("5%R:t6_Xyw5hL~m~5M", audioData0.getFileName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AudioData audioData0 = new AudioData("");
      audioData0.getLength();
      assertEquals(1392409281320001L, audioData0.trackId);
      assertEquals("", audioData0.getFileName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("x[:wI#2bY-'Q");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "file : %s  mode : %s trackId : %d %s");
      AudioData audioData0 = new AudioData("x[:wI#2bY-'Q");
      boolean boolean0 = audioData0.isValid();
      assertTrue(boolean0);
      assertEquals(1392409281320001L, audioData0.trackId);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("x[:wI#2bY-'Q");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      AudioData audioData0 = new AudioData("x[:wI#2bY-'Q");
      boolean boolean0 = audioData0.isValid();
      assertEquals("x[:wI#2bY-'Q", audioData0.getFileName());
      assertEquals(1392409281320001L, audioData0.trackId);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AudioData audioData0 = new AudioData("");
      boolean boolean0 = audioData0.isValid();
      assertEquals("", audioData0.getFileName());
      assertEquals(1392409281320001L, audioData0.trackId);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AudioData audioData0 = new AudioData((String) null);
      boolean boolean0 = audioData0.isValid();
      assertEquals(1392409281320001L, audioData0.trackId);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      AudioData audioData0 = new AudioData(pipedInputStream0);
      boolean boolean0 = audioData0.isValid();
      assertTrue(boolean0);
      assertEquals(1392409281320001L, audioData0.trackId);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AudioData audioData0 = new AudioData("5%R:t6_Xyw5hL~m~5M");
      boolean boolean0 = audioData0.isValid();
      assertEquals("5%R:t6_Xyw5hL~m~5M", audioData0.getFileName());
      assertEquals(1392409281320001L, audioData0.trackId);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AudioData audioData0 = new AudioData("");
      String string0 = audioData0.getFileName();
      assertNotNull(string0);
      assertEquals("", string0);
      assertEquals(1392409281320001L, audioData0.trackId);
  }
}