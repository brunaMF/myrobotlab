/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 02:50:21 GMT 2024
 */

package org.myrobotlab.document.transformer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.document.Document;
import org.myrobotlab.document.transformer.CastValuesToInt;
import org.myrobotlab.document.transformer.StageConfiguration;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CastValuesToInt_ESTest extends CastValuesToInt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CastValuesToInt castValuesToInt0 = new CastValuesToInt();
      StageConfiguration stageConfiguration0 = new StageConfiguration();
      stageConfiguration0.config = null;
      // Undeclared exception!
      try { 
        castValuesToInt0.startStage(stageConfiguration0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.document.transformer.StageConfiguration", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CastValuesToInt castValuesToInt0 = new CastValuesToInt();
      // Undeclared exception!
      try { 
        castValuesToInt0.processDocument((Document) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.document.transformer.CastValuesToInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CastValuesToInt castValuesToInt0 = new CastValuesToInt();
      Document document0 = new Document("");
      document0.addToField("", (Object) null);
      document0.renameField("", (String) null);
      List<Document> list0 = castValuesToInt0.processDocument(document0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CastValuesToInt castValuesToInt0 = new CastValuesToInt();
      Document document0 = new Document("izl72r)2");
      List<Document> list0 = castValuesToInt0.processDocument(document0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CastValuesToInt castValuesToInt0 = new CastValuesToInt();
      Document document0 = new Document("");
      document0.addToField("", document0);
      document0.renameField("", (String) null);
      List<Document> list0 = castValuesToInt0.processDocument(document0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CastValuesToInt castValuesToInt0 = new CastValuesToInt();
      StageConfiguration stageConfiguration0 = new StageConfiguration();
      castValuesToInt0.startStage(stageConfiguration0);
      assertEquals("defaultStage", stageConfiguration0.getStageName());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CastValuesToInt castValuesToInt0 = new CastValuesToInt();
      castValuesToInt0.startStage((StageConfiguration) null);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CastValuesToInt castValuesToInt0 = new CastValuesToInt();
      castValuesToInt0.flush();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CastValuesToInt castValuesToInt0 = new CastValuesToInt();
      castValuesToInt0.stopStage();
  }
}