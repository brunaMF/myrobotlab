/**
 *                    
 * @author grog (at) myrobotlab.org
 *  
 * This file is part of MyRobotLab (http://myrobotlab.org).
 *
 * MyRobotLab is free software: you can redistribute it and/or modify
 * it under the terms of the Apache License 2.0 as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version (subject to the "Classpath" exception
 * as provided in the LICENSE.txt file that accompanied this code).
 *
 * MyRobotLab is distributed in the hope that it will be useful or fun,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Apache License 2.0 for more details.
 *
 * All libraries in thirdParty bundle are subject to their own license
 * requirements - please refer to http://myrobotlab.org/libraries for 
 * details.
 * 
 * Enjoy !
 * 
 * */

package org.myrobotlab.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.myrobotlab.framework.Message;
import org.myrobotlab.framework.Service;
import org.myrobotlab.logging.LoggerFactory;
import org.myrobotlab.service.config.ClockConfig;
import org.myrobotlab.service.config.ServiceConfig;
import org.slf4j.Logger;

/**
 * Clock - This is a simple clock service that can be started and stopped. It
 * generates a pulse with a timestamp on a regular interval defined by the
 * setInterval(Integer) method. Interval is in milliseconds.
 */
public class Clock extends Service {

  public class ClockThread implements Runnable {

    private transient Thread thread = null;

    public ClockThread() {
    }

    @Override
    public void run() {
      ClockConfig c = (ClockConfig) config;

      try {

        c.running = true;
        while (c.running) {
          Thread.sleep(c.interval);
          Date now = new Date();
          for (Message msg : events) {
            send(msg);
          }
          invoke("pulse", now);
          invoke("publishTime", now);
          invoke("publishEpoch", now);
        }
      } catch (InterruptedException e) {
        log.info("ClockThread interrupt");
      }
      c.running = false;
      thread = null;
    }

    // FIXME - synchronized methods is silly here - access needs to be
    // synchronized "between" start & stop
    // TODO - create and use a single thread - use wait(sleep) notify for
    // control
    synchronized public void start() {
      if (thread == null) {
        thread = new Thread(this, getName() + "_ticking_thread");
        thread.start();
        invoke("publishClockStarted");
      } else {
        log.info("{} already started", getName());
      }
    }

    synchronized public void stop() {
      ClockConfig c = (ClockConfig) config;
      if (thread != null) {
        thread.interrupt();
      } else {
        log.info("{} already stopped");
      }

      // change state - broadcast it
      if (c.running == true) {
        broadcastState();
      }

      c.running = false;
      thread = null;
    }
  }

  private static final long serialVersionUID = 1L;

  final public static Logger log = LoggerFactory.getLogger(Clock.class);

  final protected transient ClockThread myClock = new ClockThread();

  final protected List<Message> events = new ArrayList<>();

  public Clock(String n, String id) {
    super(n, id);
  }

  public void addClockEvent(String name, String method, Object... data) {
    Message event = Message.createMessage(getName(), name, method, data);
    events.add(event);
  }

  public void clearClockEvents() {
    events.clear();
  }

  // FIXME - to spec would be "publishClockStarted()"
  // clock started event
  public void publishClockStarted() {
    ClockConfig c = (ClockConfig) config;
    c.running = true;
    log.info("clock started");
    broadcastState();
  }

  /**
   * The clock was stopped event
   */
  public void publishClockStopped() {
    ClockConfig c = (ClockConfig) config;
    c.running = false;
    broadcastState();
  }

  /**
   * Date is published at an interval here
   * 
   * @param time
   *          t
   * @return t
   */
  public Date pulse(Date time) {
    return time;
  }

  public Date publishTime(Date time) {
    return time;
  }

  public long publishEpoch(Date time) {
    return time.getTime();
  }

  public void setInterval(Integer milliseconds) {
    ClockConfig c = (ClockConfig) config;
    c.interval = milliseconds;
    broadcastState();
  }

  @Deprecated /* use startClock skipFirst is default behavior */
  public void startClock(boolean skipFirst) {

  }

  public void startClock() {
    myClock.start();
  }

  public boolean isClockRunning() {
    ClockConfig c = (ClockConfig) config;
    return c.running;
  }

  public void stopClock() {
    myClock.stop();
  }

  @Override
  public void stopService() {
    super.stopService();
    stopClock();
  }

  public Integer getInterval() {
    return ((ClockConfig) config).interval;
  }

  @Override
  public ServiceConfig apply(ServiceConfig c) {
    super.apply(c);
    ClockConfig config = (ClockConfig) c;
    if (config.running != null) {
      if (config.running) {
        startClock();
      } else {
        stopClock();
      }
    }
    return config;
  }

  public void restartClock() {
    stopClock();
    startClock();
  }

  public static void main(String[] args) throws Exception {
    try {

      Runtime.start("webgui", "WebGui");

      Clock c1 = (Clock) Runtime.start("c1", "Clock");
      c1.startClock();
      c1.stopClock();

    } catch (Exception e) {
      log.error("main threw", e);
    }
  }

}