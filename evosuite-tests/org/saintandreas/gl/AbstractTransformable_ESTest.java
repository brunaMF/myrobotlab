/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 05:27:23 GMT 2024
 */

package org.saintandreas.gl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.saintandreas.gl.MatrixStack;
import org.saintandreas.math.Matrix3f;
import org.saintandreas.math.Matrix4f;
import org.saintandreas.math.Quaternion;
import org.saintandreas.math.Vector2f;
import org.saintandreas.math.Vector3f;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractTransformable_ESTest extends AbstractTransformable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.MODELVIEW;
      MatrixStack matrixStack1 = matrixStack0.perspective((-1462.7F), (-1462.7F), (-2028.9108F), (-2028.9108F));
      assertSame(matrixStack1, matrixStack0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      MatrixStack matrixStack1 = matrixStack0.perspective(1.0F, 0.0F, 0.0F, 0.0F);
      assertSame(matrixStack0, matrixStack1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.MODELVIEW;
      MatrixStack matrixStack1 = matrixStack0.orthographic(1.0E-4F, (-1.0F), (-2219.0F), (-2219.0F), 0.0F, 267.1F);
      assertSame(matrixStack1, matrixStack0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      Vector3f vector3f0 = new Vector3f(0.0F, (-1.5707964F), 0.5F);
      // Undeclared exception!
      try { 
        matrixStack0.lookat(vector3f0, vector3f0, (Vector3f) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.math.Vector3f", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      Vector2f vector2f0 = Vector2f.UNIT_XY;
      Vector3f vector3f0 = vector2f0.cross(vector2f0);
      Vector3f vector3f1 = Vector3f.ZERO;
      MatrixStack matrixStack1 = matrixStack0.lookat(vector3f0, vector3f1, vector3f0);
      assertSame(matrixStack0, matrixStack1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.MODELVIEW;
      Vector2f vector2f0 = new Vector2f((-5019.3F), (-2.0F));
      Vector3f vector3f0 = new Vector3f(vector2f0, Float.NaN);
      MatrixStack matrixStack1 = matrixStack0.translate(vector3f0);
      assertSame(matrixStack0, matrixStack1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      Matrix3f matrix3f0 = Matrix3f.ZERO;
      MatrixStack matrixStack1 = matrixStack0.rotate(matrix3f0);
      assertSame(matrixStack1, matrixStack0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.MODELVIEW;
      Vector3f vector3f0 = matrixStack0.getTranslation();
      MatrixStack matrixStack1 = matrixStack0.preTranslate(vector3f0);
      assertSame(matrixStack1, matrixStack0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.MODELVIEW;
      Vector2f vector2f0 = Vector2f.ZERO;
      MatrixStack matrixStack1 = matrixStack0.preTranslate(vector2f0);
      assertSame(matrixStack1, matrixStack0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      Vector3f vector3f0 = matrixStack0.getTranslation();
      MatrixStack matrixStack1 = matrixStack0.preRotate(0.0F, vector3f0);
      assertSame(matrixStack0, matrixStack1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      Matrix4f matrix4f0 = matrixStack0.top();
      MatrixStack matrixStack1 = matrixStack0.preMultiply(matrix4f0);
      assertSame(matrixStack1, matrixStack0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.MODELVIEW;
      Matrix4f matrix4f0 = Matrix4f.perspective(163.749F, 163.749F, 163.749F, (-1.0F));
      matrixStack0.multiply(matrix4f0);
      Vector3f vector3f0 = matrixStack0.getTranslation();
      assertEquals((-1.9878603F), vector3f0.z, 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.MODELVIEW;
      Vector3f vector3f0 = Vector3f.NAN;
      Matrix3f matrix3f0 = new Matrix3f(vector3f0, vector3f0, vector3f0);
      MatrixStack matrixStack1 = matrixStack0.preRotate(matrix3f0);
      Vector3f vector3f1 = matrixStack1.getTranslation();
      assertEquals(Float.NaN, vector3f1.z, 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.PROJECTION;
      Vector2f vector2f0 = new Vector2f((-1.0F));
      matrixStack0.translate(vector2f0);
      Vector3f vector3f0 = matrixStack0.getTranslation();
      assertEquals((-1.0F), vector3f0.x, 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      matrixStack0.preTranslate(3590.0F);
      Vector3f vector3f0 = matrixStack0.getTranslation();
      assertEquals("(3590.0, 0.0, 0.0)", vector3f0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.MODELVIEW;
      Vector3f vector3f0 = Vector3f.UNIT_Y;
      matrixStack0.scale(vector3f0);
      Matrix4f matrix4f0 = matrixStack0.getTransform();
      assertEquals(0.0F, matrix4f0.m22, 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.MODELVIEW;
      Quaternion quaternion0 = new Quaternion(1216.1023F, 667.0F, 0.1F, 0.0F);
      Vector3f vector3f0 = new Vector3f(0.0F, 0.1F, 0.0F);
      Vector3f vector3f1 = quaternion0.mult(vector3f0);
      Matrix3f matrix3f0 = new Matrix3f(vector3f1, vector3f0, vector3f0);
      matrixStack0.preRotate(matrix3f0);
      Quaternion quaternion1 = matrixStack0.getRotation();
      assertEquals((-0.53748524F), quaternion1.z, 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      matrixStack0.scale((-3500.6763F));
      Quaternion quaternion0 = matrixStack0.getRotation();
      assertEquals(0.0F, quaternion0.w, 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      matrixStack0.orthographic(0.0F, (-1721.5F), (-1.5707964F), (-1721.5F), 3367.0F, (-4021.32F));
      Vector3f vector3f0 = new Vector3f(0.0F, (-1.5707964F), 0.5F);
      Quaternion quaternion0 = Quaternion.fromAngleNormalAxis(0.5F, vector3f0);
      matrixStack0.rotate(quaternion0);
      Quaternion quaternion1 = matrixStack0.getRotation();
      assertEquals((-2.5184828E-4F), quaternion1.w, 0.01F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      MatrixStack matrixStack1 = matrixStack0.set((Matrix4f) null);
      // Undeclared exception!
      try { 
        matrixStack1.untranslate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.gl.AbstractTransformable", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      matrixStack0.set((Matrix4f) null);
      // Undeclared exception!
      try { 
        matrixStack0.unrotate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.gl.AbstractTransformable", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.MODELVIEW;
      // Undeclared exception!
      try { 
        matrixStack0.scale((Vector3f) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.math.Matrix4f", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.PROJECTION;
      matrixStack0.set((Matrix4f) null);
      // Undeclared exception!
      try { 
        matrixStack0.scale(0.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.gl.AbstractTransformable", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.MODELVIEW;
      // Undeclared exception!
      try { 
        matrixStack0.rotate(1.1920929E-7F, (Vector3f) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.math.Quaternion", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      matrixStack0.transform = null;
      // Undeclared exception!
      try { 
        matrixStack0.preTranslate(0.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.math.Matrix4f", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      // Undeclared exception!
      try { 
        matrixStack0.preRotate((Quaternion) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.math.Matrix4f", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      // Undeclared exception!
      try { 
        matrixStack0.preRotate((Matrix3f) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.math.Quaternion", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      matrixStack0.transform = null;
      // Undeclared exception!
      try { 
        matrixStack0.getTranslation();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.gl.AbstractTransformable", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.PROJECTION;
      // Undeclared exception!
      try { 
        matrixStack0.translate((Vector3f) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.math.Matrix4f", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      // Undeclared exception!
      try { 
        matrixStack0.preMultiply((Matrix4f) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.gl.AbstractTransformable", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.MODELVIEW;
      Matrix4f matrix4f0 = matrixStack0.getTransform();
      assertEquals(1.0F, matrix4f0.determinant(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.MODELVIEW;
      matrixStack0.set((Matrix4f) null);
      Matrix4f matrix4f0 = matrixStack0.getTransform();
      assertNull(matrix4f0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.PROJECTION;
      // Undeclared exception!
      try { 
        matrixStack0.preTranslate((Vector2f) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.math.Vector3f", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      Vector3f vector3f0 = matrixStack0.getTranslation();
      MatrixStack matrixStack1 = matrixStack0.rotate(0.0F, vector3f0);
      assertSame(matrixStack1, matrixStack0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      // Undeclared exception!
      try { 
        matrixStack0.multiply((Matrix4f) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.math.Matrix4f", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      Quaternion quaternion0 = matrixStack0.getRotation();
      MatrixStack matrixStack1 = matrixStack0.preRotate(quaternion0);
      assertSame(matrixStack1, matrixStack0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      MatrixStack matrixStack1 = matrixStack0.identity();
      assertSame(matrixStack0, matrixStack1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.PROJECTION;
      // Undeclared exception!
      try { 
        matrixStack0.preRotate(0.0F, (Vector3f) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.math.Quaternion", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      MatrixStack matrixStack1 = matrixStack0.untranslate();
      assertSame(matrixStack1, matrixStack0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      // Undeclared exception!
      try { 
        matrixStack0.preTranslate((Vector3f) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.math.Matrix4f", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      MatrixStack matrixStack1 = matrixStack0.transpose();
      assertSame(matrixStack0, matrixStack1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.MODELVIEW;
      // Undeclared exception!
      try { 
        matrixStack0.translate((Vector2f) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.math.Vector3f", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      // Undeclared exception!
      try { 
        matrixStack0.rotate((Quaternion) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.math.Matrix4f", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.PROJECTION;
      MatrixStack matrixStack1 = matrixStack0.translate(0.0F);
      assertSame(matrixStack0, matrixStack1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      // Undeclared exception!
      try { 
        matrixStack0.rotate((Matrix3f) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.saintandreas.math.Quaternion", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      MatrixStack matrixStack1 = matrixStack0.unrotate();
      assertSame(matrixStack1, matrixStack0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      matrixStack0.perspective((-2808.832F), (-2808.832F), (-2808.832F), 1425.0104F);
      Matrix4f matrix4f0 = matrixStack0.getTransform();
      assertEquals((-1.3148785F), matrix4f0.determinant(), 0.01F);
      assertEquals(-0.0F, matrix4f0.m12, 0.01F);
  }
}
