package com.zhufeng.design.pattern.creational.abstractfactory;

public class Test {

	public static void main(String[] args) {
		CourseFactory courseFactory = new JavaCourseFactory();
		courseFactory.getVideo().produce();
		courseFactory.getArticle().produce();
	}

}
