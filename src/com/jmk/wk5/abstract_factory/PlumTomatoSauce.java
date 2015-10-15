package com.jmk.wk5.abstract_factory;

public class PlumTomatoSauce implements Sauce {

	String sauce;
	
	public PlumTomatoSauce() {
		sauce = "Plum Tomato Sauce";
	}

	public String getIngredient() {
		return sauce;
	}
	
}
