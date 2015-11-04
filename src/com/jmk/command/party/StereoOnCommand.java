package com.jmk.command.party;

public class StereoOnCommand implements Command {
	
	Stereo stereo;
	
	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	public void execute() {
		stereo.on();
		stereo.setVolume(5);
	}

}
