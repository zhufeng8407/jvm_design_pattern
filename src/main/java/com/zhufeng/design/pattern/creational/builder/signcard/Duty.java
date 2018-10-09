package com.zhufeng.design.pattern.creational.builder.signcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "duty")
@XmlAccessorType(XmlAccessType.FIELD)
public class Duty {
	//责任编码
	@XmlElement(name = "dutycode")
	private String dutycode;
	//保险期间
	@XmlElement(name = "insuyear")
	private String insuyear;
	//保险期间单位
	@XmlElement(name = "insuyearflag")
	private String insuyearflag;
	//保费
	@XmlElement(name = "prem")
	private String prem;
	//保额
	@XmlElement(name = "amnt")
	private String amnt;
	//责任编码
	@XmlElement(name = "calrule")
	private String calrule;
	//赠送险标记1：赠送0：非赠送
	@XmlElement(name = "standbyflag4")
	private String standbyflag4;
	//浮动费率
	@XmlElement(name = "floatrate")
	private String floatrate;
	//份数
	@XmlElement(name = "mult")
	private String mult;
	public String getDutycode() {
		return dutycode;
	}
	public void setDutycode(String dutycode) {
		this.dutycode = dutycode;
	}
	public String getInsuyear() {
		return insuyear;
	}
	public void setInsuyear(String insuyear) {
		this.insuyear = insuyear;
	}
	public String getInsuyearflag() {
		return insuyearflag;
	}
	public void setInsuyearflag(String insuyearflag) {
		this.insuyearflag = insuyearflag;
	}
	public String getPrem() {
		return prem;
	}
	public void setPrem(String prem) {
		this.prem = prem;
	}
	public String getAmnt() {
		return amnt;
	}
	public void setAmnt(String amnt) {
		this.amnt = amnt;
	}
	public String getCalrule() {
		return calrule;
	}
	public void setCalrule(String calrule) {
		this.calrule = calrule;
	}
	public String getStandbyflag4() {
		return standbyflag4;
	}
	public void setStandbyflag4(String standbyflag4) {
		this.standbyflag4 = standbyflag4;
	}
	public String getFloatrate() {
		return floatrate;
	}
	public void setFloatrate(String floatrate) {
		this.floatrate = floatrate;
	}
	public String getMult() {
		return mult;
	}
	public void setMult(String mult) {
		this.mult = mult;
	}

}
