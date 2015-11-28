package com.jmk.iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements MyIterator {
	
	ArrayList menuItems;
	int position;
	
	public PancakeHouseMenuIterator(ArrayList menuItems) {
		this.menuItems = menuItems;
		this.position = 0;
	}
	
	public boolean hasNext() {
		if(position >= menuItems.size()) {
			return false;
		} else {
			return true;
		}
	}
	
	public Object next() {	
		Object object = menuItems.get(position);
		position++;
		
		return object;
	}

}
