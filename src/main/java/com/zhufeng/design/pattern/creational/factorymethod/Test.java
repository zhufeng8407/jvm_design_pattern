package com.zhufeng.design.pattern.creational.factorymethod;

public class Test {

	public static void main(String[] args) {
		Video video = new JavaVideoFactory().createVideo();
		video.produce();
	}

}
