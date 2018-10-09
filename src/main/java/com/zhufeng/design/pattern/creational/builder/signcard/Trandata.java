package com.zhufeng.design.pattern.creational.builder.signcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *网销投保请求
 */
@XmlRootElement(name = "trandata")
@XmlAccessorType(XmlAccessType.FIELD)
public class Trandata {
	@XmlElement(name = "baseinfo")
	private BaseInfo baseinfo;

	@XmlElement(name = "onepoldata")
	private OnePolData onepoldata;

	public BaseInfo getBaseinfo() {
		return baseinfo;
	}

	public void setBaseinfo(BaseInfo baseinfo) {
		this.baseinfo = baseinfo;
	}

	public OnePolData getOnepoldata() {
		return onepoldata;
	}

	public void setOnepoldata(OnePolData onepoldata) {
		this.onepoldata = onepoldata;
	}
	
	
}
