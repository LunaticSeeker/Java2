package com.jmk.templatemethod.exercize.caramel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeinBeverage {

	public void brew() {
		System.out.println("Steeping the tea");
	}

	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
	
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
	
	private String getUserInput() {
		String answer = null;
		System.out.print("Would you like lemon with your tea (y/n)? ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			answer = br.readLine();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		if(answer == null) {
			return "no";
		}
		
		return answer;
	}
	
}
