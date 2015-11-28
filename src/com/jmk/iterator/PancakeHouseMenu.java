package com.jmk.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {
	ArrayList menuItems;
 
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
		
		addItem("»ç°ú ÆÒÄÉÀÌÅ©", "»ç°ú¸À ÆÒÄÉÀÌÅ© ÀÔ´Ï´Ù", true, 4.11);
		addItem("Æ÷µµ ÆÒÄÉÀÌÅ©", "Æ÷µµ¸À ÆÒÄÉÀÌÅ© ÀÔ´Ï´Ù", true, 3.37);
		addItem("¸À½ºÅ¸ ÆÒÄÉÀÌÅ©", "¸À½ºÅ¸ Â¯Â¯¸Ç", true, 3.87);
    
		addItem("K&B's Pancake Breakfast", 
			"Pancakes with scrambled eggs, and toast", 
			true,
			2.99);
 
		addItem("Regular Pancake Breakfast", 
			"Pancakes with fried eggs, sausage", 
			false,
			2.99);
 
		addItem("Blueberry Pancakes",
			"Pancakes made with fresh blueberries, and blueberry syrup",
			true,
			3.49);
 
		addItem("Waffles",
			"Waffles, with your choice of blueberries or strawberries",
			true,
			3.59);
	}

	public void addItem(String name, String description,
	                    boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
	public ArrayList getMenuItems() {
		return menuItems;
	}
	
	public MyIterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}
  
	// other menu methods here
}
