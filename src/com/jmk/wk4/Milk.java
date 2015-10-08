package com.jmk.wk4;

public class Milk extends CondimentDecorator {
	
	Beverage beverage;
	
	public Milk(Beverage beverage) {	
		this.beverage = beverage;		
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", milk";
	}
	
	public double cost() {
		return .19 + beverage.cost();
	}
	
}
