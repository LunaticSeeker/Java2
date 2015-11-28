package com.jmk.iterator;

public class Waitress {

	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		MyIterator pancakeIterator = pancakeHouseMenu.createIterator();
		MyIterator dinerIterator = dinerMenu.createIterator();
		
		System.out.println("MENU");
		System.out.println("BREAKFAST\n");
		printMenu(pancakeIterator);
		
		System.out.println("LUNCH and DINER\n");
		printMenu(dinerIterator);
	}
	
	public void printMenu(MyIterator iterator) {
		while(iterator.hasNext()) {
			MenuItem item = (MenuItem)iterator.next();
			if(item.isVegetarian()) {
				System.out.println("Name : " + item.getName());
				System.out.println("Description : " + item.getDescription());
				System.out.println("Price : " + item.price);
				System.out.println();	
			}
		}
	}
	
}
