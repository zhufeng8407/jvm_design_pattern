package com.zhufeng.design.pattern.behavioral.iterator;

import java.util.List;

public class CourseIteratorImpl implements CourseIterator {
	
	private List<Course> courseList;
	
	private int position;
	
	private Course course;
	
	public CourseIteratorImpl(List<Course> courseList) {
		super();
		this.courseList = courseList;
		position = 0;
	}

	@Override
	public Course nextCourse() {
		System.out.println("返回课程，位置是: " + position);
		course = courseList.get(position++);
		return course;
	}

	@Override
	public boolean isLastCourse() {
		return position != courseList.size();
	}

}
