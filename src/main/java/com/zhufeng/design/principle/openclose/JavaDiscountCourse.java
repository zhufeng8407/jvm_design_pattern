package com.zhufeng.design.principle.openclose;

public class JavaDiscountCourse extends JavaCourse {

	public JavaDiscountCourse(Integer id, String name, double price) {
		super(id, name, price);
	}

	public double getOrignalPrice() {
		return super.getPrice();
	}

	@Override
	public double getPrice() {
		return super.getPrice() * 0.8;
	}

}
