package com.zhufeng.design.pattern.structural.proxy;

public class OrderServiceImpl implements IOrderService {

	private IOrderDao orderDao;
	
	@Override
	public int saveOrder(Order order) {
		// spring可以自动注入
		orderDao = new OrderDaoImpl();
		
		return orderDao.insertOrder(order);
	}

}
