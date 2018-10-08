package com.zhufeng.design.pattern.creational.builder;

/**
 * 此处如果方法都是抽象的可以使用接口
 * @author zhufeng
 *
 */
public abstract class CourseBuilder {

	public abstract void buildCourseName(String courseName);
	
	public abstract void buildCourseVideo(String courseVideo);
	
	public abstract void buildCourseArticle(String courseArticle);
	
	public abstract void buileCourseQA(String courseQA);
	
	public abstract Course makeCourse();
}
