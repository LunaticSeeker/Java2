package com.jmk.templatemethod.exercize.comparator;

public class Duck implements Comparable {

	String name;
	int weight;
	
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String toString() {
		return name + ", weight: " + weight;
	}
	
	public int compareTo(Object o) {
		Duck otherDuck = (Duck)o;
		
		if(weight < otherDuck.weight) {
			return -1;
		} else if(weight == otherDuck.weight) {
			return 0;
		} else {
			return 1;
		}
	}

}
