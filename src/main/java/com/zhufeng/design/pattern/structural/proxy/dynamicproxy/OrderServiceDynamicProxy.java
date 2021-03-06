package com.zhufeng.design.pattern.structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.zhufeng.design.pattern.structural.proxy.Order;
import com.zhufeng.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * 动态代理类
 * 
 * @author zhufeng
 *
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

	private Object target;

	public OrderServiceDynamicProxy(Object target) {
		super();
		this.target = target;
	}

	public Object bind() {
		Class<? extends Object> clz = target.getClass();
		return Proxy.newProxyInstance(clz.getClassLoader(), clz.getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object order = args[0];
		beforeMethod(order);
		Object result = method.invoke(target, args);
		afterMethod();

		return result;
	}

	private void beforeMethod(Object object) {
		if (object instanceof Order) {
			Order order = (Order) object;
			int userId = order.getUserId();
			int dbRouter = userId % 2;
			System.out.println("动态代理分配到 [db" + dbRouter + "] 处理数据");

			// setdataSource
			DataSourceContextHolder.setDbType("db" + dbRouter);
		}
		System.out.println("动态代理 before code");
	}

	private void afterMethod() {
		System.out.println("动态代理 after code");
	}

}
