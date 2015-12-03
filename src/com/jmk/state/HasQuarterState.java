package com.jmk.state;

import java.util.Random;

public class HasQuarterState implements State {
	
	private GumballMachine gm;
	
	public HasQuarterState(GumballMachine gm) {
		this.gm = gm;
	}
	
	public void insertQuarter() {
		System.out.println("Already inserted");
	}
	
	public void ejectQuarter() {
		gm.ejectCoin();
		gm.setState(gm.getNoQuarterState());
	}
	
	public void turnCrank() {
		System.out.println("Crank turned");
		
		Random rand = new Random(System.currentTimeMillis());
		int r = rand.nextInt(10);
		
		if(r == 9) {
			System.out.println("Congratulation!");
			gm.setState(gm.getWinnerState());
		} else {
			gm.setState(gm.getSoldState());
		}
	}
	
	public void dispense() {
		System.out.println("Crank is not turned");
	}
	
	public void refill() {
		System.out.println("The ball is not sold out!");
	}
	
	public String toString() {
		return "HAS QUARTER";
	}
	
}
