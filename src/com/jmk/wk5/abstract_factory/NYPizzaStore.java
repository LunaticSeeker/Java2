package com.jmk.wk5.abstract_factory;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String type) {
		Pizza pizza = null;
		piFactory = new NYPizzaIngredientFactory();
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza(piFactory);
			pizza.setName("NY Style Cheese Pizza");
		} else if(type.equals("clams")) {
			pizza = new ClamsPizza(piFactory);
			pizza.setName("NY Style Clams Pizza");
		}
		
		return pizza;
	}

}
