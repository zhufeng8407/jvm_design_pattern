package com.zhufeng.design.pattern.behavioral.strategy;

public class LijianPromotionStrategy implements PromotionStrategy {

	@Override
	public void doPromotion() {
		System.out.println("执行立减活动，每笔订单减去20元");
	}

}
