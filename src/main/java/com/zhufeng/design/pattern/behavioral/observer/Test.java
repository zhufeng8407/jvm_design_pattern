package com.zhufeng.design.pattern.behavioral.observer;

public class Test {

	public static void main(String[] args) {
		Course course = new Course("java 设计模式精讲");
		Teacher teacher = new Teacher("alpha");
		Question question = new Question("alex", "Java8的Steam编程怎么破");
		course.addObserver(teacher);
		course.produceQuestion(course, question);
	}
}
