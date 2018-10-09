package com.zhufeng.design.pattern.creational.builder.signcard;

public interface BaseInfoBuilder {
	BaseInfo build();
	
	BaseInfoBuilder buildProperty(String... args);
}
