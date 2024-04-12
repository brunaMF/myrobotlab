/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Apr 07 20:34:29 GMT 2024
 */

package org.myrobotlab.codec.serial;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class HexCodec_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.myrobotlab.codec.serial.HexCodec"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
    java.lang.System.setProperty("user.dir", "/home/iartes/myrobotlab"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(HexCodec_ESTest_scaffolding.class.getClassLoader() ,
      "org.myrobotlab.framework.interfaces.NameProvider",
      "org.myrobotlab.codec.serial.Codec",
      "org.myrobotlab.logging.LoggerFactory",
      "org.myrobotlab.codec.serial.HexCodec",
      "org.myrobotlab.framework.interfaces.LoggingSink"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(HexCodec_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.myrobotlab.logging.LoggerFactory",
      "org.myrobotlab.codec.serial.Codec",
      "org.myrobotlab.codec.serial.HexCodec",
      "org.myrobotlab.framework.Service",
      "org.myrobotlab.service.abstracts.AbstractMicrocontroller",
      "org.myrobotlab.service.Arduino",
      "org.myrobotlab.config.ConfigUtils",
      "org.myrobotlab.service.WebXR",
      "org.myrobotlab.framework.MethodCache",
      "org.myrobotlab.framework.MethodCache$MethodIndex",
      "org.myrobotlab.framework.MethodEntry",
      "org.myrobotlab.service.meta.abstracts.MetaData",
      "org.myrobotlab.service.meta.WebXRMeta",
      "org.myrobotlab.service.Tracking",
      "org.myrobotlab.service.meta.TrackingMeta",
      "org.myrobotlab.service.WolframAlpha",
      "org.myrobotlab.service.meta.WolframAlphaMeta",
      "org.myrobotlab.framework.repo.ServiceDependency",
      "org.myrobotlab.service.interfaces.DocumentPublisher",
      "org.myrobotlab.document.connector.AbstractConnector",
      "org.myrobotlab.service.FileConnector",
      "org.myrobotlab.service.meta.FileConnectorMeta",
      "org.myrobotlab.service.meta.ArduinoMeta",
      "org.myrobotlab.service.TesseractOcr",
      "org.myrobotlab.service.meta.TesseractOcrMeta",
      "org.myrobotlab.service.InMoov2Arm",
      "org.myrobotlab.kinematics.DHRobotArm",
      "org.myrobotlab.kinematics.DHLink",
      "org.myrobotlab.math.MathUtils",
      "org.myrobotlab.kinematics.DHLinkType",
      "org.myrobotlab.service.IpCamera",
      "org.myrobotlab.service.meta.IpCameraMeta",
      "org.myrobotlab.service.Cron",
      "org.myrobotlab.service.meta.CronMeta",
      "org.myrobotlab.service.HtmlParser",
      "org.myrobotlab.service.meta.HtmlParserMeta",
      "org.myrobotlab.service.LeapMotion2",
      "org.myrobotlab.service.meta.LeapMotion2Meta",
      "org.myrobotlab.service.abstracts.AbstractVideoSink",
      "org.myrobotlab.service.VideoStreamer",
      "org.myrobotlab.service.meta.VideoStreamerMeta",
      "org.myrobotlab.service.ThingSpeak",
      "org.myrobotlab.service.meta.ThingSpeakMeta",
      "org.myrobotlab.service.Gps",
      "org.myrobotlab.service.meta.GpsMeta",
      "org.myrobotlab.service._TemplateService",
      "org.myrobotlab.service.meta._TemplateServiceMeta",
      "org.myrobotlab.service.Pingdar",
      "org.myrobotlab.service.meta.PingdarMeta",
      "org.myrobotlab.service.OculusDiy",
      "org.myrobotlab.service.meta.OculusDiyMeta",
      "org.myrobotlab.service.meta.InMoov2ArmMeta",
      "org.myrobotlab.service.interfaces.TextPublisher",
      "org.myrobotlab.service.HtmlFilter",
      "org.myrobotlab.service.meta.HtmlFilterMeta",
      "org.myrobotlab.service.MouthControl",
      "org.myrobotlab.service.meta.MouthControlMeta",
      "org.myrobotlab.service.NeoPixel",
      "org.myrobotlab.service.meta.NeoPixelMeta",
      "org.myrobotlab.service.Joystick",
      "org.myrobotlab.service.meta.JoystickMeta",
      "org.myrobotlab.framework.Platform",
      "org.myrobotlab.io.FileIO",
      "org.myrobotlab.logging.Logging",
      "org.myrobotlab.service.Hd44780",
      "org.myrobotlab.service.meta.Hd44780Meta",
      "org.myrobotlab.service.DocumentPipeline",
      "org.myrobotlab.service.meta.DocumentPipelineMeta",
      "org.myrobotlab.framework.repo.ServiceExclude",
      "org.myrobotlab.service.OculusRift",
      "org.myrobotlab.service.meta.OculusRiftMeta",
      "org.myrobotlab.service.Lm75a",
      "org.myrobotlab.service.meta.Lm75aMeta",
      "org.myrobotlab.service.InMoov2Hand",
      "org.myrobotlab.service.meta.InMoov2HandMeta",
      "org.myrobotlab.service.Lidar",
      "org.myrobotlab.service.meta.LidarMeta",
      "org.myrobotlab.service.UltrasonicSensor",
      "org.myrobotlab.service.meta.UltrasonicSensorMeta",
      "org.myrobotlab.service.Ssc32UsbServoController",
      "org.myrobotlab.service.meta.Ssc32UsbServoControllerMeta",
      "org.myrobotlab.service.Serial",
      "org.myrobotlab.service.meta.SerialMeta",
      "org.myrobotlab.service.Bno055",
      "org.myrobotlab.service.Roomba",
      "org.myrobotlab.service.meta.RoombaMeta",
      "org.myrobotlab.service.GoPro",
      "org.myrobotlab.service.meta.GoProMeta",
      "org.myrobotlab.service.interfaces.SpeechSynthesis",
      "org.myrobotlab.service.abstracts.AbstractSpeechSynthesis",
      "org.myrobotlab.service.LocalSpeech",
      "org.myrobotlab.service.meta.abstracts.AbstractSpeechSynthesisMeta",
      "org.myrobotlab.service.meta.LocalSpeechMeta",
      "org.myrobotlab.service.Relay",
      "org.myrobotlab.service.meta.RelayMeta",
      "org.myrobotlab.service.abstracts.AbstractServo",
      "org.myrobotlab.service.Servo",
      "org.myrobotlab.service.meta.ServoMeta",
      "org.myrobotlab.service.ImageDisplay",
      "org.myrobotlab.service.meta.ImageDisplayMeta",
      "org.myrobotlab.service.SensorMonitor",
      "org.myrobotlab.service.meta.SensorMonitorMeta",
      "org.myrobotlab.service.data.HttpData",
      "org.myrobotlab.service.abstracts.AbstractMotorController",
      "org.myrobotlab.service.Sabertooth",
      "org.myrobotlab.service.meta.SabertoothMeta",
      "org.myrobotlab.service.AdafruitMotorHat4Pi",
      "org.myrobotlab.service.meta.AdafruitMotorHat4PiMeta",
      "org.myrobotlab.service.SegmentDisplay",
      "org.myrobotlab.service.meta.SegmentDisplayMeta",
      "org.myrobotlab.serial.Port",
      "org.myrobotlab.serial.PortQueue",
      "org.myrobotlab.framework.QueueStats",
      "org.myrobotlab.service.interfaces.MotorControl",
      "org.myrobotlab.service.abstracts.AbstractMotor",
      "org.myrobotlab.service.MotorDualPwm",
      "org.myrobotlab.service.Security",
      "org.myrobotlab.service.EddieControlBoard",
      "org.myrobotlab.service.meta.EddieControlBoardMeta",
      "org.myrobotlab.service.DiyServo",
      "org.myrobotlab.service.meta.DiyServoMeta",
      "org.myrobotlab.service.Pir",
      "org.myrobotlab.service.TestCatcher",
      "org.myrobotlab.service.meta.TestCatcherMeta",
      "org.myrobotlab.service.DatabaseConnector",
      "org.myrobotlab.service.meta.DatabaseConnectorMeta",
      "org.myrobotlab.service.ServoMixer",
      "org.myrobotlab.service.meta.ServoMixerMeta",
      "org.myrobotlab.service.RoboClaw",
      "org.myrobotlab.service.meta.RoboClawMeta",
      "org.myrobotlab.service.OpenNi",
      "org.myrobotlab.service.meta.OpenNiMeta",
      "org.myrobotlab.service.BeagleBoardBlack",
      "org.myrobotlab.service.meta.BeagleBoardBlackMeta",
      "org.myrobotlab.service.Mpr121",
      "org.myrobotlab.service.meta.Mpr121Meta",
      "org.myrobotlab.service.MockGateway",
      "org.myrobotlab.service.DruppNeck",
      "org.myrobotlab.service.meta.DruppNeckMeta",
      "org.myrobotlab.service.KafkaConnector",
      "org.myrobotlab.service.meta.KafkaConnectorMeta",
      "org.myrobotlab.service.InMoov2Torso",
      "org.myrobotlab.service.meta.InMoov2TorsoMeta",
      "org.myrobotlab.service.abstracts.AbstractPinEncoder",
      "org.myrobotlab.service.As5048AEncoder",
      "org.myrobotlab.service.interfaces.SearchPublisher",
      "org.myrobotlab.service.interfaces.ImagePublisher",
      "org.myrobotlab.service.Wikipedia",
      "org.myrobotlab.service.meta.WikipediaMeta",
      "org.myrobotlab.service.Test",
      "org.myrobotlab.service.meta.TestMeta"
    );
  }
}
