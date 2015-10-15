package com.jmk.wk5.abstract_factory;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory piFactory;
	
	public CheesePizza(PizzaIngredientFactory piFactory) {
		this.piFactory = piFactory;
	}
	
	public void prepare() {
		dough = piFactory.createDough();
		sauce = piFactory.createSauce();
		cheese = piFactory.createCheese();
		
		System.out.println("Preparing " + name);
		System.out.println("Dough is " + dough.getIngredient());
		System.out.println("Sauce is " + sauce.getIngredient());
		System.out.println("Cheese is " + cheese.getIngredient());
	}

}
