/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 04:32:54 GMT 2024
 */

package org.myrobotlab.service.data;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.service.data.TopicChange;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TopicChange_ESTest extends TopicChange_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TopicChange topicChange0 = new TopicChange("", (String) null, "", "I57#s");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TopicChange topicChange0 = new TopicChange("", "", "", "");
  }
}
