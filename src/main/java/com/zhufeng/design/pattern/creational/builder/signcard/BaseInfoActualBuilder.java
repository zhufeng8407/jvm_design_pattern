package com.zhufeng.design.pattern.creational.builder.signcard;

public class BaseInfoActualBuilder implements BaseInfoBuilder {

	private BaseInfo baseInfo;

	@Override
	public BaseInfo build() {
		return this.baseInfo;
	}

	@Override
	public BaseInfoBuilder buildProperty(String... args) {
		if (this.baseInfo == null) this.baseInfo = new BaseInfo();
		if (args.length == 0) {
			
		}
		
		return this;
	}

}
