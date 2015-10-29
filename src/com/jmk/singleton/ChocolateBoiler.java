package com.jmk.singleton;

public class ChocolateBoiler {
	
	private static ChocolateBoiler uniqueInstance;
	private boolean empty;
	private boolean boiled;
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	/* 보일러 객체 생성 동기화 하지 않음
	public static ChocolateBoiler getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new ChocolateBoiler();
			System.out.println("Boiler is created");
		}
		
		return uniqueInstance;
	}*/
	
	// 보일러 객체 생성 동기화
	public static ChocolateBoiler getInstance() {
		if(uniqueInstance == null) {
			synchronized(ChocolateBoiler.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new ChocolateBoiler();
					System.out.println("Boiler is created");
				}
			}
		}
		
		return uniqueInstance;
	}
	
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
			System.out.println("fill");
		}
	}
	
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			empty = true;
			System.out.println("drain");
		}
	}
	
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
			System.out.println("boil");
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
	
}
