package com.jmk.wk4;

public class Whip extends CondimentDecorator {
	
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", whipped cream";
	}
	
	public double cost() {
		return .16 + beverage.cost();
	}
	
}
