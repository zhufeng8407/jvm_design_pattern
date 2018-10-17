package com.zhufeng.design.pattern.structural.decorator.v2;

public class Battercake extends AbstractBattercake {

	@Override
	public String desc() {
		return "煎饼";
	}

	@Override
	public int cost() {
		return 8;
	}

}
