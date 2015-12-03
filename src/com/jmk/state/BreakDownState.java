package com.jmk.state;

public class BreakDownState implements State {
	
	GumballMachine gm;
	
	public BreakDownState(GumballMachine gm) {
		this.gm = gm;
	}

	public void insertQuarter() {
		System.out.println("The machine is break down!");
	}

	public void ejectQuarter() {
		System.out.println("The machine is break down!");
	}

	public void turnCrank() {
		System.out.println("The machine is break down!");
	}

	public void dispense() {
		System.out.println("The machine is break down!");
	}

	public void refill() {
		System.out.println("The machine is break down!");
	}
	
	public String toString() {
		return "BREAK DOWN";
	}

}
