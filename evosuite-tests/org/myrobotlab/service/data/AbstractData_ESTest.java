/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 04:24:13 GMT 2024
 */

package org.myrobotlab.service.data;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.service.data.RangeData;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractData_ESTest extends AbstractData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Double double0 = new Double((-1.0));
      RangeData rangeData0 = new RangeData("org.myrobotlab.service.data.RangeData", double0);
  }
}