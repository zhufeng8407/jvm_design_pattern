package com.zhufeng.design.pattern.behavioral.strategy;

public class PromotionActivity {

	private PromotionStrategy promotionStrategy;

	public PromotionActivity(PromotionStrategy promotionStrategy) {
		super();
		this.promotionStrategy = promotionStrategy;
	}
	
	public void executePromotion() {
		promotionStrategy.doPromotion();
	}
}
