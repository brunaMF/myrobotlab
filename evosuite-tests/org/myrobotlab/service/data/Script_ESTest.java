/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 04:19:49 GMT 2024
 */

package org.myrobotlab.service.data;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.service.data.Script;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Script_ESTest extends Script_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Script script0 = new Script("", "u<ma\"dN~");
      String string0 = script0.toString();
      assertEquals("Script{file='', code='u<ma\"dN~'}", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Script script0 = new Script("", "u<ma\"dN~");
      script0.hashCode();
      assertEquals("Script{file='', code='u<ma\"dN~'}", script0.toString());
  }
}
