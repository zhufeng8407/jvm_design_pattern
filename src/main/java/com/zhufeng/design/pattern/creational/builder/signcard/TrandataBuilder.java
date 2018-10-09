package com.zhufeng.design.pattern.creational.builder.signcard;

public interface TrandataBuilder {

	TrandataBuilder buildBaseinfo(BaseInfo baseInfo);
	
	TrandataBuilder buildOnePolData(OnePolData onePolData);
	
	Trandata build();
}
