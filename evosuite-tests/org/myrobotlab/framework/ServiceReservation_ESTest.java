/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 01:35:58 GMT 2024
 */

package org.myrobotlab.framework;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.framework.ServiceReservation;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ServiceReservation_ESTest extends ServiceReservation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ServiceReservation serviceReservation0 = new ServiceReservation();
      serviceReservation0.type = "";
      String string0 = serviceReservation0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ServiceReservation serviceReservation0 = new ServiceReservation();
      String string0 = serviceReservation0.toString();
      assertEquals("null", string0);
  }
}