package com.zhufeng.design.pattern.creational.builder;

public class Test {

	public static void main(String[] args) {
		Coach coach = new Coach();
		CourseBuilder courseBuilder = new CourseActualBuilder();
		coach.setCourseBuilder(courseBuilder);
		Course course = coach.makeCourse("java视频精讲", "java视频精讲制作视频", "java视频精讲手记", "java视频精讲QA");
		System.out.println(course);
	}

}
