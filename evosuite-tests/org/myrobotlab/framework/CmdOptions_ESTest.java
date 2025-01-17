/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 01:31:20 GMT 2024
 */

package org.myrobotlab.framework;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.framework.CmdOptions;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CmdOptions_ESTest extends CmdOptions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String string0 = CmdOptions.toString(stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[5];
      List<String> list0 = CmdOptions.toList(stringArray0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CmdOptions cmdOptions0 = new CmdOptions();
      List<String> list0 = cmdOptions0.getOutputCmd();
      assertEquals(9, list0.size());
      
      CmdOptions.toArray(cmdOptions0.services);
      assertFalse(cmdOptions0.help);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdOptions.toString((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.framework.CmdOptions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdOptions.toString((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.framework.CmdOptions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdOptions.toArray((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.framework.CmdOptions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CmdOptions cmdOptions0 = new CmdOptions();
      List<String> list0 = List.copyOf((Collection<? extends String>) cmdOptions0.services);
      cmdOptions0.services = list0;
      // Undeclared exception!
      try { 
        cmdOptions0.getOutputCmd();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ImmutableCollections", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CmdOptions cmdOptions0 = new CmdOptions();
      cmdOptions0.services = null;
      // Undeclared exception!
      try { 
        cmdOptions0.getOutputCmd();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.framework.CmdOptions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdOptions.contains((List<String>) null, "-s");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.framework.CmdOptions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = CmdOptions.toString(stringArray0);
      assertEquals("null ", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CmdOptions cmdOptions0 = new CmdOptions();
      List<String> list0 = cmdOptions0.getOutputCmd();
      cmdOptions0.services = list0;
      try { 
        cmdOptions0.getOutputCmd();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // invalid choice - services must be -s {name} {type} ...
         //
         verifyException("org.myrobotlab.framework.CmdOptions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CmdOptions cmdOptions0 = new CmdOptions();
      cmdOptions0.memory = "\"8B4{=oAsaQfY_";
      List<String> list0 = cmdOptions0.getOutputCmd();
      assertEquals(11, list0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CmdOptions cmdOptions0 = new CmdOptions();
      cmdOptions0.logLevel = null;
      List<String> list0 = cmdOptions0.getOutputCmd();
      assertEquals(7, list0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CmdOptions cmdOptions0 = new CmdOptions();
      String[] stringArray0 = new String[6];
      cmdOptions0.install = stringArray0;
      List<String> list0 = cmdOptions0.getOutputCmd();
      assertEquals(16, list0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CmdOptions cmdOptions0 = new CmdOptions();
      cmdOptions0.id = "s3B5";
      List<String> list0 = cmdOptions0.getOutputCmd();
      assertTrue(list0.contains("s3B5"));
      assertEquals(11, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CmdOptions cmdOptions0 = new CmdOptions();
      assertFalse(cmdOptions0.help);
      
      cmdOptions0.help = true;
      List<String> list0 = cmdOptions0.getOutputCmd();
      assertEquals(10, list0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CmdOptions cmdOptions0 = new CmdOptions();
      cmdOptions0.config = "--config";
      List<String> list0 = cmdOptions0.getOutputCmd();
      assertEquals(11, list0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CmdOptions cmdOptions0 = new CmdOptions();
      List<String> list0 = cmdOptions0.getOutputCmd();
      assertEquals(9, list0.size());
      
      String string0 = CmdOptions.toString(cmdOptions0.services);
      assertEquals("webgui WebGui intro Intro python Python ", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CmdOptions cmdOptions0 = new CmdOptions();
      CmdOptions cmdOptions1 = null;
      try {
        cmdOptions1 = new CmdOptions(cmdOptions0);
        fail("Expecting exception: IllegalAccessException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CmdOptions cmdOptions0 = new CmdOptions();
      List<String> list0 = cmdOptions0.getOutputCmd();
      boolean boolean0 = CmdOptions.contains(list0, "info");
      assertEquals(9, list0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CmdOptions cmdOptions0 = new CmdOptions();
      List<String> list0 = cmdOptions0.getOutputCmd();
      assertEquals(9, list0.size());
      
      boolean boolean0 = CmdOptions.contains(cmdOptions0.services, ":!JH");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CmdOptions cmdOptions0 = new CmdOptions();
      CmdOptions.toString(cmdOptions0.services);
      assertFalse(cmdOptions0.help);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CmdOptions cmdOptions0 = new CmdOptions();
      String[] stringArray0 = CmdOptions.toArray(cmdOptions0.services);
      CmdOptions.toList(stringArray0);
      assertFalse(cmdOptions0.help);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        CmdOptions.toList((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }
}
