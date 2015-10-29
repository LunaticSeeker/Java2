package com.jmk.singleton.thread_safe;

public class Singleton {

    private static Singleton uniqueInstance;
    private static int numCalled;
    
	private Singleton() {}
	
	public static synchronized Singleton getInstance() {
		if(uniqueInstance == null)
			uniqueInstance = new Singleton();
		
		System.out.println("numCalled : " + numCalled++);
		return uniqueInstance;
	}
	
}
