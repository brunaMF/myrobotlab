/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 05 22:21:52 GMT 2024
 */

package org.myrobotlab.framework;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.myrobotlab.framework.Inbox;
import org.myrobotlab.framework.Message;
import org.myrobotlab.framework.RoutingEntry;
import org.myrobotlab.framework.interfaces.MessageListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Inbox_ESTest extends Inbox_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Inbox inbox0 = new Inbox("connect to {} giving up {}");
      inbox0.isRunning = true;
      MessageListener messageListener0 = mock(MessageListener.class, new ViolatedAssumptionAnswer());
      LinkedList<Message> linkedList0 = new LinkedList<Message>();
      inbox0.msgBox = linkedList0;
      inbox0.addMessageListener(messageListener0);
      inbox0.isBufferOverrun();
      Object object0 = new Object();
      Message message0 = Message.createMessage("D8", (String) null, (String) null, object0);
      linkedList0.add(message0);
      message0.msgId = (-1L);
      inbox0.add(message0);
      inbox0.setBlocking(true);
      MessageListener messageListener1 = mock(MessageListener.class, new ViolatedAssumptionAnswer());
      inbox0.addMessageListener(messageListener1);
      inbox0.isBufferOverrun();
      message0.sender = "released {}";
      inbox0.size();
      assertEquals(2, inbox0.size());
      
      inbox0.add(message0);
      inbox0.isBufferOverrun();
      inbox0.size();
      inbox0.setBlocking(true);
      boolean boolean0 = inbox0.isBufferOverrun();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Inbox inbox0 = new Inbox();
      inbox0.clear();
      Message message0 = new Message();
      ArrayList<RoutingEntry> arrayList0 = new ArrayList<RoutingEntry>();
      message0.sendingMethod = "getting access to field threw";
      inbox0.duplicateMsg(arrayList0);
      inbox0.add(message0);
      message0.msgId = 3600000L;
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) arrayList0;
      objectArray0[1] = (Object) arrayList0;
      objectArray0[2] = (Object) inbox0;
      message0.equals(objectArray0[1]);
      objectArray0[3] = (Object) message0;
      objectArray0[4] = (Object) inbox0;
      arrayList0.clone();
      message0.data = objectArray0;
      inbox0.getMsg();
      inbox0.add(message0);
      inbox0.setBlocking(false);
      inbox0.duplicateMsg(arrayList0);
      inbox0.getMsg();
      inbox0.add(message0);
      inbox0.isBufferOverrun();
      int int0 = inbox0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Inbox inbox0 = new Inbox();
      MessageListener messageListener0 = mock(MessageListener.class, new ViolatedAssumptionAnswer());
      inbox0.clear();
      inbox0.addMessageListener(messageListener0);
      ArrayList<RoutingEntry> arrayList0 = new ArrayList<RoutingEntry>();
      inbox0.duplicateMsg(arrayList0);
      MessageListener messageListener1 = null;
      ArrayList<Object> arrayList1 = new ArrayList<Object>();
      RoutingEntry routingEntry0 = new RoutingEntry();
      List.of(routingEntry0, routingEntry0, routingEntry0, routingEntry0, routingEntry0, routingEntry0, routingEntry0);
      arrayList0.removeAll(arrayList1);
      inbox0.addMessageListener((MessageListener) null);
      inbox0.name = "%6UTSRqcIR4*YTH*";
      inbox0.addMessageListener((MessageListener) null);
      inbox0.bufferOverrun = false;
      inbox0.clear();
      inbox0.size();
      LinkedList<Message> linkedList0 = new LinkedList<Message>();
      inbox0.msgBox = linkedList0;
      LinkedList<RoutingEntry> linkedList1 = new LinkedList<RoutingEntry>();
      // Undeclared exception!
      try { 
        arrayList0.addAll(4314, (Collection<? extends RoutingEntry>) linkedList1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4314, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Inbox inbox0 = new Inbox("62'w{K}v7>u@zL");
      HashMap<String, Object[]> hashMap0 = new HashMap<String, Object[]>();
      LinkedList<Message> linkedList0 = inbox0.msgBox;
      inbox0.bufferOverrun = false;
      inbox0.msgBox = linkedList0;
      inbox0.blockingList = hashMap0;
      inbox0.size();
      inbox0.isBufferOverrun();
      MessageListener messageListener0 = mock(MessageListener.class, new ViolatedAssumptionAnswer());
      inbox0.clear();
      inbox0.addMessageListener(messageListener0);
      linkedList0.add((Message) null);
      inbox0.name = "s5HP0WY99L~";
      inbox0.setBlocking(false);
      inbox0.isBufferOverrun();
      inbox0.clear();
      ArrayList<RoutingEntry> arrayList0 = new ArrayList<RoutingEntry>();
      RoutingEntry routingEntry0 = new RoutingEntry();
      RoutingEntry routingEntry1 = new RoutingEntry(routingEntry0);
      arrayList0.add(routingEntry1);
      inbox0.duplicateMsg(arrayList0);
      inbox0.setBlocking(false);
      int int0 = inbox0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Inbox inbox0 = new Inbox("");
      MessageListener messageListener0 = mock(MessageListener.class, new ViolatedAssumptionAnswer());
      inbox0.addMessageListener(messageListener0);
      inbox0.bufferOverrun = false;
      inbox0.size();
      inbox0.clear();
      inbox0.bufferOverrun = false;
      ArrayList<RoutingEntry> arrayList0 = new ArrayList<RoutingEntry>();
      RoutingEntry routingEntry0 = new RoutingEntry();
      routingEntry0.toString();
      arrayList0.add(routingEntry0);
      MessageListener messageListener1 = mock(MessageListener.class, new ViolatedAssumptionAnswer());
      inbox0.addMessageListener(messageListener1);
      List.of(routingEntry0, routingEntry0, routingEntry0, routingEntry0, routingEntry0, routingEntry0, routingEntry0);
      // Undeclared exception!
      try { 
        inbox0.add((Message) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.framework.Inbox", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Inbox inbox0 = new Inbox();
      MessageListener messageListener0 = mock(MessageListener.class, new ViolatedAssumptionAnswer());
      inbox0.addMessageListener(messageListener0);
      assertFalse(inbox0.isBufferOverrun());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Inbox inbox0 = new Inbox("n3V% ?(UW'_]5k}");
      inbox0.bufferOverrun = true;
      Message message0 = new Message();
      Message message1 = new Message(message0);
      inbox0.add(message1);
      inbox0.setBlocking(false);
      boolean boolean0 = inbox0.isBufferOverrun();
      assertEquals(1, inbox0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Inbox inbox0 = new Inbox(">{{OB:k");
      inbox0.clear();
      inbox0.isRunning = true;
      MessageListener messageListener0 = mock(MessageListener.class, new ViolatedAssumptionAnswer());
      inbox0.addMessageListener(messageListener0);
      inbox0.setBlocking(false);
      inbox0.clear();
      assertFalse(inbox0.isBufferOverrun());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Inbox inbox0 = new Inbox();
      inbox0.blocking = false;
      ArrayList<RoutingEntry> arrayList0 = new ArrayList<RoutingEntry>();
      RoutingEntry routingEntry0 = new RoutingEntry();
      List.of(routingEntry0);
      routingEntry0.toString();
      routingEntry0.ID = (-1050);
      routingEntry0.ID = 3;
      routingEntry0.timestamp = (-1L);
      arrayList0.add(routingEntry0);
      inbox0.duplicateMsg(arrayList0);
      Message message0 = Message.createMessage("\u0003.1`q", "9D,s1uIPFiVkGM", "\u0003.1`q", (Object) null);
      inbox0.add(message0);
      assertEquals(1, inbox0.size());
      
      inbox0.getMsg();
      inbox0.isBufferOverrun();
      inbox0.setBlocking(false);
      inbox0.size();
      inbox0.clear();
      assertFalse(inbox0.isBufferOverrun());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Inbox inbox0 = new Inbox();
      inbox0.isRunning = true;
      ArrayList<RoutingEntry> arrayList0 = new ArrayList<RoutingEntry>();
      RoutingEntry routingEntry0 = new RoutingEntry();
      RoutingEntry routingEntry1 = new RoutingEntry(routingEntry0);
      arrayList0.add(routingEntry1);
      inbox0.duplicateMsg(arrayList0);
      inbox0.isRunning = false;
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) inbox0;
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) ";$0n!gE3B}aQQ]";
      Object object0 = new Object();
      objectArray0[3] = object0;
      objectArray0[4] = (Object) "";
      Object object1 = new Object();
      objectArray0[5] = object1;
      Message message0 = Message.createMessage(";$0n!gE3B}aQQ]", "", "", objectArray0);
      inbox0.add(message0);
      assertEquals(1, inbox0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Inbox inbox0 = new Inbox();
      Message message0 = new Message();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("", (Object) null);
      Message.createMessage("p)H!43P", "", "api/messages", (Object) null);
      Object object0 = new Object();
      inbox0.blocking = true;
      hashMap0.put((String) null, object0);
      message0.putAll(hashMap0);
      inbox0.add(message0);
      ArrayList<RoutingEntry> arrayList0 = new ArrayList<RoutingEntry>();
      inbox0.duplicateMsg(arrayList0);
      boolean boolean0 = inbox0.duplicateMsg(arrayList0);
      assertFalse(inbox0.isBufferOverrun());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Inbox inbox0 = new Inbox();
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) "";
      objectArray0[4] = (Object) "";
      objectArray0[5] = (Object) "";
      objectArray0[6] = (Object) "";
      objectArray0[7] = (Object) "";
      Message message0 = Message.createMessage("", (String) null, "", objectArray0);
      inbox0.add(message0);
      assertEquals(1, inbox0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Inbox inbox0 = new Inbox((String) null);
      inbox0.maxQueue = 0;
      inbox0.size();
      ArrayList<RoutingEntry> arrayList0 = new ArrayList<RoutingEntry>();
      inbox0.duplicateMsg(arrayList0);
      ArrayList<RoutingEntry> arrayList1 = new ArrayList<RoutingEntry>();
      boolean boolean0 = inbox0.duplicateMsg(arrayList1);
      assertFalse(boolean0);
      assertFalse(inbox0.isBufferOverrun());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Inbox inbox0 = new Inbox("");
      Object[] objectArray0 = new Object[0];
      Message message0 = Message.createMessage("", "&e", "", objectArray0);
      inbox0.add(message0);
      assertEquals(1, inbox0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Inbox inbox0 = new Inbox("Ult%");
      Object object0 = new Object();
      Message message0 = Message.createMessage("Ult%", "", "skipping loopback address", object0);
      inbox0.add(message0);
      assertEquals(1, inbox0.size());
  }
}