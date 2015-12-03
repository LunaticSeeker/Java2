package com.jmk.state;

public class GumballTestDrive {

	public static void main(String[] args) {
		GumballMachine gm = new GumballMachine(2);
		System.out.println(gm + "\n");
		
		gm.insertQuarter();
		gm.turnCrank();
		System.out.println(gm + "\n");
		
		gm.insertQuarter();
		gm.turnCrank();
		System.out.println(gm + "\n");
		
		gm.insertQuarter();
		gm.refill();
		gm.insertQuarter();
		gm.turnCrank();
		System.out.println(gm + "\n");
		
		gm.setState(gm.getBreakDownState()); // 기계가 고장남
		gm.insertQuarter();
		gm.turnCrank();
		System.out.println(gm + "\n");
	}

}
