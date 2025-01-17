/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 03:01:35 GMT 2024
 */

package org.myrobotlab.image;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import org.myrobotlab.image.SerializableImage;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SerializableImage_ESTest extends SerializableImage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SerializableImage serializableImage0 = new SerializableImage((BufferedImage) null, "object.data");
      serializableImage0.writeToFile(".ivy");
      assertEquals(0, serializableImage0.frameIndex);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      SerializableImage serializableImage0 = new SerializableImage(bufferedImage0, "object.data");
      serializableImage0.writeToFile("org.myrobotlab.io.FindFile$RegexFilter");
      assertEquals(1, serializableImage0.getHeight());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String[] stringArray0 = new String[0];
          SerializableImage.main(stringArray0);
          assertEquals(0, stringArray0.length);
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      SerializableImage serializableImage0 = new SerializableImage((byte[]) null, "png", (-911));
      serializableImage0.getTimestamp();
      assertEquals((-911), serializableImage0.frameIndex);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SerializableImage serializableImage0 = new SerializableImage((byte[]) null, "", (-1094));
      serializableImage0.setTimestamp((-1094));
      long long0 = serializableImage0.getTimestamp();
      assertEquals((-1094L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SerializableImage serializableImage0 = new SerializableImage((byte[]) null, "$m(m3O z2et/nl,", 2);
      serializableImage0.getSource();
      assertEquals(2, serializableImage0.frameIndex);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      SerializableImage serializableImage0 = new SerializableImage(byteArray0, "", (byte)2);
      serializableImage0.getSource();
      assertEquals(2, serializableImage0.frameIndex);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(4, 4, 4);
      SerializableImage serializableImage0 = new SerializableImage(bufferedImage0, "aI>g2etwxH /P");
      bufferedImage0.setAccelerationPriority(0);
      BufferedImage bufferedImage1 = serializableImage0.getImage();
      assertEquals(0, bufferedImage1.getTileGridYOffset());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SerializableImage serializableImage0 = new SerializableImage((BufferedImage) null, "otLe\"E[3^+");
      // Undeclared exception!
      try { 
        serializableImage0.getWidth();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.image.SerializableImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SerializableImage serializableImage0 = new SerializableImage((BufferedImage) null, "");
      // Undeclared exception!
      try { 
        serializableImage0.getHeight();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.image.SerializableImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SerializableImage.writeToFile((BufferedImage) null, " #=-`Ghs");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(3, 3, 3);
      SerializableImage serializableImage0 = new SerializableImage(bufferedImage0, (String) null);
      BufferedImage bufferedImage1 = serializableImage0.getImage();
      assertEquals(0, bufferedImage1.getMinY());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SerializableImage serializableImage0 = new SerializableImage((BufferedImage) null, "object.data");
      BufferedImage bufferedImage0 = serializableImage0.getImage();
      assertNull(bufferedImage0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SerializableImage serializableImage0 = new SerializableImage((BufferedImage) null, "object.data");
      byte[] byteArray0 = serializableImage0.getBytes();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(10);
      SerializableImage serializableImage0 = new SerializableImage(byteBuffer0, "B:&b7", 10);
      serializableImage0.getBytes();
      assertEquals(10, byteBuffer0.position());
      assertFalse(byteBuffer0.hasRemaining());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      SerializableImage serializableImage0 = new SerializableImage(byteArray0, "writeObject", (-1149));
      byte[] byteArray1 = serializableImage0.getBytes();
      assertEquals((-1149), serializableImage0.frameIndex);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(3, 3, 3);
      SerializableImage serializableImage0 = new SerializableImage(bufferedImage0, (String) null);
      // Undeclared exception!
      try { 
        serializableImage0.getBytes();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SerializableImage.writeToFile((BufferedImage) null, "object.data");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(4, 4, 4);
      SerializableImage serializableImage0 = new SerializableImage(bufferedImage0, "");
      int int0 = serializableImage0.getHeight();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SerializableImage serializableImage0 = new SerializableImage((BufferedImage) null, "object.data");
      ByteBuffer byteBuffer0 = serializableImage0.getByteBuffer();
      assertNull(byteBuffer0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2);
      SerializableImage serializableImage0 = new SerializableImage(byteBuffer0, "w", 2);
      serializableImage0.getImage();
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(2, serializableImage0.frameIndex);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SerializableImage serializableImage0 = new SerializableImage((BufferedImage) null, "object.data");
      serializableImage0.setSource("");
      assertEquals(1392409281320L, serializableImage0.getTimestamp());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      SerializableImage serializableImage0 = new SerializableImage(bufferedImage0, "readObject", 1);
      serializableImage0.getWidth();
      assertEquals(1, serializableImage0.frameIndex);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SerializableImage serializableImage0 = new SerializableImage((BufferedImage) null, "object.data");
      serializableImage0.setImage((BufferedImage) null);
      assertEquals(0, serializableImage0.frameIndex);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SerializableImage serializableImage0 = new SerializableImage((BufferedImage) null, (String) null);
      String string0 = serializableImage0.getSource();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      SerializableImage serializableImage0 = new SerializableImage(byteArray0, "T~&", 46);
      serializableImage0.getImage();
      assertEquals(46, serializableImage0.frameIndex);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      SerializableImage serializableImage0 = new SerializableImage(bufferedImage0, ".Z3");
      long long0 = serializableImage0.getTimestamp();
      assertEquals(1392409281320L, long0);
  }
}
