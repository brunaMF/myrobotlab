/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 05:33:52 GMT 2024
 */

package org.saintandreas.gl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.EmptyStackException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.saintandreas.gl.MatrixStack;
import org.saintandreas.math.Matrix4f;
import org.saintandreas.math.Vector3f;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MatrixStack_ESTest extends MatrixStack_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.MODELVIEW;
      matrixStack0.set((Matrix4f) null);
      Matrix4f matrix4f0 = matrixStack0.top();
      assertNull(matrix4f0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      Vector3f vector3f0 = matrixStack0.getTranslation();
      matrixStack0.scale(vector3f0);
      Matrix4f matrix4f0 = matrixStack0.top();
      assertEquals(0.0F, matrix4f0.m03, 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      matrixStack0.push();
      MatrixStack matrixStack1 = matrixStack0.pop();
      assertSame(matrixStack0, matrixStack1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.PROJECTION;
      int int0 = matrixStack0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MatrixStack matrixStack0 = MatrixStack.MODELVIEW;
      Matrix4f matrix4f0 = matrixStack0.top();
      assertEquals(1.0F, matrix4f0.determinant(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MatrixStack matrixStack0 = new MatrixStack();
      // Undeclared exception!
      try { 
        matrixStack0.pop();
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }
}
