package com.jmk.templatemethod.exercize.caramel;

public abstract class CaffeinBeverage {
	
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		
		/* 데코레이터 패턴에서는 생성자 안에서 어떤 컨디먼트를 추가 할 것인가를 결정하였지만
		 * 템플릿메서드 패턴에서는 수퍼클래스를 상속하고있는 서브클래스에서 추가해야 할 컨디먼트를 결정하고
		 * 결정된 컨디먼트를 추가 할 것인가에 대한 여부를 hook메서드를 통해서 결정한다 */
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
