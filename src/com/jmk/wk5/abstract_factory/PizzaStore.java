package com.jmk.wk5.abstract_factory;

public abstract class PizzaStore {
	
	PizzaIngredientFactory piFactory;
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

	abstract Pizza createPizza(String type);
	
}
