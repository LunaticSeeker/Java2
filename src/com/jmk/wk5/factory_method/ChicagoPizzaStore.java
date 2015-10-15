package com.jmk.wk5.factory_method;

public class ChicagoPizzaStore extends PizzaStore {
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new ChicagoCheesePizza();
		} else if(type.equals("potato")) {
			pizza = new ChicagoPotatoPizza();
		}
		
		return pizza;
	}

}
