package com.jmk.wk5.abstract_factory;

public class FreshClams implements Clams {
	
	String clams;
	
	public FreshClams() {
		clams = "Fresh Clams";
	}
	
	public String getIngredient() {
		return clams;
	}

}
