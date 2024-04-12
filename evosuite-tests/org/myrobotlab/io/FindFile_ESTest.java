/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 01:03:41 GMT 2024
 */

package org.myrobotlab.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.myrobotlab.io.FindFile;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FindFile_ESTest extends FindFile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      List<File> list0 = FindFile.findDirs("/", (String) null, false);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      List<File> list0 = FindFile.findDirs("");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List<File> list0 = FindFile.findByExtension("/", "/", false);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List<File> list0 = FindFile.findByExtension("", "");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("./bin");
      FileSystemHandling.createFolder(evoSuiteFile0);
      List<File> list0 = FindFile.findByExtension("EIkU:o");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List<File> list0 = FindFile.find("", "");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("./bin");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "V8}]PV&0+");
      List<File> list0 = FindFile.find("");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".");
      FileSystemHandling.createFolder(evoSuiteFile0);
      List<File> list0 = FindFile.find();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        FindFile.findDirs("/", "B!e3<Sz8${s'@(Li{Y", false);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 8
         // B!e3<Sz8${s'@(Li{Y
         //         ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        FindFile.findDirs(" matches");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/bin");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "/bin");
      // Undeclared exception!
      try { 
        FindFile.findByExtension("/bin", "/bin", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Is not a directory: /bin
         //
         verifyException("org.myrobotlab.io.FindFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      try { 
        FindFile.findByExtension("/bin", "/bin", true);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // Directory does not exist: /bin
         //
         verifyException("org.myrobotlab.io.FindFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        FindFile.findByExtension("/", "|iD~^~;d%)ma");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unmatched closing ')' near index 29
         // ([^\\s]+(\\.(?i)(|iD~^~;d%)ma))$)
         //                              ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      // Undeclared exception!
      try { 
        FindFile.findByExtension((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Is not a directory: .
         //
         verifyException("org.myrobotlab.io.FindFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        FindFile.find("/", "B!e3<Sz8${s'@(Li{Y", false, false);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 8
         // B!e3<Sz8${s'@(Li{Y
         //         ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("e:atches");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "%date{HH:mm:ss.SSS} [%thread] %level %logger{10} [%file:%line] %msg%n");
      // Undeclared exception!
      try { 
        FindFile.find("e:atches", "P]b&d@#40'", true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Is not a directory: e:atches
         //
         verifyException("org.myrobotlab.io.FindFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        FindFile.find("/", "wLoTf'Ph$0L'{.[V");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 11
         // wLoTf'Ph$0L'{.[V
         //            ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      // Undeclared exception!
      try { 
        FindFile.find((String) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Is not a directory: .
         //
         verifyException("org.myrobotlab.io.FindFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("./bin");
      FileSystemHandling.createFolder(evoSuiteFile0);
      // Undeclared exception!
      try { 
        FindFile.find("2~]Y28X.2,{p\"X+@");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 10
         // 2~]Y28X.2,{p\"X+@
         //           ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "`\u0000/bn");
      // Undeclared exception!
      try { 
        FindFile.find("`\u0000/bn");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Is not a directory: .
         //
         verifyException("org.myrobotlab.io.FindFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "org.myrobotlab.io.FindFile$RegexFilter");
      // Undeclared exception!
      try { 
        FindFile.find();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Is not a directory: .
         //
         verifyException("org.myrobotlab.io.FindFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "`Wey`nalm}c\"4t=(");
      // Undeclared exception!
      try { 
        FindFile.findByExtension("`Wey`nalm}c\"4t=(");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Is not a directory: .
         //
         verifyException("org.myrobotlab.io.FindFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("./bin");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ERROR");
      List<File> list0 = FindFile.find();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      List<File> list0 = FindFile.findDirs("/");
      assertEquals(4, list0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      List<File> list0 = FindFile.findDirs("", (String) null, true);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      try { 
        FindFile.find((String) null, "_", true, true);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // Directory does not exist: .
         //
         verifyException("org.myrobotlab.io.FindFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      List<File> list0 = FindFile.find("//", "//", false, false);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      List<File> list0 = FindFile.find("/", (String) null, true, true);
      assertEquals(4, list0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("./bin");
      String string0 = "(%jQc]^!Sb)";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, string0);
      String string1 = "";
      List<File> list0 = FindFile.find(string1, string1);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("./bin");
      String string0 = "(%jQc]^!Sb)";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, string0);
      String string1 = "";
      List<File> list0 = FindFile.findDirs(string1);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("./bin");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      String string0 = "U";
      List<File> list0 = FindFile.find(string0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("./bin");
          FileSystemHandling.createFolder(evoSuiteFile0);
          // Undeclared exception!
          try { 
            FindFile.main((String[]) null);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"myrobotlab.log\" \"write\")
             // java.base/java.lang.Thread.getStackTrace(Thread.java:1602)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // java.base/java.lang.SecurityManager.checkWrite(SecurityManager.java:752)
             // java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:225)
             // ch.qos.logback.core.recovery.ResilientFileOutputStream.<init>(ResilientFileOutputStream.java:26)
             // ch.qos.logback.core.FileAppender.openFile(FileAppender.java:204)
             // ch.qos.logback.core.FileAppender.start(FileAppender.java:127)
             // org.myrobotlab.logging.LoggingSLF4J.addAppender(LoggingSLF4J.java:64)
             // org.myrobotlab.logging.LoggingSLF4J.addAppender(LoggingSLF4J.java:26)
             // org.myrobotlab.logging.LoggingSLF4J.configure(LoggingSLF4J.java:83)
             // org.myrobotlab.logging.LoggingFactory.init(LoggingFactory.java:29)
             // org.myrobotlab.io.FindFile.main(FindFile.java:103)
             // java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             // java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
             // java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.base/java.lang.reflect.Method.invoke(Method.java:566)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
             // java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
             // java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
             // java.base/java.lang.Thread.run(Thread.java:829)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        FindFile.findDirs("FILE", "P]b&d@#40'", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = "(%jQc]^!Sb)";
      try { 
        FindFile.find(string0, string0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // Directory does not exist: (%jQc]^!Sb)
         //
         verifyException("org.myrobotlab.io.FindFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = "U";
      try { 
        FindFile.find(string0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // Directory does not exist: .
         //
         verifyException("org.myrobotlab.io.FindFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      try { 
        FindFile.find();
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // Directory does not exist: .
         //
         verifyException("org.myrobotlab.io.FindFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        FindFile.findByExtension("/", "Y@gPRXlDa~gv`-oi(", false);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed group near index 37
         // ([^\\s]+(\\.(?i)(Y@gPRXlDa~gv`-oi())$)
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = "(%jQc]^!Sb)";
      try { 
        FindFile.findByExtension(string0, string0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // Directory does not exist: (%jQc]^!Sb)
         //
         verifyException("org.myrobotlab.io.FindFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FindFile findFile0 = new FindFile();
      FindFile.RegexFilter findFile_RegexFilter0 = findFile0.new RegexFilter("`~./bin");
      MockFile mockFile0 = new MockFile("`~./bin", "`~./bin");
      boolean boolean0 = findFile_RegexFilter0.accept(mockFile0, "`~./bin");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      try { 
        FindFile.findByExtension("OBkow!?#LzS,DRwG/");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // Directory does not exist: .
         //
         verifyException("org.myrobotlab.io.FindFile", e);
      }
  }
}