/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 03:03:56 GMT 2024
 */

package org.myrobotlab.arduino;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.arduino.DeviceSummary;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DeviceSummary_ESTest extends DeviceSummary_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DeviceSummary deviceSummary0 = new DeviceSummary("org.myrobotlab.arduino.DeviceSummary", (-2259));
      String string0 = deviceSummary0.toString();
      assertEquals("org.myrobotlab.arduino.DeviceSummary device id -2259", string0);
  }
}
