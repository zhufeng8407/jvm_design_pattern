package com.zhufeng.design.principle.dependenceinversion;

public class Mufeng {

	private ICourse course;

	public Mufeng(ICourse course) {
		super();
		this.course = course;
	}

	public void study() {
		course.studyCourse();
	}

	public void setCourse(ICourse course) {
		this.course = course;
	}

}
