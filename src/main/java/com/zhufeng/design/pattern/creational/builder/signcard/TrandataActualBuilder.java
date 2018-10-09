package com.zhufeng.design.pattern.creational.builder.signcard;

public class TrandataActualBuilder implements TrandataBuilder {
	
	private Trandata trandata = new Trandata();

	@Override
	public TrandataBuilder buildBaseinfo(BaseInfo baseInfo) {
		this.trandata.setBaseinfo(baseInfo);
		return this;
	}

	@Override
	public TrandataBuilder buildOnePolData(OnePolData onePolData) {
		this.trandata.setOnepoldata(onePolData);
		return this;
	}

	@Override
	public Trandata build() {
		return this.trandata;
	}

}
