package com.jmk.wk5.factory_method;

import java.util.ArrayList;

abstract public class Pizza {
	
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();

	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Dough is " + dough);
		System.out.println("Sauce is " + sauce);
		System.out.print("toppings are");
		
		for(int i = 0; i < toppings.size(); i++) {
			System.out.println(" " + toppings.get(i));
		}
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
	
}

