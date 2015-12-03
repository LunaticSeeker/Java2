package com.jmk.state;

public class WinnerState implements State {

	private GumballMachine gm;
	
	public WinnerState(GumballMachine gm) {
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
		
		if(gm.getCount() == 0) {
			System.out.println("Sorry, only 1 ball left");
			gm.setState(gm.getSoldOutState());
		} else {
			gm.releaseBall();
			
			if(gm.getCount() > 0) {
				gm.setState(gm.getNoQuarterState());
			} else {
				gm.setState(gm.getSoldOutState());
			}
		}
	}
	
	public void refill() {
		System.out.println("The ball is not sold out!");
	}
	
	public String toString() {
		return "WINNER";
	}
	
}
