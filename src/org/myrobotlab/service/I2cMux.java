package org.myrobotlab.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.myrobotlab.framework.Service;
import org.myrobotlab.framework.ServiceType;
import org.myrobotlab.logging.Level;
import org.myrobotlab.logging.LoggerFactory;
import org.myrobotlab.logging.Logging;
import org.myrobotlab.logging.LoggingFactory;
import org.myrobotlab.service.interfaces.DeviceControl;
import org.myrobotlab.service.interfaces.DeviceController;
import org.myrobotlab.service.interfaces.I2CControl;
import org.myrobotlab.service.interfaces.I2CController;
import org.myrobotlab.service.interfaces.ServiceInterface;
import org.slf4j.Logger;

/**
 * 
 * I2CMux - This is the MyRobotLab Service that can be used if you have several i2c devices that
 * share the same address. Create one I2CMux for each of the i2c buses that you want to use.
 * It can be used with tca9548a and possibly other devices.
 * 
 * 
 * @author Mats Onnerby
 *  
 * More Info : https://www.adafruit.com/product/2717
 * 
 */
public class I2cMux extends Service implements I2CControl, I2CController {

	private static final long serialVersionUID = 1L;

	public final static Logger log = LoggerFactory.getLogger(I2cMux.class.getCanonicalName());

	transient I2CController controller;

	public ArrayList<String> controllers = new ArrayList<String>();
	public String controllerName;
	
	public List<String> deviceAddressList = Arrays.asList(
			 "0x70","0x71","0x72","0x73","0x74","0x75","0x76","0x77");
			
	public String deviceAddress = "0x70";
	
	public List<String> deviceBusList = Arrays.asList(
			"0","1","2","3","4","5","6","7","8");	
	public String deviceBus = "1";
	
	private boolean isAttached = false;

	public static void main(String[] args) {
		LoggingFactory.getInstance().configure();
		LoggingFactory.getInstance().setLevel(Level.DEBUG);
		try {
			I2cMux i2cMux = (I2cMux) Runtime.start("i2cMux", "I2CMux");
			Runtime.start("gui", "GUIService");

		} catch (Exception e) {
			Logging.logError(e);
		}
	}

	public I2cMux(String n) {
		super(n);
		
		subscribe(Runtime.getInstance().getName(), "registered", this.getName(), "onRegistered");
	}

	public void onRegistered(ServiceInterface s) {
		refreshControllers();
		broadcastState();
	}

   public void refreshControllers() {
  	 
  	controllers = Runtime.getServiceNamesFromInterface(I2CController.class);
		controllers.remove(this.getName());
		
		broadcastState();
	}
	
 	public void setDeviceBus(String deviceBus){
		this.deviceBus = deviceBus;
		broadcastState();
  }
	
	public void setDeviceAddress(String deviceAddress){
		this.deviceAddress = deviceAddress;
		broadcastState();
  }

	@Override
	public void createI2cDevice(I2CControl control, int busAddress, int deviceAddress) {
		// TODO 
		// Create a devicelist to be able to pass reads back if needed. 
		// Currently only a pass thru / return structure
		// controller.createI2cDevice((I2CControl) this, busAddress, deviceAddress);
	}

	@Override
	public void releaseI2cDevice(I2CControl control, int busAddress, int deviceAddress) {
			// controller.releaseI2cDevice(this, busAddress, deviceAddress);
	}
	
	/**
	 * This methods sets the i2c Controller that will be used to communicate with
	 * the i2c device
	 */
	// @Override
	public boolean setController(String controllerName, String deviceBus, String deviceAddress) {
		this.controllerName = controllerName;
		return setController((I2CController) Runtime.getService(controllerName), deviceBus, deviceAddress);
	}

	public boolean setController(String controllerName) {
		this.controllerName = controllerName;
		return setController((I2CController) Runtime.getService(controllerName), this.deviceBus, this.deviceAddress);
	}
	
