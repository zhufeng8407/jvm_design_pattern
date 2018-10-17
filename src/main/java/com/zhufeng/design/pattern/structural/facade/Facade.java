package com.zhufeng.design.pattern.structural.facade;

public class Facade {

	private Facade() {
	}
	
	public static void test() {
		new MoudleA().methodA();
		new MoudleB().methodB();
		new MoudleC().methodC();
	}
}
