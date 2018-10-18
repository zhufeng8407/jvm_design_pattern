package com.zhufeng.design.pattern.structural.adapter.v1;

/**
 * 适配器角色	
 * @author zhufeng
 *
 */
public class Adapter implements Target {

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		adaptee.specialRequest();
	}

}
