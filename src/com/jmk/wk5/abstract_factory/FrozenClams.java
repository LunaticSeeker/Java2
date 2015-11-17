package com.jmk.wk5.abstract_factory;

public class FrozenClams implements Clams {
	
	String clams;
	
	public FrozenClams() {
		clams = "Frozen Clams";
	}

	public String getIngredient() {
		return clams;
	}

}
