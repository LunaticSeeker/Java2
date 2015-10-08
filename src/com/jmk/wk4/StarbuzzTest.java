package com.jmk.wk4;

public class StarbuzzTest {
	
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
	    System.out.println(beverage.getDescription() + " $" + beverage.cost());
	    
	    beverage = new Mocha(beverage);
	    System.out.println(beverage.getDescription() + " $" + beverage.cost());
	    
	    beverage = new Whip(beverage);
	    System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}
	
}
