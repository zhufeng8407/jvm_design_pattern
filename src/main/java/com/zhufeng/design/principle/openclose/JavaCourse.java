package com.zhufeng.design.principle.openclose;

public class JavaCourse implements ICourse {

	private Integer id;

	private String name;

	private double price;

	public JavaCourse(Integer id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "JavaCourse [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
