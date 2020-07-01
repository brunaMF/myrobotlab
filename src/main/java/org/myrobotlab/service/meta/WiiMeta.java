package org.myrobotlab.service.meta;

import org.myrobotlab.framework.Platform;
import org.myrobotlab.framework.ServiceType;
import org.myrobotlab.logging.LoggerFactory;
import org.slf4j.Logger;

public class WiiMeta {
  public final static Logger log = LoggerFactory.getLogger(WiiMeta.class);
  
  /**
   * This static method returns all the details of the class without it having
   * to be constructed. It has description, categories, dependencies, and peer
   * definitions.
   * 
   * @return ServiceType - returns all the data
   * 
   */
  static public ServiceType getMetaData() {

    ServiceType meta = new ServiceType("org.myrobotlab.service.Wii");
    Platform platform = Platform.getLocalInstance();
    meta.addDescription("Wii mote control and sensor info");
    meta.addCategory("control", "sensors");

    meta.addDependency("wiiusej", "wiiusej", "wiiusej");
    //
    return meta;
  }
  
  
}
