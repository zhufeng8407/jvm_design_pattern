package com.zhufeng.design.pattern.creational.builder.v2;

public class Test {

	public static void main(String[] args) {
		Course course = new Course.CourseBuilder().buildCourseName("Java视频精讲").buildCourseArticle("Java视频精讲手记")
				.buildCourseVideo("Java视频精讲视频").builder();
		System.out.println(course);
	}

}
