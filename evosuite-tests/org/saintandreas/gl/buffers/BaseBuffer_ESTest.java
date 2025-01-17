/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 05:30:35 GMT 2024
 */

package org.saintandreas.gl.buffers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.saintandreas.gl.buffers.BaseBuffer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BaseBuffer_ESTest extends BaseBuffer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BaseBuffer baseBuffer0 = new BaseBuffer(1633, (-7652));
      // Undeclared exception!
      try { 
        baseBuffer0.destroy();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/lwjgl/opengl/GL15
         //
         verifyException("org.saintandreas.gl.buffers.BaseBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseBuffer baseBuffer0 = new BaseBuffer((-3429), 0);
      // Undeclared exception!
      try { 
        baseBuffer0.setData((ShortBuffer) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/lwjgl/opengl/GL15
         //
         verifyException("org.saintandreas.gl.buffers.BaseBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[7];
      IntBuffer intBuffer0 = IntBuffer.wrap(intArray0, 0, 0);
      BaseBuffer baseBuffer0 = new BaseBuffer(0, 1549);
      // Undeclared exception!
      try { 
        baseBuffer0.setData(intBuffer0, (-1066));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/lwjgl/opengl/GL15
         //
         verifyException("org.saintandreas.gl.buffers.BaseBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      float[] floatArray0 = new float[5];
      FloatBuffer floatBuffer0 = FloatBuffer.wrap(floatArray0);
      BaseBuffer baseBuffer0 = new BaseBuffer(1, (-1332));
      // Undeclared exception!
      try { 
        baseBuffer0.setData(floatBuffer0, 1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/lwjgl/opengl/GL15
         //
         verifyException("org.saintandreas.gl.buffers.BaseBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BaseBuffer baseBuffer0 = new BaseBuffer((-3461), (-3461));
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
      baseBuffer0.buffer = 1;
      // Undeclared exception!
      try { 
        baseBuffer0.setData(byteBuffer0, 35044);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/lwjgl/opengl/GL15
         //
         verifyException("org.saintandreas.gl.buffers.BaseBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BaseBuffer baseBuffer0 = new BaseBuffer(0, 2563);
      // Undeclared exception!
      try { 
        baseBuffer0.bind();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/lwjgl/opengl/GL15
         //
         verifyException("org.saintandreas.gl.buffers.BaseBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ShortBuffer shortBuffer0 = ShortBuffer.allocate(1);
      BaseBuffer baseBuffer0 = new BaseBuffer(1, 1);
      // Undeclared exception!
      try { 
        baseBuffer0.setData(shortBuffer0, 1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/lwjgl/opengl/GL15
         //
         verifyException("org.saintandreas.gl.buffers.BaseBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BaseBuffer baseBuffer0 = new BaseBuffer(1, 1);
      IntBuffer intBuffer0 = IntBuffer.allocate(1);
      // Undeclared exception!
      try { 
        baseBuffer0.setData(intBuffer0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/lwjgl/opengl/GL15
         //
         verifyException("org.saintandreas.gl.buffers.BaseBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        BaseBuffer.unbind(0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/lwjgl/opengl/GL15
         //
         verifyException("org.saintandreas.gl.buffers.BaseBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BaseBuffer baseBuffer0 = null;
      try {
        baseBuffer0 = new BaseBuffer(1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/lwjgl/opengl/GL15
         //
         verifyException("org.saintandreas.gl.buffers.BaseBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BaseBuffer baseBuffer0 = new BaseBuffer((-5896), (-5896));
      // Undeclared exception!
      try { 
        baseBuffer0.setData((FloatBuffer) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/lwjgl/opengl/GL15
         //
         verifyException("org.saintandreas.gl.buffers.BaseBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BaseBuffer baseBuffer0 = new BaseBuffer(2, 2);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(2);
      // Undeclared exception!
      try { 
        baseBuffer0.setData(byteBuffer0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/lwjgl/opengl/GL15
         //
         verifyException("org.saintandreas.gl.buffers.BaseBuffer", e);
      }
  }
}
