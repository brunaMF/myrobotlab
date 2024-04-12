/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 02:41:20 GMT 2024
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
import org.myrobotlab.document.transformer.JoinFieldValues;
import org.myrobotlab.document.transformer.StageConfiguration;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JoinFieldValues_ESTest extends JoinFieldValues_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JoinFieldValues joinFieldValues0 = new JoinFieldValues();
      StageConfiguration stageConfiguration0 = new StageConfiguration("outputField", "outputField");
      stageConfiguration0.config = null;
      // Undeclared exception!
      try { 
        joinFieldValues0.startStage(stageConfiguration0);
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
      JoinFieldValues joinFieldValues0 = new JoinFieldValues();
      // Undeclared exception!
      try { 
        joinFieldValues0.processDocument((Document) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.document.transformer.JoinFieldValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JoinFieldValues joinFieldValues0 = new JoinFieldValues();
      Document document0 = new Document("");
      Object object0 = new Object();
      document0.setField("", object0);
      document0.renameField("", (String) null);
      // Undeclared exception!
      try { 
        joinFieldValues0.processDocument(document0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang/StringUtils
         //
         verifyException("org.myrobotlab.document.transformer.JoinFieldValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JoinFieldValues joinFieldValues0 = new JoinFieldValues();
      Document document0 = new Document("");
      List<Document> list0 = joinFieldValues0.processDocument(document0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JoinFieldValues joinFieldValues0 = new JoinFieldValues();
      StageConfiguration stageConfiguration0 = new StageConfiguration();
      joinFieldValues0.startStage(stageConfiguration0);
      assertEquals("defaultStage", stageConfiguration0.getStageName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JoinFieldValues joinFieldValues0 = new JoinFieldValues();
      joinFieldValues0.startStage((StageConfiguration) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JoinFieldValues joinFieldValues0 = new JoinFieldValues();
      joinFieldValues0.flush();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JoinFieldValues joinFieldValues0 = new JoinFieldValues();
      joinFieldValues0.stopStage();
  }
}
