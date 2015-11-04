package com.jmk.command;

public class GarageOnCommand implements Command {
  Garage garage;
  
  public GarageOnCommand(Garage garage) {
    this.garage = garage;
  }
  
  public void execute() {
    garage.on();
  }
}