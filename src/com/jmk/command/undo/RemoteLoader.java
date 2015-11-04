package com.jmk.command.undo;

public class RemoteLoader {
  public static void main(String[] args) {
    RemoteControlWithUndo remote = new RemoteControlWithUndo();
    Light light = new Light("Living Room");
    LightOnCommand livingRoomLightOn = new LightOnCommand(light);
    LightOffCommand livingRoomLightOff = new LightOffCommand(light);
    remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    remote.onButtonWasPushed(0);
    remote.offButtonWasPushed(0);
  }
}