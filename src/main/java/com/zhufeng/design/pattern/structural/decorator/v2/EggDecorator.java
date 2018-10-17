package com.zhufeng.design.pattern.structural.decorator.v2;

public class EggDecorator extends AbstractDecorator {

	public EggDecorator(AbstractBattercake battercake) {
		super(battercake);
	}

	@Override
	public String desc() {
		return super.desc() + "加一个鸡蛋";
	}

	@Override
	public int cost() {
		return super.cost()	+ 1;
	}
	
	

}
