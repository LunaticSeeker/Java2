package com.jmk.singleton.dcl;

public class Singleton {

    private static Singleton uniqueInstance;
    private static int numCalled;
    
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			synchronized(Singleton.class) {
				if(uniqueInstance == null)
					uniqueInstance = new Singleton();
			}
		}
		
		System.out.println("numCalled : " + numCalled++);
		return uniqueInstance;
	}
	
}
