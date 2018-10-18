package com.zhufeng.design.pattern.structural.proxy.dynamicproxy;

import com.zhufeng.design.pattern.structural.proxy.IOrderService;
import com.zhufeng.design.pattern.structural.proxy.Order;
import com.zhufeng.design.pattern.structural.proxy.OrderServiceImpl;

public class Test {

	public static void main(String[] args) {
		Order order = new Order();
		order.setUserId(2);
		
//		IOrderService dynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
		IOrderService dynamicProxy = (IOrderService) new OrderServiceSpringDynamicProxy(new OrderServiceImpl()).bind();
		dynamicProxy.saveOrder(order);
	}

}