	public boolean setController(I2CController controller) {
		return setController(controller, this.deviceBus, this.deviceAddress);
	}
	/**
	 * This methods sets the i2c Controller that will be used to communicate with
	 * the i2c device
	 */
	public boolean setController(I2CController controller, String deviceBus, String deviceAddress) {
		if (controller == null) {
			error("setting null as controller");
			return false;
		}
		controllerName = controller.getName();
		this.controller = controller;
		this.deviceBus = deviceBus;
		this.deviceAddress = deviceAddress;
		isAttached = true;

		log.info(String.format("%s setController %s", getName(), controllerName));
		
		createDevice();
		broadcastState();
		return true;
	}
	
	/**
	 * This method creates the i2c device
	 */
	boolean createDevice() {
		if (controller != null) {
				controller.releaseI2cDevice(this, Integer.parseInt(deviceBus), Integer.decode(deviceAddress));
				controller.createI2cDevice(this, Integer.parseInt(deviceBus), Integer.decode(deviceAddress));
		}

		log.info(String.format("Creating device on bus: %s address %s", deviceBus, deviceAddress));
		return true;
	}
	
	public void unsetController() {
		controller = null;
		controllerName = null;
		this.deviceBus = null;
		this.deviceAddress = null;
		isAttached = false;
		broadcastState();
	}

	public I2CController getController() {
		return controller;
	}

	public String getControllerName() {

		String controlerName = null;

		if (controller != null) {
			controlerName = controller.getName();
		}

		return controlerName;
	}

	public boolean isAttached() {
		return isAttached;
	}

	public void setMuxBus(int busAddress) {
		byte bus[] = new byte[1];
		bus[0] = (byte) (1 << busAddress);
		log.info(String.format("setMux this.deviceBus %s this.deviceAddress %s bus[0] %s", this.deviceBus, this.deviceAddress, bus[0]));
		controller.i2cWrite(this, Integer.parseInt(this.deviceBus), Integer.decode(this.deviceAddress), bus, bus.length);
	}
	
	@Override
	public void i2cWrite(I2CControl control, int busAddress, int deviceAddress, byte[] buffer, int size) {
		setMuxBus(busAddress);
		String key = String.format("%d.%d", busAddress, deviceAddress);
		log.debug(String.format("i2cWrite busAddress x%02X deviceAddress x%02X key %s", busAddress, deviceAddress, key));
		controller.i2cWrite(this, Integer.parseInt(this.deviceBus), deviceAddress, buffer, size);
	}
	/**
	 * TODO Add demuxing. i.e the route back to the caller
	 *      The i2c will receive data that neeeds to be returned syncronous
	 *      or asycncronus
	 */
	@Override
	public int i2cRead(I2CControl control, int busAddress, int deviceAddress, byte[] buffer, int size) {
		setMuxBus(busAddress);
		controller.i2cRead(this, Integer.parseInt(this.deviceBus), deviceAddress, buffer, size);
		return buffer.length;
	}
	/**
	 * TODO Add demuxing. i.e the route back to the caller
	 *      The i2c will receive data that neeeds to be returned syncronous
	 *      or asycncronus
	 */
	@Override
	public int i2cWriteRead(I2CControl control, int busAddress, int deviceAddress, byte[] writeBuffer, int writeSize, byte[] readBuffer, int readSize) {
		setMuxBus(busAddress);
		controller.i2cWriteRead(this, Integer.parseInt(this.deviceBus), deviceAddress, writeBuffer, writeSize, readBuffer, readSize);
		return readBuffer.length;
	}

	/**
	 * This static method returns all the details of the class without it having
	 * to be constructed. It has description, categories, dependencies, and peer
	 * definitions.
	 * 
	 * @return ServiceType - returns all the data
	 * 
	 */
	static public ServiceType getMetaData() {

		ServiceType meta = new ServiceType(I2cMux.class.getCanonicalName());
		meta.addDescription("Multiplexer for i2c to be able to use multiple i2c devices");
		meta.addCategory("i2c", "control");
    meta.setAvailable(true);
    meta.setSponsor("Mats");
		return meta;
	}

	@Override
	public void setController(DeviceController controller) {
		setController(controller);	
	}

	@Override
	public void deviceAttach(DeviceControl device, Object... conf) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deviceDetach(DeviceControl device) {
		// TODO Auto-generated method stub
		
	}

}