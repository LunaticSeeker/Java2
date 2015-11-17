package com.jmk.wk5.abstract_factory;

public interface PizzaIngredientFactory {
	
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Clams createClams();

}
