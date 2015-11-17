package com.jmk.adapter.duck;

public class DuckAdapter implements Turkey {

	private Duck duck;
	
	public DuckAdapter(Duck duck) {
		this.duck = duck;
	}
	
	public void fly() {
		duck.fly();
	}

	public void gobble() {
		duck.quack();
	}

}
