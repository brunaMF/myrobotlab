/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 19:05:20 GMT 2024
 */

package org.myrobotlab.logging;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.logging.Logging;
import org.myrobotlab.logging.LoggingSLF4J;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LoggingSLF4J_ESTest extends LoggingSLF4J_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LoggingSLF4J loggingSLF4J0 = new LoggingSLF4J();
      loggingSLF4J0.setLevel((String) null, (String) null);
      assertEquals(0L, Logging.startTimeMilliseconds);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LoggingSLF4J loggingSLF4J0 = new LoggingSLF4J();
      loggingSLF4J0.removeAllAppenders();
      assertFalse(Logging.performanceTiming);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LoggingSLF4J loggingSLF4J0 = new LoggingSLF4J();
      loggingSLF4J0.addAppender("console", "ey;IV%dU");
      assertEquals(0L, Logging.startTimeMilliseconds);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LoggingSLF4J loggingSLF4J0 = new LoggingSLF4J();
      loggingSLF4J0.addAppender("yUpL", "o!:'/x;");
      assertEquals(0L, Logging.startTimeMilliseconds);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LoggingSLF4J loggingSLF4J0 = new LoggingSLF4J();
      loggingSLF4J0.setLevel("error", "error");
      assertFalse(Logging.performanceTiming);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LoggingSLF4J loggingSLF4J0 = new LoggingSLF4J();
      loggingSLF4J0.setLevel("WARN", "WARN");
      assertFalse(Logging.performanceTiming);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LoggingSLF4J loggingSLF4J0 = new LoggingSLF4J();
      loggingSLF4J0.setLevel("trace", "trace");
      assertFalse(Logging.performanceTiming);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LoggingSLF4J loggingSLF4J0 = new LoggingSLF4J();
      loggingSLF4J0.setLevel("?,,&c6gwB(5#Ku>G9~", "o!:'/x;");
      assertEquals(0L, Logging.startTimeMilliseconds);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LoggingSLF4J loggingSLF4J0 = new LoggingSLF4J();
      loggingSLF4J0.setLevel("", "DEBUG");
      assertEquals(0L, Logging.startTimeMilliseconds);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LoggingSLF4J loggingSLF4J0 = new LoggingSLF4J();
      loggingSLF4J0.removeAppender("~opaK(Zw");
      assertEquals(0L, Logging.startTimeMilliseconds);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LoggingSLF4J loggingSLF4J0 = new LoggingSLF4J();
      String string0 = loggingSLF4J0.getLevel();
      //  // Unstable assertion: assertEquals("ERROR", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LoggingSLF4J loggingSLF4J0 = new LoggingSLF4J();
      loggingSLF4J0.removeAppender((Object) "INFO");
      assertEquals(0L, Logging.startTimeMilliseconds);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LoggingSLF4J loggingSLF4J0 = new LoggingSLF4J();
      Object object0 = new Object();
      loggingSLF4J0.addAppender(object0);
      assertEquals(0L, Logging.startTimeMilliseconds);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LoggingSLF4J loggingSLF4J0 = new LoggingSLF4J();
      loggingSLF4J0.addAppender("+\u0005NQQ@%!jlw>&VQ}");
      assertFalse(Logging.performanceTiming);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LoggingSLF4J loggingSLF4J0 = new LoggingSLF4J();
      loggingSLF4J0.setLevel("erro;");
      assertFalse(Logging.performanceTiming);
  }
}