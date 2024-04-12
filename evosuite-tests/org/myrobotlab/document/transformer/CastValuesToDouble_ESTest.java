/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 02:21:14 GMT 2024
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
import org.myrobotlab.document.transformer.CastValuesToDouble;
import org.myrobotlab.document.transformer.StageConfiguration;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CastValuesToDouble_ESTest extends CastValuesToDouble_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CastValuesToDouble castValuesToDouble0 = new CastValuesToDouble();
      StageConfiguration stageConfiguration0 = new StageConfiguration();
      stageConfiguration0.config = null;
      // Undeclared exception!
      try { 
        castValuesToDouble0.startStage(stageConfiguration0);
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
      CastValuesToDouble castValuesToDouble0 = new CastValuesToDouble();
      // Undeclared exception!
      try { 
        castValuesToDouble0.processDocument((Document) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.document.transformer.CastValuesToDouble", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CastValuesToDouble castValuesToDouble0 = new CastValuesToDouble();
      Document document0 = new Document("");
      List<Document> list0 = castValuesToDouble0.processDocument(document0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CastValuesToDouble castValuesToDouble0 = new CastValuesToDouble();
      Document document0 = new Document("}ad");
      document0.setField("}ad", (Object) document0);
      document0.renameField("}ad", (String) null);
      List<Document> list0 = castValuesToDouble0.processDocument(document0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CastValuesToDouble castValuesToDouble0 = new CastValuesToDouble();
      StageConfiguration stageConfiguration0 = new StageConfiguration("inputField", "");
      castValuesToDouble0.startStage(stageConfiguration0);
      assertEquals("inputField", stageConfiguration0.getStageName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CastValuesToDouble castValuesToDouble0 = new CastValuesToDouble();
      castValuesToDouble0.startStage((StageConfiguration) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CastValuesToDouble castValuesToDouble0 = new CastValuesToDouble();
      castValuesToDouble0.stopStage();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CastValuesToDouble castValuesToDouble0 = new CastValuesToDouble();
      castValuesToDouble0.flush();
  }
}