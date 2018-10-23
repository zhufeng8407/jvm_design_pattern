package com.zhufeng.design.pattern.behavioral.strategy;

public class ManjianPromotionStrategy implements PromotionStrategy {

	@Override
	public void doPromotion() {
		System.out.println("执行满减活动，每满200减20元");
	}

}
