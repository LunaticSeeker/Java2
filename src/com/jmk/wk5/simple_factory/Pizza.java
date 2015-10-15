package com.jmk.wk5.simple_factory;

import java.util.ArrayList;

abstract public class Pizza {
	
	String name;
	ArrayList toppings = new ArrayList();
	
	public String getName() {
		return name;
	}
	
	public void prepare() {
		System.out.println("Preparing " + name);
	}
	
	public void bake() {
		System.out.println("Baking " + name);
	}
	
	public void cut() {
		System.out.println("Cutting " + name);
	}
	
	public void box() {
		System.out.println("Boxing " + name);
	}
	
	public String getDescription() {
		String description = "";
		String topping = "";
		
		for(int i = 0; i < toppings.size(); i++) {
			 topping += (i == toppings.size()-1)? (String)toppings.get(i) : (String)toppings.get(i) + " and ";
		}
		
		description = name + " toppings are " + topping;	
		return description;
	}
	
}

