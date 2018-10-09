package com.zhufeng.design.pattern.creational.builder.v2;

public class Course {

	private String courseName;

	private String courseVideo;

	private String courseArticle;

	private String courseQA;

	public Course(CourseBuilder courseBuilder) {
		this.courseName = courseBuilder.courseName;
		this.courseArticle = courseBuilder.courseArticle;
		this.courseVideo = courseBuilder.courseVideo;
		this.courseQA = courseBuilder.courseQA;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseVideo=" + courseVideo + ", courseArticle=" + courseArticle
				+ ", courseQA=" + courseQA + "]";
	}

	public static class CourseBuilder {

		private String courseName;

		private String courseVideo;

		private String courseArticle;

		private String courseQA;

		public CourseBuilder buildCourseName(String courseName) {
			this.courseName = courseName;
			return this;
		}

		public CourseBuilder buildCourseVideo(String courseVideo) {
			this.courseVideo = courseVideo;
			return this;
		}

		public CourseBuilder buildCourseArticle(String courseArticle) {
			this.courseArticle = courseArticle;
			return this;
		}

		public CourseBuilder buileCourseQA(String courseQA) {
			this.courseQA = courseQA;
			return this;
		}

		public Course builder() {
			return new Course(this);
		}
	}
}
