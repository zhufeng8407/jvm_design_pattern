package com.zhufeng.design.pattern.structural.decorator.v2;

public abstract class AbstractDecorator extends AbstractBattercake {
	private AbstractBattercake battercake;

	public AbstractDecorator(AbstractBattercake battercake) {
		super();
		this.battercake = battercake;
	}

	@Override
	public String desc() {
		return battercake.desc();
	}

	@Override
	public int cost() {
		return battercake.cost();
	}
	
	
}
