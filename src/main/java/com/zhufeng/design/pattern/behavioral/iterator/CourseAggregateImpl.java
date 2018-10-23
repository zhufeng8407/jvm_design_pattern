package com.zhufeng.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class CourseAggregateImpl implements CourseAggregate {
	
	private List<Course> courseList;
	
	public CourseAggregateImpl() {
		super();
		this.courseList = new ArrayList<>();
	}

	@Override
	public void addCourse(Course course) {
		courseList.add(course);
	}

	@Override
	public void removeCourse(Course course) {
		courseList.remove(course);
	}

	@Override
	public CourseIterator getCourseIterator() {
		return new CourseIteratorImpl(courseList);
	}

}
