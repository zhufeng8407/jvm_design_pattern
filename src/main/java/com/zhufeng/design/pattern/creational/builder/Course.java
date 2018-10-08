package com.zhufeng.design.pattern.creational.builder;

public class Course {

	private String courseName;
	
	private String courseVideo;
	
	private String courseArticle;
	
	private String courseQA;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseVideo() {
		return courseVideo;
	}

	public void setCourseVideo(String courseVideo) {
		this.courseVideo = courseVideo;
	}

	public String getCourseArticle() {
		return courseArticle;
	}

	public void setCourseArticle(String courseArticle) {
		this.courseArticle = courseArticle;
	}

	public String getCourseQA() {
		return courseQA;
	}

	public void setCourseQA(String courseQA) {
		this.courseQA = courseQA;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseVideo=" + courseVideo + ", courseArticle=" + courseArticle
				+ ", courseQA=" + courseQA + "]";
	}
	
}
