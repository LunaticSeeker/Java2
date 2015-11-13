package com.jmk.adapter.duck;

public class TurkeyAdapter implements Duck {

	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	public void fly() {
		turkey.fly();
	}

	public void quack() {
		turkey.gobble();
	}

}
