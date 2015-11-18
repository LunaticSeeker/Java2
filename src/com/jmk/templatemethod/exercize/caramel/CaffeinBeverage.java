package com.jmk.templatemethod.exercize.caramel;

public abstract class CaffeinBeverage {
	
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		
		/* ���ڷ����� ���Ͽ����� ������ �ȿ��� � �����Ʈ�� �߰� �� ���ΰ��� �����Ͽ�����
		 * ���ø��޼��� ���Ͽ����� ����Ŭ������ ����ϰ��ִ� ����Ŭ�������� �߰��ؾ� �� �����Ʈ�� �����ϰ�
		 * ������ �����Ʈ�� �߰� �� ���ΰ��� ���� ���θ� hook�޼��带 ���ؼ� �����Ѵ� */
		if(customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling water");
	}
	
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	boolean customerWantsCondiments() {
		return true;
	}
	
}
