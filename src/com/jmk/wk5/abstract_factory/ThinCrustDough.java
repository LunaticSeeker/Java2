package com.jmk.wk5.abstract_factory;

public class ThinCrustDough implements Dough {

	String dough;
	
	public ThinCrustDough() {
		dough = "Thin Crust Dough";
	}
	
	public String getIngredient() {
		return dough;
	}

}
