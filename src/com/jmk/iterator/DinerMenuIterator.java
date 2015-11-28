package com.jmk.iterator;

public class DinerMenuIterator implements MyIterator {
	
	MenuItem[] items;
	int position;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
		this.position = 0;
	}
	
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public Object next() {
		MenuItem returnValue = items[position];
		position++;
		return returnValue;
	}

}
