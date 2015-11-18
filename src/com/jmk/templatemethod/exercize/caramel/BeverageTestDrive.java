package com.jmk.templatemethod.exercize.caramel;

public class BeverageTestDrive {

	public static void main(String[] args) {
		CaffeinBeverage tea = new Tea();
		CaffeinBeverage coffee = new Coffee();
		CaffeinBeverage caramelMacchiato = new CaramelMacchiato();
		
		System.out.println("Making tea...");
		tea.prepareRecipe();
		
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();
		
		System.out.println("\nMaking caramel macchiato...");
		caramelMacchiato.prepareRecipe();
	}

}
