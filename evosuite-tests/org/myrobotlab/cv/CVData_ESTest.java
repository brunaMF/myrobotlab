/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 05:01:21 GMT 2024
 */

package org.myrobotlab.cv;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.cv.CVData;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CVData_ESTest extends CVData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[7];
      CVData.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }
}