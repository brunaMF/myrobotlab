/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 01:02:18 GMT 2024
 */

package org.myrobotlab.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.List;
import java.util.zip.ZipException;
import java.util.zip.ZipOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.myrobotlab.io.Zip;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Zip_ESTest extends Zip_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      try { 
        Zip.unzip("7:}NB%PZI'[s", ".*");
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      try { 
        Zip.listDirectoryContents("kPLZ cK}BNEBkxC-wA", "a)");
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.extractFromResource("M]E", " qci1|(()fC'Q0>!fLA", " qci1|(()fC'Q0>!fLA");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // in is null
         //
         verifyException("java.util.zip.ZipInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.extractFromResource("FILE", "FILE", "NILE");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // in is null
         //
         verifyException("java.util.zip.ZipInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.extractFromResource("`-@@m-0|]V1vq2O", "/");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // in is null
         //
         verifyException("java.util.zip.ZipInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Zip.extractFromSelf("}");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Zip.extractFromFile(" qci1|(()fC'Q0>!fLA", " qci1|(()fC'Q0>!fLA", "M]E");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Zip.extractFromFile("", "[cNx");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = Zip.countOccurrences("`-@@m-0|]V1vq2O", '(');
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.zipFile((File) null, (ZipOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.io.Zip", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        Zip.zip(stringArray0, "Fmb~4n;K");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.zip.Deflater
         //
         verifyException("java.util.zip.ZipOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.zip((List<File>) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.zip((List<File>) null, "#lX([y3*gf");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.zip.Deflater
         //
         verifyException("java.util.zip.ZipOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      try { 
        Zip.zip((List<File>) null, "");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      try { 
        Zip.unzip("myrobotlab.log", "myrobotlab.log");
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // zip END header not found
         //
         verifyException("java.util.zip.ZipFile$Source", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.unzip((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      try { 
        Zip.unzip("", "");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         //  (Arquivo ou diret\u00F3rio inexistente)
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      try { 
        Zip.listDirectoryContents(",_,}F-)vz", "'V1/");
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.listDirectoryContents("", "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.listDirectoryContents((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.io.Zip", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "resolved.*.xml$");
      try { 
        Zip.extractFromSelf();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.extractFromResource("", "", "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.extractFromResource("", "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        Zip.extractFromResource("^<z", "^<z");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to create directory /home/iartes/myrobotlab/^<z
         //
         verifyException("org.myrobotlab.io.Zip", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.extractFromFile((String) null, " qci1|(()fC'Q0>!fLA", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.extractFromFile((String) null, "RESOURCE");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.extract("", "", "", "", false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.countOccurrences((String) null, 'X');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.io.Zip", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        Zip.extract("GILE", "GILE", "GILE", "GILE", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to create directory /home/iartes/myrobotlab/GILE
         //
         verifyException("org.myrobotlab.io.Zip", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.extract("resolved.*.xml$", "resolved.*.xml$", "resolved.*.xml$", "resolved.*.xml$", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // in is null
         //
         verifyException("java.util.zip.ZipInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Zip.extract("FILE", "FILE", "FILE", "FILE", false);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.extract("nLRC@{vf/HQ", "/", "FILE", "", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // in is null
         //
         verifyException("java.util.zip.ZipInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.extract("V5~]AS)wvj!JUh", (String) null, "DEBUG", "Q9", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.extractFromFile("", "", "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.extractFromSelf("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockFile mockFile0 = new MockFile("<Initk %a,E4Ty~_h_:", "<Initk %a,E4Ty~_h_:");
      MockFile.createTempFile("<Initk %a,E4Ty~_h_:", "<Initk %a,E4Ty~_h_:", (File) mockFile0);
      // Undeclared exception!
      try { 
        Zip.zipDirectory(mockFile0, "<Initk %a,E4Ty~_h_:", (ZipOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.io.Zip", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Zip.zipDirectory(mockFile0, "", (ZipOutputStream) null);
      assertTrue(mockFile0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[0];
      try { 
        Zip.zip(stringArray0, "/");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        Zip.zip(stringArray0, stringArray0[1]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      try { 
        Zip.listDirectoryContents("myrobotlab.log", ",Dx%G&aam|3s.\"k");
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // zip END header not found
         //
         verifyException("java.util.zip.ZipFile$Source", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      try { 
        Zip.listDirectoryContents("/", "/");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // / (\u00C9 um diret\u00F3rio)
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        Zip.extractFromResource(" will b ded", " will b ded", " will b ded");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to create directory /home/iartes/myrobotlab/ will b ded
         //
         verifyException("org.myrobotlab.io.Zip", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Zip.extract("/", "FILE", "/", "FILE", false);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("FILE");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "=jTU");
      Zip.extract("FILE", "FILE", "FILE", "FILE", true);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int int0 = Zip.countOccurrences("`-@@m-0|]V1vq2O", 'm');
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Zip zip0 = new Zip();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.extractFromFile("", "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        Zip.extractFromSelf(".", ".");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Zip.extractFromSelf();
  }
}
