package com.jmk.state;

public class SoldOutState implements State {
	
	private GumballMachine gm;
	
	public SoldOutState(GumballMachine gm) {
		this.gm = gm;
	}
	
	public void insertQuarter() {
		System.out.println("Sold out!");
	}
	
	public void ejectQuarter() {
		System.out.println("Sold out!");
	}
	
	public void turnCrank() {
		System.out.println("Sold out!");
	}
	
	public void dispense() {
		System.out.println("Sold out!");
	}
	
	public void refill() {
		System.out.println("Items refilled");
		gm.setCount(3);
		gm.setState(gm.getNoQuarterState());
	}
	
	public String toString() {
		return "SOLD OUT";
	}

}
