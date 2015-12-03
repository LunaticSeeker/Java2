package com.jmk.state;

public class SoldState implements State {
	
	private GumballMachine gm;
	
	public SoldState(GumballMachine gm) {
		this.gm = gm;
	}
	
	public void insertQuarter() {
		System.out.println("Please wait");
	}
	
	public void ejectQuarter() {
		System.out.println("Coin does not exist");
	}
	
	public void turnCrank() {
		System.out.println("Please wait, the ball is dispensed");
	}
	
	public void dispense() {
		gm.releaseBall();
		
		if(gm.getCount() > 0) {
			gm.setState(gm.getNoQuarterState());
		} else {
			gm.setState(gm.getSoldOutState());
		}
	}
	
	public void refill() {
		System.out.println("The ball is not sold out!");
	}
	
	public String toString() {
		return "SOLD";
	}

}
