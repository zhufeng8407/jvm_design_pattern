package com.zhufeng.design.principle.openclose;

public class Test {

	public static void main(String[] args) {
		ICourse course = new JavaCourse(11, "java从入门到精通", 348d);
		System.out.println(course);
	}

}
