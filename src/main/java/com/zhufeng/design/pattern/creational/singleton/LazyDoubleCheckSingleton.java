package com.zhufeng.design.pattern.creational.singleton;

public class LazyDoubleCheckSingleton {

	private static volatile LazyDoubleCheckSingleton instance = null;

	private LazyDoubleCheckSingleton() {

	}

	public static LazyDoubleCheckSingleton getInstance() {
		if (instance == null) {
			synchronized (LazyDoubleCheckSingleton.class) {
				if (instance == null) {
					instance = new LazyDoubleCheckSingleton();
					// 这个有隐患重排序的问题
				}
			}
		}

		return instance;
	}
}
