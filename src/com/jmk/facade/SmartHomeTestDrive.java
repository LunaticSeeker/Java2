package com.jmk.facade;

public class SmartHomeTestDrive {

	public static void main(String[] args) {
		Amplifier amp = new Amplifier("Amplifier");
		DvdPlayer dvd = new DvdPlayer("DvdPlayer", amp);
		Light light = new Light("Light");
		Projector projector = new Projector("Projector", dvd);
		Tuner tuner = new Tuner("Tuner", amp);
		
		SmartHome smartHome = new SmartHome(amp, tuner, dvd, projector, light);
		smartHome.beginStudy();
		smartHome.endStudy();
	}

}
