package com.zhufeng.design.pattern.structural.proxy.db;

public class DataSourceContextHolder {

	private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

	public static void setDbType(String dbType) {
		CONTEXT_HOLDER.set(dbType);
	}

	public static String getDbType() {
		return CONTEXT_HOLDER.get();
	}

	public static void clearDbType() {
		CONTEXT_HOLDER.remove();
	}
}
