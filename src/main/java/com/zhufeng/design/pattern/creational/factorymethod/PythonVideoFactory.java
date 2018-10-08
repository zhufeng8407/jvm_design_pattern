package com.zhufeng.design.pattern.creational.factorymethod;

public class PythonVideoFactory extends VideoFactory {

	@Override
	public Video createVideo() {
		return new PythonVideo();
	}

}
