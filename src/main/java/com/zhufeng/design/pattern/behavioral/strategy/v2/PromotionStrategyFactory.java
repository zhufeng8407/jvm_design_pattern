package com.zhufeng.design.pattern.behavioral.strategy.v2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.zhufeng.design.pattern.behavioral.strategy.LijianPromotionStrategy;
import com.zhufeng.design.pattern.behavioral.strategy.ManjianPromotionStrategy;
import com.zhufeng.design.pattern.behavioral.strategy.PromotionStrategy;

public class PromotionStrategyFactory {

	private static Map<String, PromotionStrategy> STRATEGY_MAP = new ConcurrentHashMap<>();

	static {
		STRATEGY_MAP.put(StrategyKey.LIJIAN, new LijianPromotionStrategy());
		STRATEGY_MAP.put(StrategyKey.MANJIAN, new ManjianPromotionStrategy());
	}

	private static final PromotionStrategy emptyPromotionStrategy = new EmptyPromotionStrategy();

	private interface StrategyKey {
		String LIJIAN = "LIJIAN";
		String MANJIAN = "MANJIAN";
	}

	public static PromotionStrategy getPromotionStrategy(String StrategyKey) {
		PromotionStrategy result = STRATEGY_MAP.get(StrategyKey);

		return result == null ? emptyPromotionStrategy : result;
	}

}
