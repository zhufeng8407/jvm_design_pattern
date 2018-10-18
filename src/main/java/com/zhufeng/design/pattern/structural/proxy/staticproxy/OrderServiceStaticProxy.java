package com.zhufeng.design.pattern.structural.proxy.staticproxy;

import com.zhufeng.design.pattern.structural.proxy.IOrderService;
import com.zhufeng.design.pattern.structural.proxy.Order;
import com.zhufeng.design.pattern.structural.proxy.OrderServiceImpl;
import com.zhufeng.design.pattern.structural.proxy.db.DataSourceContextHolder;

public class OrderServiceStaticProxy {

	private IOrderService orderService;
	
	public int saveOrder(Order order) {
		beforeMethod();
		orderService = new OrderServiceImpl();
		
		int userId = order.getUserId();
		int dbRouter = userId % 2; 
		System.out.println("静态代理分配到 [db" + dbRouter + "] 处理数据");
		
		// setdataSource
		DataSourceContextHolder.setDbType("db" + dbRouter);
		orderService.saveOrder(order);
		afterMethod();
		
		return 1;
	}
	
	private void beforeMethod() {
		System.out.println("静态代理 before code");
	}
	
	private void afterMethod() {
		System.out.println("静态代理 after code");
	}
	 
}
