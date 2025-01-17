/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 03:23:14 GMT 2024
 */

package org.myrobotlab.service.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.service.interfaces.ServoEvent;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ServoEvent_ESTest extends ServoEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ServoEvent servoEvent0 = new ServoEvent("Q\"CmF", (Double) null);
      String string0 = servoEvent0.toString();
      assertEquals("Q\"CmF null", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Double double0 = Double.valueOf("9");
      ServoEvent servoEvent0 = new ServoEvent("9", double0);
      String string0 = servoEvent0.toString();
      assertEquals("9 9.00", string0);
  }
}
