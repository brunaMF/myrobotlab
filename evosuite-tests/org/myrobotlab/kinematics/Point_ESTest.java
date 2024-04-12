/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 01:53:56 GMT 2024
 */

package org.myrobotlab.kinematics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.myrobotlab.kinematics.Point;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Point_ESTest extends Point_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Point point0 = new Point(0.0, (-3232.987), (-3232.987));
      assertEquals(0.0, point0.getPitch(), 0.01);
      
      point0.setPitch((-3232.987));
      point0.hashCode();
      assertEquals(0.0, point0.getRoll(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Point point0 = new Point((-1537.8646654057), (-1537.8646654057), 0.0, (-1537.8646654057), 4001.1, 1.0);
      point0.hashCode();
      assertEquals(2174.869066911103, point0.magnitude(), 0.01);
      assertEquals(4001.1, point0.getPitch(), 0.01);
      assertEquals(1.0, point0.getYaw(), 0.01);
      assertEquals((-1537.8646654057), point0.getRoll(), 0.01);
      assertEquals((-1537.8646654057), point0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Point point0 = new Point((-840.1854788), (-840.1854788), (-840.1854788));
      point0.hashCode();
      assertEquals(0.0, point0.getYaw(), 0.01);
      assertEquals(0.0, point0.getPitch(), 0.01);
      assertEquals(0.0, point0.getRoll(), 0.01);
      assertEquals(1455.243937063184, point0.magnitude(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Point point0 = new Point(0.0, 0.0, 0.0, 0.0, (-1722.4375182), (-1722.4375182));
      Point point1 = new Point(point0);
      assertEquals((-1722.4375182), point1.getYaw(), 0.01);
      
      point1.setYaw(0.0);
      boolean boolean0 = point0.equals(point1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Point point0 = new Point(0.0, (-1941.4707405377346), (-1941.4707405377346));
      Point point1 = new Point(point0);
      point0.setPitch((-3005.09));
      boolean boolean0 = point1.equals(point0);
      assertEquals((-3005.09), point0.getPitch(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Point point0 = new Point(1966.48099, 1966.48099, 1966.48099, 1966.48099, 1966.48099, 1966.48099);
      Point point1 = new Point(1966.48099, 1966.48099, 1966.48099);
      boolean boolean0 = point0.equals(point1);
      assertEquals(1966.48099, point1.getY(), 0.01);
      assertFalse(boolean0);
      assertEquals(1966.48099, point0.getZ(), 0.01);
      assertEquals(0.0, point1.getRoll(), 0.01);
      assertEquals(0.0, point1.getPitch(), 0.01);
      assertEquals(1966.48099, point0.getX(), 0.01);
      assertEquals(3406.0449867983457, point1.magnitude(), 0.01);
      assertEquals(0.0, point1.getYaw(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Point point0 = new Point(0.0, 0.0, 0.0);
      Point point1 = new Point(point0);
      point0.setZ(2066.8402430645815);
      boolean boolean0 = point0.equals(point1);
      assertEquals(2066.8402430645815, point0.getZ(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Point point0 = new Point(0.0, 0.0, 0.0);
      Point point1 = point0.subtract(point0);
      point0.setY(2066.8402430645815);
      boolean boolean0 = point0.equals(point1);
      assertEquals(2066.8402430645815, point0.getY(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Point point0 = new Point(1486.13182, 1486.13182, 1486.13182, 1486.13182, 0.0, 2437.709);
      Point point1 = point0.unitVector((-1.0));
      assertEquals((-0.5773502691896257), point1.getY(), 0.01);
      assertEquals(2437.709, point0.getYaw(), 0.01);
      assertEquals((-0.5773502691896257), point1.getX(), 0.01);
      assertEquals(1486.13182, point0.getX(), 0.01);
      assertEquals(1486.13182, point0.getY(), 0.01);
      assertEquals(1.0, point1.magnitude(), 0.01);
      assertEquals(2437.709, point1.getYaw(), 0.01);
      assertEquals((-0.5773502691896257), point1.getZ(), 0.01);
      assertEquals(1486.13182, point1.getRoll(), 0.01);
      assertEquals(0.0, point0.getPitch(), 0.01);
      assertEquals(1486.13182, point0.getZ(), 0.01);
      assertEquals(0.0, point1.getPitch(), 0.01);
      assertEquals(1486.13182, point0.getRoll(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Point point0 = new Point((-0.14389144998949543), (-0.14389144998949543), (-0.14389144998949543), (-0.14389144998949543), (-0.14389144998949543), (-0.14389144998949543));
      Point point1 = point0.unitVector((-0.14389144998949543));
      assertEquals((-0.14389144998949543), point1.getYaw(), 0.01);
      assertEquals((-0.14389144998949543), point1.getPitch(), 0.01);
      assertEquals(0.08307576738552076, point1.getX(), 0.01);
      assertEquals((-0.14389144998949543), point1.getRoll(), 0.01);
      assertEquals((-0.14389144998949543), point0.getZ(), 0.01);
      assertEquals(0.08307576738552076, point1.getY(), 0.01);
      assertEquals((-0.14389144998949543), point0.getPitch(), 0.01);
      assertEquals((-0.14389144998949543), point0.getYaw(), 0.01);
      assertEquals((-0.14389144998949543), point0.getY(), 0.01);
      assertEquals(0.14389144998949543, point1.magnitude(), 0.01);
      assertEquals((-0.14389144998949543), point0.getX(), 0.01);
      assertEquals((-0.14389144998949543), point0.getRoll(), 0.01);
      assertEquals(0.08307576738552076, point1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Point point0 = new Point(1.0, (-1199.53731), 1.0);
      Point point1 = point0.unitVector(104.77254);
      assertEquals(0.0, point1.getPitch(), 0.01);
      assertEquals(0.0, point1.getYaw(), 0.01);
      assertEquals(0.0, point0.getYaw(), 0.01);
      assertEquals((-104.77246718522721), point1.getY(), 0.01);
      assertEquals(104.77253999999999, point1.magnitude(), 0.01);
      assertEquals(0.0, point0.getRoll(), 0.01);
      assertEquals(0.08734406700965994, point1.getZ(), 0.01);
      assertEquals(1.0, point0.getZ(), 0.01);
      assertEquals(0.08734406700965994, point1.getX(), 0.01);
      assertEquals(0.0, point0.getPitch(), 0.01);
      assertEquals(1.0, point0.getX(), 0.01);
      assertEquals(0.0, point1.getRoll(), 0.01);
      assertEquals((-1199.53731), point0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Point point0 = new Point((-1.0), 0.0, 1.0, 1.0, 0.0, 1.0);
      Point point1 = point0.multiplyXYZ(0.0);
      Point point2 = point1.subtract(point0);
      Point point3 = point2.unitVector((-2428.9536));
      assertEquals(0.0, point2.getPitch(), 0.01);
      assertEquals(0.0, point1.getY(), 0.01);
      assertEquals(0.0, point1.getPitch(), 0.01);
      assertEquals(-0.0, point1.getX(), 0.01);
      assertEquals(0.0, point1.getZ(), 0.01);
      assertEquals(0.0, point3.getYaw(), 0.01);
      assertEquals(1717.5295617474767, point3.getZ(), 0.01);
      assertEquals(2428.9536, point3.magnitude(), 0.01);
      assertEquals(-0.0, point3.getY(), 0.01);
      assertEquals(0.0, point3.getPitch(), 0.01);
      assertEquals(0.0, point3.getRoll(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Point point0 = new Point(428.958764, 0.0, 0.0, 0.0, 428.958764, 0.0);
      point0.setRoll(2.0);
      point0.unitVector(0.0);
      assertEquals(2.0, point0.getRoll(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Point point0 = new Point((-840.1854788), (-840.1854788), (-840.1854788));
      assertEquals(0.0, point0.getYaw(), 0.01);
      
      Point point1 = new Point((-1.0), (-840.1854788), 0.0);
      point0.setYaw((-840.1854788));
      point0.subtract(point1);
      assertEquals(0.0, point1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Point point0 = new Point(1.0, (-123.404792056), 1.0);
      Point point1 = point0.unitVector(0.0);
      Point point2 = point1.subtract(point0);
      assertEquals(-0.0, point1.getY(), 0.01);
      assertEquals(1.0, point0.getZ(), 0.01);
      assertEquals(123.41289520299166, point2.magnitude(), 0.01);
      assertEquals(0.0, point1.getZ(), 0.01);
      assertEquals(0.0, point2.getYaw(), 0.01);
      assertEquals(0.0, point1.magnitude(), 0.01);
      assertEquals(1.0, point0.getX(), 0.01);
      assertEquals((-1.0), point2.getX(), 0.01);
      assertEquals(0.0, point2.getPitch(), 0.01);
      assertEquals(0.0, point1.getX(), 0.01);
      assertEquals(0.0, point2.getRoll(), 0.01);
      assertEquals((-123.404792056), point0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Point point0 = new Point(1.0, (-1199.53731), 1.0);
      Point point1 = new Point((-1133.954663), (-1133.954663), 1817.1145452253, 1.0, (-1840.35820479), (-1133.954663));
      Point point2 = point0.subtract(point1);
      assertEquals((-1840.35820479), point1.getPitch(), 0.01);
      assertEquals((-1133.954663), point1.getY(), 0.01);
      assertEquals((-1133.954663), point1.getX(), 0.01);
      assertEquals(1133.954663, point2.getYaw(), 0.01);
      assertEquals(0.0, point0.getRoll(), 0.01);
      assertEquals(1.0, point0.getZ(), 0.01);
      assertEquals((-1133.954663), point1.getYaw(), 0.01);
      assertEquals(2142.590771013417, point2.magnitude(), 0.01);
      assertEquals((-1.0), point2.getRoll(), 0.01);
      assertEquals(1840.35820479, point2.getPitch(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Point point0 = new Point(428.958764, 0.0, 0.0, 0.0, 428.958764, 0.0);
      Point point1 = new Point(247.209629, 0.0, (-1.0));
      point1.setRoll(2.0);
      point1.subtract(point0);
      assertEquals(2.0, point1.getRoll(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Point point0 = new Point(0.0, 0.0, 0.0, 0.0, 0.0, (-1939.617081));
      Point point1 = point0.multiplyXYZ(0.0);
      assertEquals((-1939.617081), point1.getYaw(), 0.01);
      assertEquals(0.0, point1.getRoll(), 0.01);
      assertNotSame(point1, point0);
      assertEquals(0.0, point0.magnitude(), 0.01);
      assertTrue(point1.equals((Object)point0));
      assertEquals(0.0, point1.getPitch(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Point point0 = new Point(1486.13182, 1486.13182, 1486.13182, 1486.13182, 0.0, 2437.709);
      Point point1 = point0.multiplyXYZ(737.68596467704);
      assertEquals(2437.709, point1.getYaw(), 0.01);
      assertEquals(1096298.5852739452, point1.getX(), 0.01);
      assertEquals(1096298.5852739452, point1.getY(), 0.01);
      assertEquals(1486.13182, point0.getRoll(), 0.01);
      assertEquals(2437.709, point0.getYaw(), 0.01);
      assertEquals(1486.13182, point1.getRoll(), 0.01);
      assertEquals(0.0, point1.getPitch(), 0.01);
      assertEquals(1096298.5852739452, point1.getZ(), 0.01);
      assertEquals(1898844.8499603546, point1.magnitude(), 0.01);
      assertEquals(1486.13182, point0.getX(), 0.01);
      assertEquals(1486.13182, point0.getY(), 0.01);
      assertEquals(0.0, point0.getPitch(), 0.01);
      assertEquals(1486.13182, point0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Point point0 = new Point(1486.13182, 1486.13182, 1486.13182, 1486.13182, 0.0, 2437.709);
      Point point1 = point0.multiplyXYZ((-1.0));
      boolean boolean0 = point0.equals(point1);
      assertEquals(1486.13182, point0.getZ(), 0.01);
      assertEquals(1486.13182, point0.getRoll(), 0.01);
      assertEquals(2437.709, point1.getYaw(), 0.01);
      assertEquals(1486.13182, point0.getY(), 0.01);
      assertEquals(1486.13182, point0.getX(), 0.01);
      assertEquals(2574.0558189848057, point1.magnitude(), 0.01);
      assertEquals(1486.13182, point1.getRoll(), 0.01);
      assertEquals((-1486.13182), point1.getY(), 0.01);
      assertEquals((-1486.13182), point1.getX(), 0.01);
      assertEquals(2437.709, point0.getYaw(), 0.01);
      assertEquals(0.0, point0.getPitch(), 0.01);
      assertEquals(0.0, point1.getPitch(), 0.01);
      assertEquals((-1486.13182), point1.getZ(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Point point0 = new Point(1.0, (-123.404792056), 1.0);
      assertEquals(0.0, point0.getRoll(), 0.01);
      
      point0.setRoll((-123.404792056));
      Point point1 = point0.multiplyXYZ(1.0);
      assertTrue(point1.equals((Object)point0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Point point0 = new Point(410.4, 0.0, 83.5089525345, 410.4, 888.0, 410.4);
      Point point1 = point0.multiplyXYZ(888.0);
      assertEquals(410.4, point1.getRoll(), 0.01);
      assertEquals(0.0, point0.getY(), 0.01);
      assertEquals(364435.19999999995, point1.getX(), 0.01);
      assertEquals(410.4, point1.getYaw(), 0.01);
      assertEquals(83.5089525345, point0.getZ(), 0.01);
      assertEquals(410.4, point0.getRoll(), 0.01);
      assertEquals(74155.949850636, point1.getZ(), 0.01);
      assertEquals(410.4, point0.getX(), 0.01);
      assertEquals(888.0, point1.getPitch(), 0.01);
      assertEquals(0.0, point1.getY(), 0.01);
      assertEquals(888.0, point0.getPitch(), 0.01);
      assertEquals(371903.37440965767, point1.magnitude(), 0.01);
      assertEquals(410.4, point0.getYaw(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Point point0 = new Point(0.0, (-3232.987), (-3232.987));
      assertEquals(0.0, point0.getPitch(), 0.01);
      
      point0.setPitch((-3232.987));
      Point point1 = point0.multiplyXYZ(0.0);
      assertEquals((-3232.987), point1.getPitch(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Point point0 = new Point(0.0, 0.0, 0.0);
      double double0 = point0.magnitude();
      assertEquals(0.0, point0.getRoll(), 0.01);
      assertEquals(0.0, point0.getYaw(), 0.01);
      assertEquals(0.0, point0.getY(), 0.01);
      assertEquals(0.0, point0.getPitch(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, point0.getX(), 0.01);
      assertEquals(0.0, point0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Point point0 = new Point(0.0, 0.0, 3497.6246, 0.0, 3497.6246, 0.0);
      double double0 = point0.getZ();
      assertEquals(0.0, point0.getYaw(), 0.01);
      assertEquals(3497.6246, double0, 0.01);
      assertEquals(0.0, point0.getRoll(), 0.01);
      assertEquals(3497.6246, point0.magnitude(), 0.01);
      assertEquals(3497.6246, point0.getPitch(), 0.01);
      assertEquals(0.0, point0.getX(), 0.01);
      assertEquals(0.0, point0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Point point0 = new Point((-840.1854788), (-840.1854788), (-840.1854788));
      double double0 = point0.getZ();
      assertEquals(0.0, point0.getPitch(), 0.01);
      assertEquals(0.0, point0.getYaw(), 0.01);
      assertEquals((-840.1854788), double0, 0.01);
      assertEquals((-840.1854788), point0.getY(), 0.01);
      assertEquals((-840.1854788), point0.getX(), 0.01);
      assertEquals(0.0, point0.getRoll(), 0.01);
      assertEquals(1455.243937063184, point0.magnitude(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Point point0 = new Point(428.958764, 0.0, 0.0, 0.0, 428.958764, 0.0);
      assertEquals(0.0, point0.getYaw(), 0.01);
      
      point0.setYaw(428.958764);
      double double0 = point0.getYaw();
      assertEquals(428.958764, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Point point0 = new Point(1486.13182, 1486.13182, 1486.13182, 1486.13182, 0.0, 2437.709);
      point0.setYaw((-735.280364572));
      double double0 = point0.getYaw();
      assertEquals((-735.280364572), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Point point0 = new Point(1486.13182, 1486.13182, 1486.13182, 1486.13182, 0.0, 2437.709);
      double double0 = point0.getY();
      assertEquals(1486.13182, point0.getX(), 0.01);
      assertEquals(0.0, point0.getPitch(), 0.01);
      assertEquals(1486.13182, point0.getZ(), 0.01);
      assertEquals(2574.0558189848057, point0.magnitude(), 0.01);
      assertEquals(2437.709, point0.getYaw(), 0.01);
      assertEquals(1486.13182, double0, 0.01);
      assertEquals(1486.13182, point0.getRoll(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Point point0 = new Point((-1537.8646654057), (-1537.8646654057), 0.0, (-1537.8646654057), 4001.1, 1.0);
      double double0 = point0.getY();
      assertEquals(2174.869066911103, point0.magnitude(), 0.01);
      assertEquals((-1537.8646654057), point0.getX(), 0.01);
      assertEquals(4001.1, point0.getPitch(), 0.01);
      assertEquals((-1537.8646654057), point0.getRoll(), 0.01);
      assertEquals((-1537.8646654057), double0, 0.01);
      assertEquals(1.0, point0.getYaw(), 0.01);
      assertEquals(0.0, point0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Point point0 = new Point(410.4, 0.0, 83.5089525345, 410.4, 888.0, 410.4);
      Point point1 = point0.subtract(point0);
      double double0 = point1.getX();
      assertEquals(418.8101063171821, point0.magnitude(), 0.01);
      assertEquals(0.0, point1.getPitch(), 0.01);
      assertEquals(410.4, point0.getYaw(), 0.01);
      assertEquals(0.0, point1.magnitude(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, point1.getRoll(), 0.01);
      assertEquals(410.4, point0.getRoll(), 0.01);
      assertEquals(0.0, point1.getY(), 0.01);
      assertEquals(0.0, point1.getYaw(), 0.01);
      assertEquals(888.0, point0.getPitch(), 0.01);
      assertEquals(83.5089525345, point0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Point point0 = new Point((-1.0), 1977.604765017, 0.0, (-1.0), 0.0, 0.0);
      double double0 = point0.getX();
      assertEquals(0.0, point0.getPitch(), 0.01);
      assertEquals(1977.604765017, point0.getY(), 0.01);
      assertEquals((-1.0), point0.getRoll(), 0.01);
      assertEquals(0.0, point0.getZ(), 0.01);
      assertEquals(1977.60501784809, point0.magnitude(), 0.01);
      assertEquals(0.0, point0.getYaw(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Point point0 = new Point(1966.48099, 1966.48099, 1966.48099);
      double double0 = point0.getRoll();
      assertEquals(3406.0449867983457, point0.magnitude(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, point0.getYaw(), 0.01);
      assertEquals(1966.48099, point0.getZ(), 0.01);
      assertEquals(1966.48099, point0.getY(), 0.01);
      assertEquals(0.0, point0.getPitch(), 0.01);
      assertEquals(1966.48099, point0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Point point0 = new Point(428.958764, 0.0, 0.0, 0.0, 428.958764, 0.0);
      Point point1 = new Point(247.209629, 0.0, (-1.0));
      point1.setRoll(2.0);
      Point point2 = point0.subtract(point1);
      double double0 = point2.getRoll();
      assertEquals((-2.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Point point0 = new Point((-840.1854788), (-840.1854788), (-840.1854788));
      double double0 = point0.getPitch();
      assertEquals(1455.243937063184, point0.magnitude(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, point0.getYaw(), 0.01);
      assertEquals((-840.1854788), point0.getX(), 0.01);
      assertEquals((-840.1854788), point0.getY(), 0.01);
      assertEquals((-840.1854788), point0.getZ(), 0.01);
      assertEquals(0.0, point0.getRoll(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Point point0 = new Point(0.0, (-3232.987), (-3232.987));
      assertEquals(0.0, point0.getPitch(), 0.01);
      
      point0.setPitch((-3232.987));
      double double0 = point0.getPitch();
      assertEquals((-3232.987), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Point point0 = new Point(428.958764, 0.0, 0.0, 0.0, 428.958764, 0.0);
      Point point1 = new Point(247.209629, 0.0, (-1.0));
      Double double0 = point0.distanceTo(point1);
      assertEquals(0.0, point0.getZ(), 0.01);
      assertEquals(0.0, point0.getRoll(), 0.01);
      assertEquals(0.0, point0.getYaw(), 0.01);
      assertEquals(0.0, point1.getY(), 0.01);
      assertEquals(428.958764, point0.getPitch(), 0.01);
      assertEquals(0.0, point1.getRoll(), 0.01);
      assertEquals(0.0, point1.getPitch(), 0.01);
      assertEquals(181.75188602390958, (double)double0, 0.01);
      assertEquals(0.0, point1.getYaw(), 0.01);
      assertEquals(247.209629, point1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Point point0 = new Point(2349.55347846, 2349.55347846, 893.219282949944);
      point0.setYaw((-2690.80922982992));
      point0.add(point0);
      assertEquals((-2690.80922982992), point0.getYaw(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Point point0 = new Point(0.0, 0.0, 0.0);
      Point point1 = new Point((-1.0), 1977.604765017, 0.0, (-1.0), 0.0, 0.0);
      Point point2 = point0.add(point1);
      assertTrue(point2.equals((Object)point1));
      assertEquals(0.0, point1.getPitch(), 0.01);
      assertNotSame(point2, point1);
      assertEquals((-1.0), point2.getRoll(), 0.01);
      assertEquals(0.0, point2.getYaw(), 0.01);
      assertEquals(1977.60501784809, point2.magnitude(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Point point0 = new Point(410.4, 0.0, 83.5089525345, 410.4, 888.0, 410.4);
      Point point1 = point0.add(point0);
      assertEquals(837.6202126343642, point1.magnitude(), 0.01);
      assertEquals(888.0, point0.getPitch(), 0.01);
      assertEquals(410.4, point0.getYaw(), 0.01);
      assertEquals(410.4, point0.getRoll(), 0.01);
      assertEquals(410.4, point0.getX(), 0.01);
      assertEquals(820.8, point1.getRoll(), 0.01);
      assertEquals(83.5089525345, point0.getZ(), 0.01);
      assertEquals(1776.0, point1.getPitch(), 0.01);
      assertEquals(820.8, point1.getYaw(), 0.01);
      assertEquals(0.0, point0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Point point0 = new Point(0.0, (-3232.987), (-3232.987));
      assertEquals(0.0, point0.getPitch(), 0.01);
      
      point0.setPitch((-3232.987));
      Point point1 = point0.add(point0);
      assertEquals(0.0, point1.getRoll(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Point point0 = new Point(6110.170476290722, 6110.170476290722, 6110.170476290722);
      // Undeclared exception!
      try { 
        point0.subtract((Point) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.kinematics.Point", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Point point0 = new Point(206.63864682098998, 206.63864682098998, 206.63864682098998);
      // Undeclared exception!
      try { 
        point0.distanceTo((Point) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.kinematics.Point", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Point point0 = new Point(3553.7850468115553, 3553.7850468115553, 3553.7850468115553);
      // Undeclared exception!
      try { 
        point0.add((Point) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.kinematics.Point", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Point point0 = null;
      try {
        point0 = new Point((Point) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.myrobotlab.kinematics.Point", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Point point0 = new Point(428.958764, 0.0, 0.0, 0.0, 428.958764, 0.0);
      double double0 = point0.getX();
      assertEquals(0.0, point0.getY(), 0.01);
      assertEquals(0.0, point0.getYaw(), 0.01);
      assertEquals(0.0, point0.getZ(), 0.01);
      assertEquals(428.958764, double0, 0.01);
      assertEquals(428.958764, point0.magnitude(), 0.01);
      assertEquals(0.0, point0.getRoll(), 0.01);
      assertEquals(428.958764, point0.getPitch(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Point point0 = new Point((-840.1854788), (-840.1854788), (-840.1854788));
      double double0 = point0.magnitude();
      assertEquals((-840.1854788), point0.getX(), 0.01);
      assertEquals((-840.1854788), point0.getY(), 0.01);
      assertEquals((-840.1854788), point0.getZ(), 0.01);
      assertEquals(0.0, point0.getRoll(), 0.01);
      assertEquals(1455.243937063184, double0, 0.01);
      assertEquals(0.0, point0.getYaw(), 0.01);
      assertEquals(0.0, point0.getPitch(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Point point0 = new Point(428.958764, 0.0, 0.0, 0.0, 428.958764, 0.0);
      double double0 = point0.getZ();
      assertEquals(0.0, double0, 0.01);
      assertEquals(428.958764, point0.magnitude(), 0.01);
      assertEquals(0.0, point0.getYaw(), 0.01);
      assertEquals(0.0, point0.getY(), 0.01);
      assertEquals(0.0, point0.getRoll(), 0.01);
      assertEquals(428.958764, point0.getPitch(), 0.01);
      assertEquals(428.958764, point0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Point point0 = new Point(428.958764, 0.0, 0.0, 0.0, 428.958764, 0.0);
      double double0 = point0.getPitch();
      assertEquals(428.958764, point0.magnitude(), 0.01);
      assertEquals(0.0, point0.getZ(), 0.01);
      assertEquals(0.0, point0.getRoll(), 0.01);
      assertEquals(0.0, point0.getY(), 0.01);
      assertEquals(428.958764, point0.getX(), 0.01);
      assertEquals(0.0, point0.getYaw(), 0.01);
      assertEquals(428.958764, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Point point0 = new Point(428.958764, 0.0, 0.0, 0.0, 428.958764, 0.0);
      double double0 = point0.getYaw();
      assertEquals(0.0, point0.getY(), 0.01);
      assertEquals(0.0, point0.getZ(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(428.958764, point0.magnitude(), 0.01);
      assertEquals(428.958764, point0.getX(), 0.01);
      assertEquals(0.0, point0.getRoll(), 0.01);
      assertEquals(428.958764, point0.getPitch(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Point point0 = new Point(428.958764, 0.0, 0.0, 0.0, 428.958764, 0.0);
      double double0 = point0.getY();
      assertEquals(0.0, point0.getRoll(), 0.01);
      assertEquals(0.0, point0.getZ(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(428.958764, point0.magnitude(), 0.01);
      assertEquals(428.958764, point0.getX(), 0.01);
      assertEquals(428.958764, point0.getPitch(), 0.01);
      assertEquals(0.0, point0.getYaw(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Point point0 = new Point((-1.0), 0.0, 1.0, 1.0, 0.0, 1.0);
      double double0 = point0.getRoll();
      assertEquals(1.0, point0.getYaw(), 0.01);
      assertEquals(1.0, point0.getZ(), 0.01);
      assertEquals(1.4142135623730951, point0.magnitude(), 0.01);
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.0, point0.getY(), 0.01);
      assertEquals(0.0, point0.getPitch(), 0.01);
      assertEquals((-1.0), point0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Point point0 = new Point((-1537.8646654057), (-1537.8646654057), 0.0, (-1537.8646654057), 4001.1, 1.0);
      Point point1 = point0.unitVector((-1.0));
      Double double0 = point0.distanceTo(point1);
      assertEquals((-1537.8646654057), point0.getRoll(), 0.01);
      assertEquals(2175.869066911103, (double)double0, 0.01);
      assertEquals((-1537.8646654057), point1.getRoll(), 0.01);
      assertEquals(0.0, point0.getZ(), 0.01);
      assertEquals(4001.1, point1.getPitch(), 0.01);
      assertEquals(1.0, point1.getYaw(), 0.01);
      assertEquals(1.0, point0.getYaw(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Point point0 = new Point(0.0, 0.0, 0.0);
      Point point1 = new Point(point0);
      point1.setYaw(1293.5467);
      boolean boolean0 = point1.equals(point0);
      assertEquals(1293.5467, point1.getYaw(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Point point0 = new Point(0.0, 0.0, 0.0);
      Point point1 = new Point(point0);
      point1.setPitch(815.4977594);
      boolean boolean0 = point0.equals(point1);
      assertEquals(815.4977594, point1.getPitch(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Point point0 = new Point(1966.48099, 1966.48099, 1966.48099, 1966.48099, 1966.48099, 1966.48099);
      Point point1 = new Point(1966.48099, 1966.48099, 1966.48099);
      boolean boolean0 = point1.equals(point0);
      assertEquals(0.0, point1.getYaw(), 0.01);
      assertEquals(0.0, point1.getRoll(), 0.01);
      assertEquals(1966.48099, point0.getY(), 0.01);
      assertFalse(boolean0);
      assertEquals(1966.48099, point1.getX(), 0.01);
      assertEquals(3406.0449867983457, point1.magnitude(), 0.01);
      assertEquals(0.0, point1.getPitch(), 0.01);
      assertEquals(1966.48099, point1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Point point0 = new Point(0.0, 0.0, 0.0);
      Point point1 = new Point(point0);
      point1.setZ(2066.8402430645815);
      boolean boolean0 = point0.equals(point1);
      assertEquals(2066.8402430645815, point1.getZ(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Point point0 = new Point(1137.776707823416, 1137.776707823416, 1137.776707823416, 1137.776707823416, 1137.776707823416, 1137.776707823416);
      Point point1 = new Point(1137.776707823416, (-3537.1), (-3537.1), (-3537.1), 1137.776707823416, 1137.776707823416);
      boolean boolean0 = point1.equals(point0);
      assertEquals(5129.979401212591, point1.magnitude(), 0.01);
      assertEquals(1137.776707823416, point1.getPitch(), 0.01);
      assertEquals(1137.776707823416, point0.getY(), 0.01);
      assertFalse(boolean0);
      assertEquals(1137.776707823416, point0.getX(), 0.01);
      assertEquals((-3537.1), point1.getRoll(), 0.01);
      assertEquals(1137.776707823416, point1.getYaw(), 0.01);
      assertEquals(1137.776707823416, point0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Point point0 = new Point(0.0, 0.0, 0.0);
      Point point1 = new Point(point0);
      point1.setX((-2850.0663543));
      boolean boolean0 = point1.equals(point0);
      assertEquals((-2850.0663543), point1.getX(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Point point0 = new Point(20.83425326966418, 20.83425326966418, 20.83425326966418);
      boolean boolean0 = point0.equals("(x=20.834, y=20.834, z=20.834, roll=0.000, pitch=0.000, yaw=0.000)");
      assertEquals(0.0, point0.getPitch(), 0.01);
      assertEquals(20.83425326966418, point0.getZ(), 0.01);
      assertEquals(0.0, point0.getYaw(), 0.01);
      assertEquals(20.83425326966418, point0.getY(), 0.01);
      assertEquals(20.83425326966418, point0.getX(), 0.01);
      assertEquals(36.08598520081637, point0.magnitude(), 0.01);
      assertEquals(0.0, point0.getRoll(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Point point0 = new Point(1966.48099, 1966.48099, 1966.48099);
      boolean boolean0 = point0.equals((Object) null);
      assertEquals(3406.0449867983457, point0.magnitude(), 0.01);
      assertEquals(1966.48099, point0.getX(), 0.01);
      assertEquals(0.0, point0.getRoll(), 0.01);
      assertEquals(0.0, point0.getPitch(), 0.01);
      assertEquals(1966.48099, point0.getY(), 0.01);
      assertEquals(1966.48099, point0.getZ(), 0.01);
      assertEquals(0.0, point0.getYaw(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Point point0 = new Point(1966.48099, 1966.48099, 1966.48099);
      boolean boolean0 = point0.equals(point0);
      assertEquals(3406.0449867983457, point0.magnitude(), 0.01);
      assertEquals(1966.48099, point0.getX(), 0.01);
      assertEquals(1966.48099, point0.getY(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, point0.getYaw(), 0.01);
      assertEquals(1966.48099, point0.getZ(), 0.01);
      assertEquals(0.0, point0.getPitch(), 0.01);
      assertEquals(0.0, point0.getRoll(), 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Point point0 = new Point(0.0, 0.0, 0.0);
      String string0 = point0.toString();
      assertEquals("(x=0.000, y=0.000, z=0.000, roll=0.000, pitch=0.000, yaw=0.000)", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Point point0 = new Point(0.0, 0.0, 0.0);
      Point point1 = point0.add(point0);
      assertTrue(point1.equals((Object)point0));
      assertNotSame(point1, point0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Point point0 = new Point(0.0, 0.0, 0.0);
      Point point1 = new Point(point0);
      boolean boolean0 = point1.equals(point0);
      assertEquals(0.0, point0.getZ(), 0.01);
      assertEquals(0.0, point0.getYaw(), 0.01);
      assertEquals(0.0, point1.getRoll(), 0.01);
      assertEquals(0.0, point0.getY(), 0.01);
      assertEquals(0.0, point0.getPitch(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, point1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Point point0 = new Point(0.0, 0.0, 0.0);
      Point point1 = point0.unitVector(0.0);
      assertEquals(0.0, point0.getY(), 0.01);
      assertEquals(0.0, point1.getYaw(), 0.01);
      assertEquals(0.0, point0.getZ(), 0.01);
      assertEquals(0.0, point1.getX(), 0.01);
      assertEquals(0.0, point1.getRoll(), 0.01);
      assertEquals(0.0, point1.getPitch(), 0.01);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Point point0 = new Point(0.0, 0.0, 0.0);
      Double double0 = point0.distanceTo(point0);
      assertEquals(0.0, (double)double0, 0.01);
      assertEquals(0.0, point0.getX(), 0.01);
      assertEquals(0.0, point0.getY(), 0.01);
      assertEquals(0.0, point0.getYaw(), 0.01);
      assertEquals(0.0, point0.getRoll(), 0.01);
      assertEquals(0.0, point0.getPitch(), 0.01);
      assertEquals(0.0, point0.getZ(), 0.01);
  }
}