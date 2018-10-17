package com.zhufeng.design.pattern.structural.decorator.v1;

public class BattercakeWithEgg extends Battercake {

	@Override
	public String desc() {
		return super.desc() + "加一个鸡蛋";
	}

	@Override
	public int cost() {
		return super.cost() + 1;
	}
	
}
