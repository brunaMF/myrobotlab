/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 00:48:07 GMT 2024
 */

package org.myrobotlab.logging;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.logging.Logging;
import org.myrobotlab.logging.LoggingFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LoggingFactory_ESTest extends LoggingFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LoggingFactory.setLogFile((String) null);
      String string0 = LoggingFactory.getLogFileName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LoggingFactory.setLogFile("");
      String string0 = LoggingFactory.getLogFileName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Logging logging0 = LoggingFactory.getInstance();
      assertEquals(0L, Logging.startTimeMilliseconds);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LoggingFactory.setLogFile((String) null);
      LoggingFactory.setLevel("");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LoggingFactory.setLogFile((String) null);
      LoggingFactory.setLevel((String) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LoggingFactory loggingFactory0 = new LoggingFactory();
      assertEquals("myrobotlab.log", loggingFactory0.getLogFileName());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = LoggingFactory.getLogLevel();
      assertEquals("INFO", string0);
  }
}
