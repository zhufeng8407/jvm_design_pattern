package com.zhufeng.design.pattern.structural.decorator.v1;

public class BattercakeWithEggSausage extends BattercakeWithEgg {

	@Override
	public String desc() {
		return super.desc() + "加一根香肠";
	}

	@Override
	public int cost() {
		return super.cost() + 2;
	}
	
}
