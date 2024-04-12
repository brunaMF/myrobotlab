/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 02:19:03 GMT 2024
 */

package org.myrobotlab.document.transformer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.myrobotlab.document.Document;
import org.myrobotlab.document.transformer.RenameFields;
import org.myrobotlab.document.transformer.StageConfiguration;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RenameFields_ESTest extends RenameFields_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RenameFields renameFields0 = new RenameFields();
      // Undeclared exception!
      try { 
        renameFields0.startStage((StageConfiguration) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.document.transformer.RenameFields", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RenameFields renameFields0 = new RenameFields();
      StageConfiguration stageConfiguration0 = new StageConfiguration();
      stageConfiguration0.setStringParam("fieldNameMap", "fieldNameMap");
      // Undeclared exception!
      try { 
        renameFields0.startStage(stageConfiguration0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.util.Map (java.lang.String and java.util.Map are in module java.base of loader 'bootstrap')
         //
         verifyException("org.myrobotlab.document.transformer.Configuration", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RenameFields renameFields0 = new RenameFields();
      StageConfiguration stageConfiguration0 = new StageConfiguration();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      hashMap0.put("fieldNameMap", renameFields0);
      BiFunction<Object, Object, Object> biFunction0 = (BiFunction<Object, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(",_Nt;kkd h5J").when(biFunction0).apply(any() , any());
      hashMap0.merge("fieldNameMap", "fieldNameMap", biFunction0);
      stageConfiguration0.setMapProperty("fieldNameMap", hashMap0);
      renameFields0.startStage(stageConfiguration0);
      Document document0 = new Document(",_Nt;kkd h5J");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) ",_Nt;kkd h5J");
      document0.setField(",_Nt;kkd h5J", arrayList0);
      document0.setField("fieldNameMap", arrayList0);
      // Undeclared exception!
      try { 
        renameFields0.processDocument(document0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RenameFields renameFields0 = new RenameFields();
      // Undeclared exception!
      try { 
        renameFields0.processDocument((Document) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.document.transformer.RenameFields", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RenameFields renameFields0 = new RenameFields();
      StageConfiguration stageConfiguration0 = new StageConfiguration();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object0 = new Object();
      BiFunction<Object, Object, Object> biFunction0 = (BiFunction<Object, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge("fieldNameMap", "fieldNameMap", biFunction0);
      BiFunction<Object, Object, Document> biFunction1 = (BiFunction<Object, Object, Document>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge("", "fieldNameMap", biFunction1);
      stageConfiguration0.setMapProperty("fieldNameMap", hashMap0);
      renameFields0.startStage(stageConfiguration0);
      Document document0 = new Document("");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add(object0);
      document0.setField("", arrayList0);
      List<Document> list0 = renameFields0.processDocument(document0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RenameFields renameFields0 = new RenameFields();
      StageConfiguration stageConfiguration0 = new StageConfiguration();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      hashMap0.put("fieldNameMap", renameFields0);
      stageConfiguration0.setMapProperty("fieldNameMap", hashMap0);
      renameFields0.startStage(stageConfiguration0);
      Document document0 = new Document("j_!t;kM~ h5J");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      document0.setField("fieldNameMap", arrayList0);
      // Undeclared exception!
      try { 
        renameFields0.processDocument(document0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.myrobotlab.document.transformer.RenameFields cannot be cast to class java.lang.String (org.myrobotlab.document.transformer.RenameFields is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @65459993; java.lang.String is in module java.base of loader 'bootstrap')
         //
         verifyException("org.myrobotlab.document.transformer.RenameFields", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RenameFields renameFields0 = new RenameFields();
      StageConfiguration stageConfiguration0 = new StageConfiguration();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      hashMap0.put("fieldNameMap", renameFields0);
      stageConfiguration0.setMapProperty("fieldNameMap", hashMap0);
      renameFields0.startStage(stageConfiguration0);
      Document document0 = new Document(",_Nt;kkd h5J");
      List<Document> list0 = renameFields0.processDocument(document0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RenameFields renameFields0 = new RenameFields();
      renameFields0.stopStage();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      RenameFields renameFields0 = new RenameFields();
      renameFields0.flush();
  }
}