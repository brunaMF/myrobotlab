/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 01:44:57 GMT 2024
 */

package org.myrobotlab.math.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.math.geometry.Rectangle;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Rectangle_ESTest extends Rectangle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(3420.5256F, 1815.03F, (-2381.0F), (-1023.0F));
      String string0 = rectangle0.toString();
      assertEquals("x 3420.53 y 1815.03 w -2381.00 h -1023.00", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      String string0 = rectangle0.toString();
      assertEquals("x 0.00 y 0.00 w 0.00 h 0.00", string0);
  }
}
