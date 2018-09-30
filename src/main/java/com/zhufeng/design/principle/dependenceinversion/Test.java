package com.zhufeng.design.principle.dependenceinversion;

public class Test {

	public static void main(String[] args) {
		Mufeng mufeng = new Mufeng(new JavaCourse());
		mufeng.study();
	}

}
