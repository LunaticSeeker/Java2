package com.jmk.adapter.iternum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

public class IteratorEnumerationTestDrive {

	public static void main(String[] args) {
		List items = new ArrayList(Arrays.asList(args));
		Enumeration enumeration = new IteratorAdapter(items.iterator());
		
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}

}
