package com.jmk.wk5.simple_factory;

public class PizzaStore {
	
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
	    Pizza pizza = factory.createPizza(type);
	    
	    System.out.println("--- Making a " + pizza.getName() + " ---");	
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

}
