package com.jmk.wk5.simple_factory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		
		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getDescription() + "\n");
		
		pizza = store.orderPizza("potato");
		System.out.println("We ordered a " + pizza.getDescription() + "\n");
	}

}
