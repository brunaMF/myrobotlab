package org.myrobotlab.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.myrobotlab.framework.Peers;
import org.myrobotlab.framework.Service;
import org.myrobotlab.kinematics.DHLink;
import org.myrobotlab.kinematics.DHRobotArm;
import org.myrobotlab.logging.LoggerFactory;
import org.myrobotlab.math.MathUtils;
import org.myrobotlab.service.interfaces.IKJointAngleListener;
import org.slf4j.Logger;

/**
 * InMoovArm - This is the Arm sub-service for the InMoov Robot.
 * It consists of 4 Servos:  bicep, rotate,shoulder,omoplate 
 * It uses Arduino to control the servos.
 *
 */
public class InMoovArm extends Service implements IKJointAngleListener {

	private static final long serialVersionUID = 1L;

	public final static Logger log = LoggerFactory.getLogger(InMoovArm.class);

	/**
	 * peer services
	 */
	transient public Servo bicep;
	transient public Servo rotate;
	transient public Servo shoulder;
	transient public Servo omoplate;
	transient public Arduino arduino;
	String side;

	// static in Java are not overloaded but overwritten - there is no
	// polymorphism for statics
	public static Peers getPeers(String name) {
		Peers peers = new Peers(name);
		peers.put("bicep", "Servo", "Bicep servo");
		peers.put("rotate", "Servo", "Rotate servo");
		peers.put("shoulder", "Servo", "Shoulder servo");
		peers.put("omoplate", "Servo", "Omoplate servo");
		peers.put("arduino", "Arduino", "Arduino controller for this arm");
		return peers;
	}

	public InMoovArm(String n) {
		super(n);
		// createReserves(n); // Ok this might work but IT CANNOT BE IN SERVICE
		// FRAMEWORK !!!!!
		bicep = (Servo) createPeer("bicep");
		rotate = (Servo) createPeer("rotate");
		shoulder = (Servo) createPeer("shoulder");
		omoplate = (Servo) createPeer("omoplate");
		arduino = (Arduino) createPeer("arduino");

		// connection details
		bicep.setPin(8);
		rotate.setPin(9);
		shoulder.setPin(10);
		omoplate.setPin(11);

		bicep.setController(arduino);
		rotate.setController(arduino);
		shoulder.setController(arduino);
		omoplate.setController(arduino);

		bicep.setMinMax(5, 90);
		rotate.setMinMax(40, 180);
		shoulder.setMinMax(0, 180);
		omoplate.setMinMax(10, 80);

		bicep.setRest(5);
		rotate.setRest(90);
		shoulder.setRest(30);
		omoplate.setRest(10);
	}

	/**
	 * attach all the servos - this must be re-entrant and accomplish the
	 * re-attachment when servos are detached
	 * 
	 * @return
	 */
	public boolean attach() {
		boolean result = true;
		sleep(InMoov.attachPauseMs);
		result &= bicep.attach();
		sleep(InMoov.attachPauseMs);
		result &= rotate.attach();
		sleep(InMoov.attachPauseMs);
		result &= shoulder.attach();
		sleep(InMoov.attachPauseMs);
		result &= omoplate.attach();
		return result;
	}

	@Override
	public void broadcastState() {
		// notify the gui
		bicep.broadcastState();
		rotate.broadcastState();
		shoulder.broadcastState();
		omoplate.broadcastState();
	}

	public boolean connect(String port) throws Exception {
		startService(); // NEEDED? I DONT THINK SO....

		if (arduino == null) {
			error("arduino is invalid");
			return false;
		}

		arduino.connect(port);

		if (!arduino.isConnected()) {
			error("arduino %s not connected", arduino.getName());
			return false;
		}

		attach();
		setSpeed(0.7f, 0.7f, 0.7f, 0.7f);
		rest();
		sleep(4000);
		setSpeed(1.0f, 1.0f, 1.0f, 1.0f);
		broadcastState();
		return true;
	}

