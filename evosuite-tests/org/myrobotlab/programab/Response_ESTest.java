/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 04:58:03 GMT 2024
 */

package org.myrobotlab.programab;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.programab.OOBPayload;
import org.myrobotlab.programab.Response;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Response_ESTest extends Response_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Response response0 = new Response("", "", " <rg?EjST}Zh", (List<OOBPayload>) null);
      String string0 = response0.toString();
      assertEquals("[Time:1392409281320, Bot:, User:, Msg: <rg?EjST}Zh, Payloads:[]]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<OOBPayload> linkedList0 = new LinkedList<OOBPayload>();
      Response response0 = new Response("", "publishResponse", "publishResponse", linkedList0);
      String string0 = response0.toString();
      assertEquals("[Time:1392409281320, Bot:publishResponse, User:, Msg:publishResponse, Payloads:[]]", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<OOBPayload> linkedList0 = new LinkedList<OOBPayload>();
      linkedList0.add((OOBPayload) null);
      Response response0 = new Response("Wcz/~{", "Wcz/~{", "Wcz/~{", linkedList0);
      // Undeclared exception!
      try { 
        response0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}
