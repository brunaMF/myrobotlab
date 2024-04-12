/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 01:42:48 GMT 2024
 */

package org.myrobotlab.math.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.math.geometry.Point3df;
import org.myrobotlab.math.geometry.PointCloud;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PointCloud_ESTest extends PointCloud_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PointCloud pointCloud0 = new PointCloud((Point3df[]) null);
      Point3df[] point3dfArray0 = pointCloud0.getData();
      assertNull(point3dfArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Point3df[] point3dfArray0 = new Point3df[0];
      PointCloud pointCloud0 = new PointCloud(point3dfArray0);
      Point3df[] point3dfArray1 = pointCloud0.getData();
      assertSame(point3dfArray1, point3dfArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PointCloud pointCloud0 = new PointCloud((Point3df[]) null);
      pointCloud0.colors = null;
      float[] floatArray0 = new float[9];
      pointCloud0.colors = floatArray0;
      float[] floatArray1 = pointCloud0.getColors();
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Point3df[] point3dfArray0 = new Point3df[6];
      PointCloud pointCloud0 = new PointCloud(point3dfArray0);
      float[] floatArray0 = pointCloud0.getColors();
      assertNull(floatArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Point3df[] point3dfArray0 = new Point3df[6];
      PointCloud pointCloud0 = new PointCloud(point3dfArray0);
      float[] floatArray0 = new float[0];
      pointCloud0.setColors(floatArray0);
      float[] floatArray1 = pointCloud0.getColors();
      assertEquals(0, floatArray1.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Point3df[] point3dfArray0 = new Point3df[6];
      PointCloud pointCloud0 = new PointCloud(point3dfArray0);
      Point3df[] point3dfArray1 = pointCloud0.getData();
      assertSame(point3dfArray1, point3dfArray0);
  }
}