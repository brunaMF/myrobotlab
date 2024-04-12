/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 04:30:20 GMT 2024
 */

package org.myrobotlab.service.data;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.service.data.AngleData;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AngleData_ESTest extends AngleData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Double double0 = new Double(1.0);
      AngleData angleData0 = new AngleData("org.myrobotlab.service.data.AngleData", double0);
      String string0 = angleData0.getName();
      assertEquals("org.myrobotlab.service.data.AngleData", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Double double0 = new Double(0.0);
      AngleData angleData0 = new AngleData("", double0);
      String string0 = angleData0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Double double0 = Double.valueOf(240.2978481613);
      AngleData angleData0 = new AngleData("", double0);
      Double double1 = angleData0.getAngle();
      assertEquals(240.2978481613, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AngleData angleData0 = new AngleData("", (Double) null);
      Double double0 = angleData0.getAngle();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Double double0 = new Double((-1.0));
      AngleData angleData0 = new AngleData("", double0);
      Double double1 = angleData0.getAngle();
      assertEquals((-1.0), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Double double0 = new Double(0.0);
      AngleData angleData0 = new AngleData((String) null, double0);
      String string0 = angleData0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Double double0 = new Double(0.0);
      AngleData angleData0 = new AngleData((String) null, double0);
      Double double1 = angleData0.getAngle();
      assertEquals(0.0, (double)double1, 0.01);
  }
}