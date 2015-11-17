package com.jmk.singleton;

public class ChocolateController {

	public static void main(String[] args) {
		Thread th1 = new Thread(new Runnable() {
			public void run() {
				ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
				
				for(int i = 0; i < 3; i++)
					boilerControl(boiler1); // ���Ϸ� ��ü ����ȭ
				
				/* ���Ϸ� ��ü ����ȭ ���� ����
				 * ���Ϸ� ��ü ������ ����ȭ �ص� ���Ϸ� ��ü�� ����ȭ ���� ������ ���Ϸ� �����۾��� thread safe�� �ο��� �� ����
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
					boilerControl(boiler2); // ���Ϸ� ��ü ����ȭ
				
				/* ���Ϸ� ��ü ����ȭ ���� ����
				 * ���Ϸ� ��ü ������ ����ȭ �ص� ���Ϸ� ��ü�� ����ȭ ���� ������ ���Ϸ� �����۾��� thread safe�� �ο��� �� ����
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
		// ���Ϸ� ��ü�� ����ȭ �����ν� ���Ϸ� �����۾��� thread safe�� �ο��Ѵ�
		synchronized(boiler) {
			boiler.fill();
			boiler.boil();
			boiler.drain();
			System.out.println();
		}
	}

}
