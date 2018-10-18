package com.zhufeng.design.pattern.structural.adapter.v1;

/**
 * 被适配者，需要被适配
 * @author zhufeng
 *
 */
public class Adaptee {
	public void specialRequest() {
		System.out.println("specialRequest method");
	}
}
