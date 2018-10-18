package com.zhufeng.design.pattern.structural.proxy.staticproxy;

import com.zhufeng.design.pattern.structural.proxy.Order;

public class Test {

	public static void main(String[] args) {
		Order order = new Order();
		order.setUserId(1);
		OrderServiceStaticProxy proxy = new OrderServiceStaticProxy();
		proxy.saveOrder(order);
	}

}
