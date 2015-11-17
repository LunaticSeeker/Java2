package com.jmk.wk5.abstract_factory;

public class ThickCrustDough implements Dough {
	
	String dough;
	
	public ThickCrustDough() {
		dough = "Thick Crust Dough";
	}

	public String getIngredient() {
		return dough;
	}

}
