package com.zhufeng.design.pattern.creational.factorymethod;

public class JavaVideoFactory extends VideoFactory {

	@Override
	public Video createVideo() {
		return new JavaVideo();
	}

}
