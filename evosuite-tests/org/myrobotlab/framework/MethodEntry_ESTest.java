/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 01:33:46 GMT 2024
 */

package org.myrobotlab.framework;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.framework.MethodEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MethodEntry_ESTest extends MethodEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MethodEntry methodEntry0 = null;
      try {
        methodEntry0 = new MethodEntry((Method) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.framework.MethodEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<MethodEntry> class0 = MethodEntry.class;
      Class<MethodEntry>[] classArray0 = (Class<MethodEntry>[]) Array.newInstance(Class.class, 3);
      classArray0[0] = class0;
      String string0 = MethodEntry.getPrettySignature((String) null, classArray0, classArray0[2]);
      assertEquals("null(MethodEntry,null,null) : ", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<MethodEntry> class0 = MethodEntry.class;
      String string0 = MethodEntry.getPrettySignature("W#- \"O!5c", (Class<?>[]) null, class0);
      assertEquals("W#- \"O!5c() : MethodEntry", string0);
  }
}
