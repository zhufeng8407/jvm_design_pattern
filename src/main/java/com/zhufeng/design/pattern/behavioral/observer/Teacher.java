package com.zhufeng.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {

	private String teacherName;

	public Teacher(String teacherName) {
		super();
		this.teacherName = teacherName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	@Override
	public void update(Observable o, Object arg) {
		Course course = (Course) o;
		Question question = (Question) arg;
		System.out.println(teacherName + "老师的" + course.getCourseName() + "课程上提出了" + question.getUserName() + "问题");
	}

}
