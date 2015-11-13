package com.jmk.facade;

public class Light {
	
	String description;

	public Light(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " on");
	}

	public void off() {
		System.out.println(description + " off");
	}
	
}
