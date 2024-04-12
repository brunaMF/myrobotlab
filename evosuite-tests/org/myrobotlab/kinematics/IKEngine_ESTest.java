/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 01:59:29 GMT 2024
 */

package org.myrobotlab.kinematics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.kinematics.IKEngine;
import org.myrobotlab.kinematics.Matrix;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IKEngine_ESTest extends IKEngine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(44);
      iKEngine0.setLinkLength(1, (-176.4308863338194));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(0);
      iKEngine0.setLinkLength(0, (-1.0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(1);
      iKEngine0.numLinks = (-3669);
      double[] doubleArray0 = iKEngine0.getArmAngles();
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(26);
      iKEngine0.setGoal(0.01, 0.030391698785365018, 0.01);
      iKEngine0.calculate();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(2);
      Matrix matrix0 = iKEngine0.goal;
      iKEngine0.moveToGoal_NLink(matrix0);
      assertEquals(2, matrix0.getNumRows());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(250);
      iKEngine0.setGoal((-3116.0), 1983.77449817323, 0.0);
      double double0 = iKEngine0.getBaseAngle();
      assertEquals(147.51748298755734, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(250);
      iKEngine0.setGoal(250, (-1219.0), 0.0);
      double double0 = iKEngine0.getBaseAngle();
      assertEquals((-78.41013765482599), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(0);
      double[] doubleArray0 = iKEngine0.getArmAngles();
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(2);
      // Undeclared exception!
      try { 
        iKEngine0.setMode((-107));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -107
         //
         verifyException("org.myrobotlab.kinematics.IKEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(1);
      iKEngine0.goal = null;
      // Undeclared exception!
      try { 
        iKEngine0.setGoal(1, 1449.715264, 1449.715264);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.kinematics.IKEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(475);
      Matrix matrix0 = Matrix.yRotation(475);
      // Undeclared exception!
      iKEngine0.moveToGoal_NLink(matrix0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(1);
      // Undeclared exception!
      try { 
        iKEngine0.moveToGoal_NLink((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(2);
      Matrix matrix0 = iKEngine0.jInverse;
      matrix0.numCols = (-1);
      // Undeclared exception!
      try { 
        iKEngine0.moveToGoal_NLink(matrix0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -1
         //
         verifyException("org.myrobotlab.kinematics.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(0);
      // Undeclared exception!
      try { 
        iKEngine0.moveToGoal_NLink((Matrix) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(724);
      Matrix matrix0 = iKEngine0.jacobian;
      // Undeclared exception!
      iKEngine0.moveToGoal(matrix0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(1);
      // Undeclared exception!
      try { 
        iKEngine0.moveToGoal((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(26);
      Matrix matrix0 = new Matrix();
      matrix0.numRows = (-2402);
      // Undeclared exception!
      try { 
        iKEngine0.moveToGoal(matrix0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -2402
         //
         verifyException("org.myrobotlab.kinematics.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(0);
      Matrix matrix0 = iKEngine0.jInverse;
      // Undeclared exception!
      try { 
        iKEngine0.moveToGoal(matrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(2);
      iKEngine0.angles = null;
      // Undeclared exception!
      try { 
        iKEngine0.getArmAngles();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.kinematics.IKEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(2);
      double[] doubleArray0 = new double[0];
      iKEngine0.angles = doubleArray0;
      // Undeclared exception!
      try { 
        iKEngine0.getArmAngles();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("org.myrobotlab.kinematics.IKEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(100);
      // Undeclared exception!
      try { 
        iKEngine0.calculate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(42);
      iKEngine0.numLinks = (-819);
      // Undeclared exception!
      try { 
        iKEngine0.calculate();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -819
         //
         verifyException("org.myrobotlab.kinematics.IKEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(1111);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IKEngine iKEngine0 = null;
      try {
        iKEngine0 = new IKEngine((-3669));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -3669
         //
         verifyException("org.myrobotlab.kinematics.IKEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(0);
      iKEngine0.setMode(4);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(2);
      Matrix matrix0 = Matrix.yRotation(2);
      iKEngine0.moveToGoal(matrix0);
      assertEquals(4, matrix0.getNumRows());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(0);
      iKEngine0.safeToChangeInternalState = false;
      // Undeclared exception!
      iKEngine0.setMode(0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(4);
      iKEngine0.setLinkLength(1, 0.024952574981413955);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(2);
      iKEngine0.setLinkLength(1214, (-1573.0178255));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(2);
      iKEngine0.setLinkLength((-4088), 1.0E-4);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(2);
      iKEngine0.setLinkLength(1, 0.0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(2);
      iKEngine0.safeToChangeInternalState = false;
      // Undeclared exception!
      iKEngine0.setLinkLength(2, 2.0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(2);
      double[] doubleArray0 = iKEngine0.getArmAngles();
      assertArrayEquals(new double[] {0.0, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(2);
      iKEngine0.calculate();
      double[] doubleArray0 = iKEngine0.getArmAngles();
      assertArrayEquals(new double[] {3.6, 7.200000000000002}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(2);
      double double0 = iKEngine0.getBaseAngle();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(2);
      iKEngine0.setGoal(2, 2, 2);
      // Undeclared exception!
      iKEngine0.calculate();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IKEngine iKEngine0 = new IKEngine(0);
      // Undeclared exception!
      try { 
        iKEngine0.calculate();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
