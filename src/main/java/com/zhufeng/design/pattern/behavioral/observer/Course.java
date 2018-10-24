package com.zhufeng.design.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Course extends Observable {

	private String courseName;

	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}

	private List<Observer> orservers = new ArrayList<>();

	@Override
	public synchronized void addObserver(Observer o) {
		orservers.add(o);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void produceQuestion(Course course, Question question) {
		System.out.println(question.getUserName() + "在" + course.getCourseName() + "课程上提出了一个问题..."
				+ question.getQuestionContent());
		this.setChanged();
		notifyObservers(question);
	}

}
