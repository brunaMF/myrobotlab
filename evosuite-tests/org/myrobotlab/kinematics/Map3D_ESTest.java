/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 01:51:36 GMT 2024
 */

package org.myrobotlab.kinematics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.kinematics.Map3D;
import org.myrobotlab.kinematics.Map3DPoint;
import org.myrobotlab.kinematics.Point;
import org.myrobotlab.openni.OpenNiData;
import org.myrobotlab.openni.PVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Map3D_ESTest extends Map3D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Map3D map3D0 = new Map3D();
      map3D0.getCoordValue((-2036), (-2036), (-2537));
      assertEquals(480, map3D0.heighImage);
      assertEquals(10, map3D0.skip);
      assertEquals(2000, map3D0.maxDepthValue);
      assertEquals(1000, map3D0.fartestDistance);
      assertEquals(450, map3D0.closestDistance);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Map3D map3D0 = new Map3D();
      map3D0.cloudMapGroup = null;
      map3D0.getObject();
      assertEquals(1000, map3D0.fartestDistance);
      assertEquals(10, map3D0.skip);
      assertEquals(480, map3D0.heighImage);
      assertEquals(2000, map3D0.maxDepthValue);
      assertEquals(640, map3D0.widthImage);
      assertEquals(450, map3D0.closestDistance);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Map3D map3D0 = new Map3D();
      map3D0.widthImage = 16711680;
      map3D0.heighImage = (-1123);
      OpenNiData openNiData0 = new OpenNiData();
      // Undeclared exception!
      map3D0.processDepthMap(openNiData0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Map3D map3D0 = new Map3D();
      OpenNiData openNiData0 = new OpenNiData();
      PVector[] pVectorArray0 = new PVector[0];
      openNiData0.depthMapRW = pVectorArray0;
      // Undeclared exception!
      try { 
        map3D0.processDepthMap(openNiData0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 6410 out of bounds for length 0
         //
         verifyException("org.myrobotlab.kinematics.Map3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Map3D map3D0 = new Map3D();
      map3D0.cloudMap = null;
      // Undeclared exception!
      try { 
        map3D0.getCoordValue(480, 1000, 450);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.kinematics.Map3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Map3D map3D0 = new Map3D();
      map3D0.skip = 0;
      // Undeclared exception!
      try { 
        map3D0.getCoordValue(0, 0, 111);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.myrobotlab.kinematics.Map3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Map3D map3D0 = new Map3D();
      map3D0.cloudMap = null;
      // Undeclared exception!
      try { 
        map3D0.getCoordValue((double) 450, (double) 640, (double) 450);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.kinematics.Map3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Map3D map3D0 = new Map3D();
      map3D0.skip = 0;
      // Undeclared exception!
      try { 
        map3D0.getCoordValue((double) 0, (double) 0, (double) 480);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.myrobotlab.kinematics.Map3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Map3D map3D0 = new Map3D();
      assertEquals(480, map3D0.heighImage);
      
      map3D0.heighImage = (-6);
      OpenNiData openNiData0 = new OpenNiData();
      map3D0.processDepthMap(openNiData0);
      assertEquals(10, map3D0.skip);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Map3D map3D0 = new Map3D();
      OpenNiData openNiData0 = new OpenNiData();
      // Undeclared exception!
      try { 
        map3D0.processDepthMap(openNiData0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.kinematics.Map3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Map3D map3D0 = new Map3D();
      map3D0.updateKinectPosition((Point) null);
      assertEquals(1000, map3D0.fartestDistance);
      assertEquals(640, map3D0.widthImage);
      assertEquals(450, map3D0.closestDistance);
      assertEquals(2000, map3D0.maxDepthValue);
      assertEquals(480, map3D0.heighImage);
      assertEquals(10, map3D0.skip);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Map3D map3D0 = new Map3D();
      map3D0.getCoordValue((double) 0, (double) 0, 4148.295170445);
      assertEquals(1000, map3D0.fartestDistance);
      assertEquals(450, map3D0.closestDistance);
      assertEquals(10, map3D0.skip);
      assertEquals(2000, map3D0.maxDepthValue);
      assertEquals(480, map3D0.heighImage);
      assertEquals(640, map3D0.widthImage);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Map3D map3D0 = new Map3D();
      ArrayList<HashMap<Integer[], Map3DPoint>> arrayList0 = map3D0.getObject();
      HashMap<Integer[], Map3DPoint> hashMap0 = map3D0.cloudMap;
      arrayList0.add(hashMap0);
      map3D0.getObject();
      assertEquals(450, map3D0.closestDistance);
      assertEquals(10, map3D0.skip);
      assertEquals(1000, map3D0.fartestDistance);
      assertEquals(480, map3D0.heighImage);
      assertEquals(640, map3D0.widthImage);
      assertEquals(2000, map3D0.maxDepthValue);
  }
}
