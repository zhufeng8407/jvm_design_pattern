package com.zhufeng.design.pattern.structural.adapter.v1;

public class Test {

	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee());

		target.request();
	}

}
