package com.jmk.wk5.abstract_factory;

public class MarinaraSauce implements Sauce {
	
	String sauce;
	
	public MarinaraSauce() {
		sauce = "Marinara Sauce";
	}
	
	public String getIngredient() {
		return sauce;
	}
	
}
