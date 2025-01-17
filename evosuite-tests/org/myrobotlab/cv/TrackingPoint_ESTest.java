/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 05:02:25 GMT 2024
 */

package org.myrobotlab.cv;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.cv.TrackingPoint;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TrackingPoint_ESTest extends TrackingPoint_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TrackingPoint trackingPoint0 = new TrackingPoint(5, 5, 1, 5, 1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TrackingPoint trackingPoint0 = new TrackingPoint(323, 4, 323, (-546), (-546));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TrackingPoint trackingPoint0 = new TrackingPoint((-1486), (-1486), (-1486), (-1486), (-1486));
      String string0 = trackingPoint0.toString();
      assertEquals("-1486 (-1486,-1486)->(-1486,-1486) found null error nu", string0);
  }
}
