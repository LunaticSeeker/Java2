package com.jmk.wk5.abstract_factory;

public class MozzarellaCheese implements Cheese {
	
	String cheese;
	
	public MozzarellaCheese() {
		cheese = "Mozzarella Cheese";
	}

	public String getIngredient() {
		return cheese;
	}
	
}
