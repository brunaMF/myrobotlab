/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 05:06:44 GMT 2024
 */

package org.myrobotlab.net;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;
import org.myrobotlab.net.TcpServer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TcpServer_ESTest extends TcpServer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TcpServer tcpServer0 = new TcpServer();
      Integer integer0 = new Integer(1);
      Integer integer1 = new Integer(1);
      tcpServer0.start(integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TcpServer tcpServer0 = new TcpServer();
      tcpServer0.start((Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TcpServer tcpServer0 = new TcpServer();
      Integer integer0 = new Integer(1);
      tcpServer0.listening = true;
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 1);
      NetworkHandling.sendMessageOnTcp(evoSuiteLocalAddress0, "");
      tcpServer0.start(integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[0];
      TcpServer.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }
}
