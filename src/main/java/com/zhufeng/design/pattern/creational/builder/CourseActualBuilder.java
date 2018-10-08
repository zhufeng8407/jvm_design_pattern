package com.zhufeng.design.pattern.creational.builder;

public class CourseActualBuilder extends CourseBuilder {

	private Course course = new Course();

	@Override
	public void buildCourseName(String courseName) {
		this.course.setCourseName(courseName);
	}

	@Override
	public void buildCourseVideo(String courseVideo) {
		this.course.setCourseVideo(courseVideo);
	}

	@Override
	public void buildCourseArticle(String courseArticle) {
		this.course.setCourseArticle(courseArticle);
	}

	@Override
	public void buileCourseQA(String courseQA) {
		this.course.setCourseQA(courseQA);
	}

	@Override
	public Course makeCourse() {
		return this.course;
	}

}
