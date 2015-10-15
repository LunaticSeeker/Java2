package com.jmk.wk5.abstract_factory;

public class ReggianoCheese implements Cheese {
	
	String cheese;
	
	public ReggianoCheese() {
		cheese = "Reggiano Cheese";
	}

	public String getIngredient() {
		return cheese;
	}

}