	public void detach() {
		bicep.detach();
		sleep(InMoov.attachPauseMs);
		rotate.detach();
		sleep(InMoov.attachPauseMs);
		shoulder.detach();
		sleep(InMoov.attachPauseMs);
		omoplate.detach();
	}

	public Arduino getArduino() {
		return arduino;
	}

	public Servo getBicep() {
		return bicep;
	}

	/*
	 * public boolean load(){ super.load(); bicep.load(); rotate.load();
	 * shoulder.load(); omoplate.load(); return true; }
	 */
	@Override
	public String[] getCategories() {
		return new String[] { "robot" };
	}

	@Override
	public String getDescription() {
		return "the InMoov Arm Service";
	}

	public long getLastActivityTime() {
		long lastActivityTime = Math.max(bicep.getLastActivityTime(), rotate.getLastActivityTime());
		lastActivityTime = Math.max(lastActivityTime, shoulder.getLastActivityTime());
		lastActivityTime = Math.max(lastActivityTime, omoplate.getLastActivityTime());
		return lastActivityTime;
	}

	public Servo getOmoplate() {
		return omoplate;
	}

	public Servo getRotate() {
		return rotate;
	}

	public String getScript(String inMoovServiceName) {
		return String.format("%s.moveArm(\"%s\",%d,%d,%d,%d)\n", inMoovServiceName, side, bicep.getPos(), rotate.getPos(), shoulder.getPos(), omoplate.getPos());
	}

	public Servo getShoulder() {
		return shoulder;
	}

	public String getSide() {
		return side;
	}

	public boolean isAttached() {
		boolean attached = false;

		attached |= bicep.isAttached();
		attached |= rotate.isAttached();
		attached |= shoulder.isAttached();
		attached |= omoplate.isAttached();

		return attached;
	}

	public void moveTo(Integer bicep, Integer rotate, Integer shoulder, Integer omoplate) {
		if (log.isDebugEnabled()) {
			log.debug(String.format("%s moveTo %d %d %d %d", getName(), bicep, rotate, shoulder, omoplate));
		}
		this.bicep.moveTo(bicep);
		this.rotate.moveTo(rotate);
		this.shoulder.moveTo(shoulder);
		this.omoplate.moveTo(omoplate);
	}

	// FIXME - releasePeers()
	public void release() {
		detach();
		if (bicep != null) {
			bicep.releaseService();
			bicep = null;
		}
		if (rotate != null) {
			rotate.releaseService();
			rotate = null;
		}
		if (shoulder != null) {
			shoulder.releaseService();
			shoulder = null;
		}
		if (omoplate != null) {
			omoplate.releaseService();
			omoplate = null;
		}
	}

	public void rest() {

		setSpeed(1.0f, 1.0f, 1.0f, 1.0f);

		bicep.rest();
		rotate.rest();
		shoulder.rest();
		omoplate.rest();
	}

	@Override
	public boolean save() {
		super.save();
		bicep.save();
		rotate.save();
		shoulder.save();
		omoplate.save();
		return true;
	}

	public void setArduino(Arduino arduino) {
		this.arduino = arduino;
	}

	public void setBicep(Servo bicep) {
		this.bicep = bicep;
	}

	public void setLimits(int bicepMin, int bicepMax, int rotateMin, int rotateMax, int shoulderMin, int shoulderMax, int omoplateMin, int omoplateMax) {
		bicep.setMinMax(bicepMin, bicepMax);
		rotate.setMinMax(rotateMin, rotateMax);
		shoulder.setMinMax(shoulderMin, shoulderMax);
		omoplate.setMinMax(omoplateMin, omoplateMax);
	}

	public void setOmoplate(Servo omoplate) {
		this.omoplate = omoplate;
	}

	// ------------- added set pins
	public void setpins(Integer bicep, Integer rotate, Integer shoulder, Integer omoplate) {

		log.info(String.format("setPins %d %d %d %d %d %d", bicep, rotate, shoulder, omoplate));
		// createPeers();
		this.bicep.setPin(bicep);
		this.rotate.setPin(rotate);
		this.shoulder.setPin(shoulder);
		this.omoplate.setPin(omoplate);
	}

