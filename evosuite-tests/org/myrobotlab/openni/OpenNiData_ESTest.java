/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 02:55:48 GMT 2024
 */

package org.myrobotlab.openni;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.openni.OpenNiData;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OpenNiData_ESTest extends OpenNiData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OpenNiData openNiData0 = new OpenNiData();
      assertEquals(0, openNiData0.frameNumber);
  }
}
