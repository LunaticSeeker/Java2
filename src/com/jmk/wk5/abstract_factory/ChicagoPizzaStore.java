package com.jmk.wk5.abstract_factory;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String type) {
		Pizza pizza = null;
		piFactory = new ChicagoPizzaIngredientFactory();
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza(piFactory);
			pizza.setName("Chicago Style Cheese Pizza");
		} else if(type.equals("clams")) {
			pizza = new ClamsPizza(piFactory);
			pizza.setName("Chicago Style Clams Pizza");
		}
		
		return pizza;
	}

}
