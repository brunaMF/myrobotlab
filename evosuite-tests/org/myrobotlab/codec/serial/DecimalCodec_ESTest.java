/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 04:09:08 GMT 2024
 */

package org.myrobotlab.codec.serial;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.codec.serial.DecimalCodec;
import org.myrobotlab.framework.interfaces.LoggingSink;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DecimalCodec_ESTest extends DecimalCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DecimalCodec decimalCodec0 = new DecimalCodec((LoggingSink) null);
      String string0 = decimalCodec0.getKey();
      assertEquals("decimal", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DecimalCodec decimalCodec0 = new DecimalCodec((LoggingSink) null);
      decimalCodec0.width = 1;
      String string0 = decimalCodec0.decodeImpl(259);
      assertEquals("003 \n", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DecimalCodec decimalCodec0 = new DecimalCodec((LoggingSink) null);
      String string0 = decimalCodec0.decodeImpl((-1158));
      assertEquals("122 ", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DecimalCodec decimalCodec0 = new DecimalCodec((LoggingSink) null);
      int[] intArray0 = decimalCodec0.encode(" Ne[~7/5[.('p|b.[#");
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DecimalCodec decimalCodec0 = new DecimalCodec((LoggingSink) null);
      String string0 = decimalCodec0.decode((int[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DecimalCodec decimalCodec0 = new DecimalCodec((LoggingSink) null);
      assertEquals("decimal", decimalCodec0.getKey());
      
      String string0 = decimalCodec0.getCodecExt();
      assertEquals("dec", string0);
  }
}