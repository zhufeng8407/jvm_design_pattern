package com.zhufeng.design.pattern.creational.builder;

public class Coach {
	private CourseBuilder courseBuilder;

	public void setCourseBuilder(CourseBuilder courseBuilder) {
		this.courseBuilder = courseBuilder;
	}

	public Course makeCourse(String courseName, String courseVideo, String courseArticle, String courseQA) {
		this.courseBuilder.buildCourseName(courseName);
		this.courseBuilder.buildCourseVideo(courseVideo);
		this.courseBuilder.buildCourseArticle(courseArticle);
		this.courseBuilder.buileCourseQA(courseQA);
		return this.courseBuilder.makeCourse();
	}
}
