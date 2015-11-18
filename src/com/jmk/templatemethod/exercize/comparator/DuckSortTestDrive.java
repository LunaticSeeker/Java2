package com.jmk.templatemethod.exercize.comparator;

import java.util.Arrays;

public class DuckSortTestDrive {

	public static void main(String[] args) {
		Duck[] ducks = {
				new Duck("Daffy", 8), 
				new Duck("Dewey", 2), 
				new Duck("Howard", 7), 
				new Duck("Louie", 2), 
				new Duck("Donald", 10), 
				new Duck("Huey", 2)
		};

		System.out.println("----- Sort by weight -----");
		Arrays.sort(ducks); // sort by comparable
		
		for(Duck duck : ducks) {
			System.out.println(duck);
		}
		
		System.out.println("\n----- Sort by name -----");
		Arrays.sort(ducks, new DuckComparator()); // sort by comparator
		
		for(Duck duck : ducks) {
			System.out.println(duck);
		}
	}

}
