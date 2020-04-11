package org.myrobotlab.arduino.virtual;

import org.myrobotlab.arduino.Msg;
import org.myrobotlab.logging.LoggerFactory;
import org.myrobotlab.service.Arduino;
import org.myrobotlab.service.Serial;
import org.myrobotlab.service.VirtualArduino;
import org.slf4j.Logger;


public class MrlCommIno {
  
  public final static Logger log = LoggerFactory.getLogger(MrlCommIno.class);
  
  transient Serial serial;// = new Serial();
  transient VirtualArduino virtual;

  public MrlCommIno(VirtualArduino virtual) {
    this.virtual = virtual;
    this.serial = virtual.getSerial();
    this.mrlComm = new MrlComm(virtual);
  }

  /**
   * MRLComm.c ----------------- This file is part of MyRobotLab.
   * (myrobotlab.org)
   *
   * Enjoy !
   * 
   * @authors GroG Kwatters Mats calamity and many others...
   *
   *          MRL Protocol definition -----------------
   *          MAGIC_NUMBER|NUM_BYTES|FUNCTION|DATA0|DATA1|....|DATA(N) NUM_BYTES
   *          - is the number of bytes after NUM_BYTES to the end
   *
   *          more info - http://myrobotlab.org/content/myrobotlab-api
   *
   *          General Concept ----------------- Arduino is a slave process to
   *          MyRobotLab Arduino Service - this file receives commands and sends
   *          back data. Refactoring has made MRLComm.c far more general there
   *          are only 2 "types" of things - controllers and pins - or writers
   *          and readers each now will have sub-types
   *
   *          Controllers ----------------- digital pins, pwm, pwm/dir dc
   *          motors, pwm/pwm dc motors
   *
   *          Sensors ----------------- digital polling pins, analog polling
   *          pins, range pins, oscope, trigger events
   *
   *          Combination ----------------- pingdar, non-blocking pulsin
   *
   *          Requirements: MyRobotLab running on a computer &amp; a serial
   *          connection
   *
   *          TODO - need a method to identify type of board
   *          http://forum.arduino.cc/index.php?topic=100557.0 TODO -
   *          getBoardInfo() - returns board info ! TODO - getPinInfo() -
   *          returns pin info ! TODO - implement with std::vector vs linked
   *          list -
   *          https://github.com/maniacbug/StandardCplusplus/blob/master/README.md
   *          TODO - make MRLComm a c++ library
   */

  /***********************************************************************
   * GLOBAL VARIABLES TODO - work on reducing globals and pass as parameters
   */
  MrlComm mrlComm;

  /***********************************************************************
   * STANDARD ARDUINO BEGIN setup() is called when the serial port is opened
   * unless you hack the serial port on your arduino
   *
   * Here we default out serial port to 115.2kbps.
   */
  public void setup() {
    log.info("Setup loop called.  Starting virtual mrlcomm script.");
    // start with standard serial & rate
    mrlComm.begin(serial);
    // msg->publishMrlCommBegin(MRLCOMM_VERSION);
    mrlComm.getMsg().publishMrlCommBegin(Msg.MRLCOMM_VERSION);
  }

  /**
   * STANDARD ARDUINO LOOP BEGIN This method will be called over and over again
   * by the arduino, it is the main loop any arduino sketch runs
   * 
   * @throws Exception
   *           - error if processing of a command blows up for some reason.
   */
  public void loop() throws Exception {
    // get a command and process it from
    // the serial port (if available.)
    // wdt_disable();
    // mrlComm on the java side just receives bytes now...  crap.
    
    // TODO: This is a divergence from the MrlComm.ino code!
    // We no longer have readMsg on the java side.  only onBytes(byte[])
    
    // TODO: gotta figure out how to pass the serial data into this class.
    // if we even want to try to emmulate the full arduino loop here..  
    // seems kinda reasonable for simulation purposes.. but definitely hard to maintain.
    
    if (mrlComm.readMsg()) {
      mrlComm.processCommand();
    }

    
    // the virtual device should listen for on bytes instead.
    // TODO: don't merge until this is addressed. we need to make sure that messages get relayed to this dark corner of the code
//    if (mrlComm.readMsg()) {
//      mrlComm.processCommand();
//    }
    // update devices
    mrlComm.updateDevices();
    // send back load time and memory
    // driven by getBoardInfo now !!!
    // mrlComm.publishBoardStatus();
    
  } // end of big loop

  public MrlComm getMrlComm() {
    return mrlComm;
  }
}
