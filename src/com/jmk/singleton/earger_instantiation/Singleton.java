package com.jmk.singleton.earger_instantiation;

public class Singleton {

    private static Singleton uniqueInstance = new Singleton();
    private static int numCalled;
	
	public static Singleton getInstance() {
		System.out.println("numCalled : " + numCalled++);
		return uniqueInstance;
	}
	
}
