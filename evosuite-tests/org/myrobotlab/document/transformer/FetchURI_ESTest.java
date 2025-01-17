/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 02:47:01 GMT 2024
 */

package org.myrobotlab.document.transformer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.document.Document;
import org.myrobotlab.document.transformer.FetchURI;
import org.myrobotlab.document.transformer.StageConfiguration;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FetchURI_ESTest extends FetchURI_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FetchURI fetchURI0 = new FetchURI();
      fetchURI0.setUriField((String) null);
      fetchURI0.getUriField();
      assertEquals("bytes", fetchURI0.getBytesField());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FetchURI fetchURI0 = new FetchURI();
      fetchURI0.setBytesField((String) null);
      String string0 = fetchURI0.getBytesField();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FetchURI fetchURI0 = new FetchURI();
      StageConfiguration stageConfiguration0 = new StageConfiguration();
      stageConfiguration0.config = null;
      // Undeclared exception!
      try { 
        fetchURI0.startStage(stageConfiguration0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.document.transformer.StageConfiguration", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FetchURI fetchURI0 = new FetchURI();
      Document document0 = new Document("DROP");
      // Undeclared exception!
      try { 
        fetchURI0.processDocument(document0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.document.transformer.FetchURI", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FetchURI fetchURI0 = new FetchURI();
      StageConfiguration stageConfiguration0 = new StageConfiguration();
      fetchURI0.startStage(stageConfiguration0);
      assertEquals("uri", fetchURI0.getUriField());
      assertEquals("bytes", fetchURI0.getBytesField());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FetchURI fetchURI0 = new FetchURI();
      fetchURI0.startStage((StageConfiguration) null);
      assertEquals("bytes", fetchURI0.getBytesField());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FetchURI fetchURI0 = new FetchURI();
      fetchURI0.flush();
      assertEquals("bytes", fetchURI0.getBytesField());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FetchURI fetchURI0 = new FetchURI();
      fetchURI0.setUriField("");
      fetchURI0.getUriField();
      assertEquals("bytes", fetchURI0.getBytesField());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FetchURI fetchURI0 = new FetchURI();
      String string0 = fetchURI0.getBytesField();
      assertEquals("bytes", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FetchURI fetchURI0 = new FetchURI();
      fetchURI0.stopStage();
      assertEquals("bytes", fetchURI0.getBytesField());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FetchURI fetchURI0 = new FetchURI();
      fetchURI0.setBytesField("");
      String string0 = fetchURI0.getBytesField();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FetchURI fetchURI0 = new FetchURI();
      fetchURI0.getUriField();
      assertEquals("bytes", fetchURI0.getBytesField());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FetchURI fetchURI0 = new FetchURI();
      Document document0 = new Document("uri");
      document0.addToField("uri", fetchURI0);
      assertEquals("uri", fetchURI0.getUriField());
      
      fetchURI0.processDocument(document0);
      assertEquals("bytes", fetchURI0.getBytesField());
  }
}
