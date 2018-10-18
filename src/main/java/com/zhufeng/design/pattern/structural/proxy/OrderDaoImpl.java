package com.zhufeng.design.pattern.structural.proxy;

public class OrderDaoImpl implements IOrderDao {

	@Override
	public int insertOrder(Order order) {
		System.out.println("Dao 层添加Order 成功");
		return 1;
	}

}
