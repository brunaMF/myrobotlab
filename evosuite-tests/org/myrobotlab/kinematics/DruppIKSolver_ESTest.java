/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 01:56:50 GMT 2024
 */

package org.myrobotlab.kinematics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.kinematics.DruppIKSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DruppIKSolver_ESTest extends DruppIKSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      double[] doubleArray0 = druppIKSolver0.solve(1417.631484221025, 1417.631484221025, 0.0);
      assertArrayEquals(new double[] {0.25870041690899254, (-2.1844779401093497), (-2.696619309105229)}, doubleArray0, 0.01);
      
      double double0 = druppIKSolver0.solveUp();
      assertEquals(0.25870041690899254, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      double[] doubleArray0 = druppIKSolver0.solve(120.0, 120.0, 689.0);
      assertArrayEquals(new double[] {0.2838799135293289, (-0.5426894192426562), 0.01669804506914572}, doubleArray0, 0.01);
      
      druppIKSolver0.C = 0.0;
      double double0 = druppIKSolver0.solveUp();
      assertEquals((-1.579992779350937), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      druppIKSolver0.initConstants();
      druppIKSolver0.M = 0.0;
      double double0 = druppIKSolver0.solveMiddle();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      double[] doubleArray0 = druppIKSolver0.solve(0.0, (-2848.179305007372), (-2848.179305007372));
      assertArrayEquals(new double[] {1.2452317985704449, 1.7157119244042034, (-0.4140847511286771)}, doubleArray0, 0.01);
      
      double double0 = druppIKSolver0.solveMiddle();
      assertEquals(1.7157119244042034, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      druppIKSolver0.initConstants();
      druppIKSolver0.P = 0.0;
      double double0 = druppIKSolver0.solveDown();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      double double0 = druppIKSolver0.deg2rad(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      double double0 = druppIKSolver0.deg2rad(534.33517315);
      assertEquals(9.325908080681499, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      druppIKSolver0.RPY = null;
      try { 
        druppIKSolver0.solve((-760.7001598059493), (-760.7001598059493), (-760.7001598059493));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.kinematics.DruppIKSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      double[] doubleArray0 = new double[0];
      druppIKSolver0.sols = doubleArray0;
      try { 
        druppIKSolver0.solve(2652.0, 2652.0, 2652.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("org.myrobotlab.kinematics.DruppIKSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      druppIKSolver0.RPY = null;
      // Undeclared exception!
      try { 
        druppIKSolver0.initConstants();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.kinematics.DruppIKSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      double[] doubleArray0 = new double[0];
      druppIKSolver0.centerXY = doubleArray0;
      // Undeclared exception!
      try { 
        druppIKSolver0.initConstants();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 2 out of bounds for length 0
         //
         verifyException("org.myrobotlab.kinematics.DruppIKSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      double[] doubleArray0 = druppIKSolver0.solve(1417.631484221025, 1417.631484221025, 0.0);
      assertArrayEquals(new double[] {0.25870041690899254, (-2.1844779401093497), (-2.696619309105229)}, doubleArray0, 0.01);
      
      double double0 = druppIKSolver0.solveDown();
      assertEquals((-2.696619309105229), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      druppIKSolver0.initConstants();
      double double0 = druppIKSolver0.solveDown();
      assertEquals(2.0943951023931957, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      double[] doubleArray0 = new double[3];
      druppIKSolver0.centerXY = doubleArray0;
      druppIKSolver0.initConstants();
      try { 
        druppIKSolver0.solveDown();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Failed to solve!
         //
         verifyException("org.myrobotlab.kinematics.DruppIKSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      double double0 = druppIKSolver0.deg2rad((-2.1844779401093497));
      assertEquals((-0.03812633249209165), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      druppIKSolver0.initConstants();
      double double0 = druppIKSolver0.solveUp();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      druppIKSolver0.C = 3.6534254813675564;
      try { 
        druppIKSolver0.solveUp();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Failed to solve
         //
         verifyException("org.myrobotlab.kinematics.DruppIKSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      druppIKSolver0.B = (-1170.395);
      try { 
        druppIKSolver0.solveUp();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      druppIKSolver0.B = 1538.34882624649;
      try { 
        druppIKSolver0.solveUp();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      try { 
        druppIKSolver0.solve(2.001223814, 0.0, 2.001223814);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Failed to solve
         //
         verifyException("org.myrobotlab.kinematics.DruppIKSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      druppIKSolver0.C = 3.6534254813675564;
      druppIKSolver0.N = 3.6534254813675564;
      double double0 = druppIKSolver0.solveMiddle();
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      druppIKSolver0.C = 3.6534254813675564;
      try { 
        druppIKSolver0.solveMiddle();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Failed to solve.
         //
         verifyException("org.myrobotlab.kinematics.DruppIKSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      druppIKSolver0.L = (-1.0);
      try { 
        druppIKSolver0.solveMiddle();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      druppIKSolver0.L = 22.01;
      try { 
        druppIKSolver0.solveMiddle();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      try { 
        druppIKSolver0.solveMiddle();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      try { 
        druppIKSolver0.solve(1.0, 1.0, 1.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Failed to solve.
         //
         verifyException("org.myrobotlab.kinematics.DruppIKSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      double[] doubleArray0 = druppIKSolver0.solve(0.0, (-2848.179305007372), (-2848.179305007372));
      druppIKSolver0.rl2 = (-2848.179305007372);
      druppIKSolver0.rl2 = (-2848.179305007372);
      druppIKSolver0.centerXY = doubleArray0;
      druppIKSolver0.p4 = doubleArray0;
      druppIKSolver0.rl2 = 0.0;
      try { 
        druppIKSolver0.solve(1662.6721243, 1.7157119244042034, 2390.144767074);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      druppIKSolver0.C = (-719.3997418028);
      try { 
        druppIKSolver0.solveDown();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Failed to solve!
         //
         verifyException("org.myrobotlab.kinematics.DruppIKSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      druppIKSolver0.O = (-43.72236821377199);
      try { 
        druppIKSolver0.solveDown();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      druppIKSolver0.O = 2133.710124454606;
      try { 
        druppIKSolver0.solveDown();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DruppIKSolver druppIKSolver0 = new DruppIKSolver();
      try { 
        druppIKSolver0.solveDown();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }
}
