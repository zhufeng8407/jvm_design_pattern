package com.zhufeng.design.pattern.behavioral.templatemethod;

public class FECourse extends AbstractCourse {

	@Override
	void packageCourse() {
		System.out.println("提供课程的前端代码啊");
		System.out.println("提供课程的图片等啊");
	}

}
