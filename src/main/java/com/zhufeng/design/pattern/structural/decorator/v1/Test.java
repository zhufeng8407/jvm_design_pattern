package com.zhufeng.design.pattern.structural.decorator.v1;

public class Test {

	public static void main(String[] args) {
		Battercake battercake = new Battercake();
		System.out.println(battercake.desc() + battercake.cost());
		
		battercake = new BattercakeWithEgg();
		System.out.println(battercake.desc() + battercake.cost());
		
		battercake = new BattercakeWithEggSausage();
		System.out.println(battercake.desc() + battercake.cost());
		
	}

}
