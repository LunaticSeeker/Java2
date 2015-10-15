package com.jmk.wk5.factory_method;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if(type.equals("potato")) {
			pizza = new NYPotatoPizza();
		}
		
		return pizza;
	}

}
