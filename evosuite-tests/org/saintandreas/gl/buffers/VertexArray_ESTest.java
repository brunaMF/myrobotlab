/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 05:28:27 GMT 2024
 */

package org.saintandreas.gl.buffers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.saintandreas.gl.buffers.VertexArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class VertexArray_ESTest extends VertexArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VertexArray vertexArray0 = null;
      try {
        vertexArray0 = new VertexArray();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/lwjgl/opengl/GL30
         //
         verifyException("org.saintandreas.gl.buffers.VertexArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        VertexArray.unbind();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/lwjgl/opengl/GL30
         //
         verifyException("org.saintandreas.gl.buffers.VertexArray", e);
      }
  }
}
