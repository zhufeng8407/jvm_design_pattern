package com.zhufeng.design.pattern.behavioral.strategy.v2;

import com.zhufeng.design.pattern.behavioral.strategy.PromotionStrategy;

public class EmptyPromotionStrategy implements PromotionStrategy {

	@Override
	public void doPromotion() {
		System.out.println("没有任何促销活动");
	}

}
