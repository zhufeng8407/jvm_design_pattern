package com.zhufeng.design.pattern.structural.decorator.v2;

public class Test {

	public static void main(String[] args) {
		AbstractBattercake battercake = new Battercake();
		battercake = new SausageDecorator(new SausageDecorator(new EggDecorator(new EggDecorator(battercake))));
		System.out.println(battercake.desc() + battercake.cost());
	}

}
