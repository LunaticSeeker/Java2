package com.jmk.command.party;

public class RemoteControl {
	
	Command[] onCommands, offCommands;
	
	public RemoteControl() {
		onCommands = new Command[3];
		offCommands = new Command[3];
		
		Command noCommand = new NoCommand();
		
		for(int i = 0; i < 3; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
	}
	
}
