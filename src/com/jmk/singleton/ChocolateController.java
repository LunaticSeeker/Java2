package com.jmk.singleton;

public class ChocolateController {

	public static void main(String[] args) {
		Thread th1 = new Thread(new Runnable() {
			public void run() {
				ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
				
				for(int i = 0; i < 3; i++)
					boilerControl(boiler1); // 보일러 객체 동기화
				
				/* 보일러 객체 동기화 하지 않음
				 * 보일러 객체 생성을 동기화 해도 보일러 객체를 동기화 하지 않으면 보일러 관련작업에 thread safe를 부여할 수 없다
				for(int i = 0; i < 3; i++) {
					boiler1.fill();
					boiler1.boil();
					boiler1.drain();
					System.out.println();
				}*/
			}
		});
		
		Thread th2 = new Thread(new Runnable() {
			public void run() {
				ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
				
				for(int i = 0; i < 3; i++)
					boilerControl(boiler2); // 보일러 객체 동기화
				
				/* 보일러 객체 동기화 하지 않음
				 * 보일러 객체 생성을 동기화 해도 보일러 객체를 동기화 하지 않으면 보일러 관련작업에 thread safe를 부여할 수 없다
				for(int i = 0; i < 3; i++) {
					boiler2.fill();
					boiler2.boil();
					boiler2.drain();
					System.out.println();
				}*/
			}
		});
		
		th1.start();
		th2.start();
	}
	
	private static void boilerControl(ChocolateBoiler boiler) {
		// 보일러 객체를 동기화 함으로써 보일러 관련작업에 thread safe를 부여한다
		synchronized(boiler) {
			boiler.fill();
			boiler.boil();
			boiler.drain();
			System.out.println();
		}
	}

}
