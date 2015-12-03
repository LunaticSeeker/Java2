package com.jmk.state;

public class NoQuarterState implements State {

    private GumballMachine gm;
	
	public NoQuarterState(GumballMachine gm) {
		this.gm = gm;
	}
	
	public void insertQuarter() {
		System.out.println("Coin inserted");
		gm.setState(gm.getHasQuarterState());
	}
	
	public void ejectQuarter() {
		System.out.println("No quarter!");
	}
	
	public void turnCrank() {
		System.out.println("Insert coin first!");
	}
	
	public void dispense() {
		System.out.println("Insert coin first!");
	}
	
	public void refill() {
		System.out.println("The ball is not sold out!");
	}
	
	public String toString() {
		return "NO QUARTER";
	}
	
}
