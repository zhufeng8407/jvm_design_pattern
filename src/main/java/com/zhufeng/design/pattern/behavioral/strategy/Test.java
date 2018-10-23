package com.zhufeng.design.pattern.behavioral.strategy;

public class Test {

	public static void main(String[] args) {
		PromotionActivity promotionActivity611 = new PromotionActivity(new LijianPromotionStrategy());
		promotionActivity611.executePromotion();
		
		PromotionActivity promotionActivity1111 = new PromotionActivity(new ManjianPromotionStrategy());
		promotionActivity1111.executePromotion();
	}

}
