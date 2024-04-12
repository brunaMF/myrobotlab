/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 02:20:08 GMT 2024
 */

package org.myrobotlab.document.transformer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.document.Document;
import org.myrobotlab.document.transformer.DivideValues;
import org.myrobotlab.document.transformer.StageConfiguration;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DivideValues_ESTest extends DivideValues_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DivideValues divideValues0 = new DivideValues();
      StageConfiguration stageConfiguration0 = new StageConfiguration("", "");
      stageConfiguration0.config = null;
      // Undeclared exception!
      try { 
        divideValues0.startStage(stageConfiguration0);
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
      DivideValues divideValues0 = new DivideValues();
      StageConfiguration stageConfiguration0 = new StageConfiguration();
      HashMap<String, Document> hashMap0 = new HashMap<String, Document>();
      stageConfiguration0.setMapProperty("divisorField", hashMap0);
      divideValues0.startStage(stageConfiguration0);
      Document document0 = new Document("divisorField");
      document0.setField("divisorField", (Object) divideValues0);
      document0.renameField("divisorField", (String) null);
      List<Document> list0 = divideValues0.processDocument(document0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DivideValues divideValues0 = new DivideValues();
      Document document0 = new Document("b]F|~FN./0~(");
      document0.setField("7+b+dux", (Object) "7+b+dux");
      document0.renameField("7+b+dux", (String) null);
      // Undeclared exception!
      try { 
        divideValues0.processDocument(document0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DivideValues divideValues0 = new DivideValues();
      Document document0 = new Document("");
      List<Document> list0 = divideValues0.processDocument(document0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DivideValues divideValues0 = new DivideValues();
      divideValues0.startStage((StageConfiguration) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DivideValues divideValues0 = new DivideValues();
      divideValues0.flush();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DivideValues divideValues0 = new DivideValues();
      divideValues0.stopStage();
  }
}