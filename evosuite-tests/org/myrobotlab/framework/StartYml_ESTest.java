/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 01:24:36 GMT 2024
 */

package org.myrobotlab.framework;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.framework.StartYml;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StartYml_ESTest extends StartYml_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StartYml startYml0 = new StartYml();
      assertFalse(startYml0.enable);
  }
}
