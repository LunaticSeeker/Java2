package com.jmk.state;

public class GumballMachine {
	
	private State soldOutState;
	private State soldState;
	private State noQuarterState;
	private State hasQuarterState;
	private State breakDownState;
	private State winnerState;
	private State state;
	private int count;
	
	public GumballMachine(int count) {
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		breakDownState = new BreakDownState(this);
		winnerState = new WinnerState(this);
		
		this.count = count;
		
		if(this.count > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		
		if(state == soldState || state == winnerState) {
			dispense();	
		}
	}
	
	public void dispense() {
		state.dispense();
	}
	
	public void refill() {
		state.refill();
	}
	
	public void releaseBall() {
		System.out.println("The ball is here!");
		count--;
	}
	
	public void ejectCoin() {
		System.out.println("The coin is here!");
	}

	public int getCount() {
		return count;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public State getBreakDownState() {
		return breakDownState;
	}
	
	public State getWinnerState() {
		return winnerState;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public String toString() {
		return "Items left : " + getCount() + ", State is : " + state.toString();
	}
	
}
