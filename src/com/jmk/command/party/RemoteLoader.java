package com.jmk.command.party;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		Light light = new Light();
		Stereo stereo = new Stereo("livingroom");
		Hottub hottub = new Hottub();
		
		LightOnCommand loc = new LightOnCommand(light);
		LightOffCommand loffc = new LightOffCommand(light);
		
		StereoOnCommand soc = new StereoOnCommand(stereo);
		StereoOffCommand soffc = new StereoOffCommand(stereo);
		
		HottubOnCommand hoc = new HottubOnCommand(hottub);
		HottubOffCommand hoffc = new HottubOffCommand(hottub);
		
		Command[] partyOn = {loc, soc, hoc};
		Command[] partyOff = {loffc, soffc, hoffc};
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		rc.setCommand(0, partyOnMacro, partyOffMacro);
		rc.onButtonWasPressed(0);
		rc.offButtonWasPressed(0);
	}

}