	public void setRotate(Servo rotate) {
		this.rotate = rotate;
	}

	public void setShoulder(Servo shoulder) {
		this.shoulder = shoulder;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public void setSpeed(Float bicep, Float rotate, Float shoulder, Float omoplate) {
		this.bicep.setSpeed(bicep);
		this.rotate.setSpeed(rotate);
		this.shoulder.setSpeed(shoulder);
		this.omoplate.setSpeed(omoplate);
	}

	@Override
	public void startService() {
		super.startService();
		bicep.startService();
		rotate.startService();
		shoulder.startService();
		omoplate.startService();
		arduino.startService();
	}

	public void test() {
			if (arduino == null) {
				error("arduino is null");
			}
			if (!arduino.isConnected()) {
				error("arduino not connected");
			}
			bicep.moveTo(bicep.getPos() + 2);
			rotate.moveTo(rotate.getPos() + 2);
			shoulder.moveTo(shoulder.getPos() + 2);
			omoplate.moveTo(omoplate.getPos() + 2);
			sleep(300);
	}

	@Override
	public void onJointAngles(Map<String, Float> angleMap) {
		// We should walk though our list of servos and see if 
		// the map has it.. if so .. move to it!
		//Peers p = InMoovArm.getPeers(getName()).getPeers("Servo");
		// TODO: look up the mapping for all the servos in the arm.
		
		// we map the servo 90 degrees to be 0 degrees.
		HashMap<String, Float> phaseShiftMap = new HashMap<String, Float>();
		phaseShiftMap.put("omoplate", 90F);
		phaseShiftMap.put("shoulder", 90F);
		phaseShiftMap.put("rotate", -90F);
		phaseShiftMap.put("bicep", 90F);
		
		HashMap<String, Float> gainMap = new HashMap<String, Float>();
		gainMap.put("omoplate", 1F);
		gainMap.put("shoulder", -1F);
		gainMap.put("rotate", 1F);
		gainMap.put("bicep", -1F);
		
		ArrayList<String> servos = new ArrayList<String>();
		servos.add("omoplate");
		servos.add("shoulder");
		servos.add("rotate");
		servos.add("bicep");
		for (String s: servos) {
			if (angleMap.containsKey(s)) {
				if ("omoplate".equals(s)) {
					Float angle = (gainMap.get(s)*angleMap.get(s) + phaseShiftMap.get(s))%360;
					omoplate.moveTo(angle);
				}
				if ("shoulder".equals(s)) {
					Float angle = (gainMap.get(s)*angleMap.get(s) + phaseShiftMap.get(s))%360;
					shoulder.moveTo(angle);
				}
				if ("rotate".equals(s)) {
					Float angle = (gainMap.get(s)*angleMap.get(s) + phaseShiftMap.get(s))%360;
					rotate.moveTo(angle);
				}
				if ("bicep".equals(s)) {
					Float angle = (gainMap.get(s)*angleMap.get(s) + phaseShiftMap.get(s))%360;
					bicep.moveTo(angle);
				}
			}
		}
	}
	
	public static DHRobotArm getDHRobotArm() {
		
		// TODO: specify this correctly and document the reference frames!
		DHRobotArm arm = new DHRobotArm();
		// d , r, theta , alpha
		
		DHLink link1 = new DHLink("omoplate", 0, 40, 0, MathUtils.degToRad(-90));
		DHLink link2 = new DHLink("shoulder", 80, 0, 0, MathUtils.degToRad(90));
		DHLink link3 = new DHLink("rotate", 280, 0, 0, MathUtils.degToRad(90));
		DHLink link4 = new DHLink("bicep", 0, 280, 0, MathUtils.degToRad(0));
		
		arm.addLink(link1);
		arm.addLink(link2);
		arm.addLink(link3);
		arm.addLink(link4);
		
		return arm;
	}
	
}
