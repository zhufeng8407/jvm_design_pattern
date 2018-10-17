package com.zhufeng.design.pattern.structural.decorator.v2;

public class SausageDecorator extends AbstractDecorator {

	public SausageDecorator(AbstractBattercake battercake) {
		super(battercake);
	}

	@Override
	public String desc() {
		return super.desc() + "加一根香肠";
	}

	@Override
	public int cost() {
		return super.cost() + 2;
	}

	
}
