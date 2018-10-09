package com.zhufeng.design.pattern.creational.builder.signcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "lcinsured")
@XmlAccessorType(XmlAccessType.FIELD)
public class Lcinsured {
	//被保人客户号
	@XmlElement(name = "lcinsuredno")
	private String lcinsuredno;
	
	@XmlElement(name = "lcinsureddes")
	private Lcinsureddes lcinsureddes;
	
	@XmlElement(name = "lcdealtypeset")
	private Lcdealtypeset lcdealtypeset;
	
	@XmlElement(name = "lcinvest")
	private Lcinvest lcinvest;
	
	@XmlElement(name = "lcaddit")
	private Lcaddit lcaddit;
	
	@XmlElement(name = "lcrisks")
	private Lcrisks lcrisks;

	public String getLcinsuredno() {
		return lcinsuredno;
	}

	public void setLcinsuredno(String lcinsuredno) {
		this.lcinsuredno = lcinsuredno;
	}

	public Lcinsureddes getLcinsureddes() {
		return lcinsureddes;
	}

	public void setLcinsureddes(Lcinsureddes lcinsureddes) {
		this.lcinsureddes = lcinsureddes;
	}

	public Lcdealtypeset getLcdealtypeset() {
		return lcdealtypeset;
	}

	public void setLcdealtypeset(Lcdealtypeset lcdealtypeset) {
		this.lcdealtypeset = lcdealtypeset;
	}

	public Lcinvest getLcinvest() {
		return lcinvest;
	}

	public void setLcinvest(Lcinvest lcinvest) {
		this.lcinvest = lcinvest;
	}

	public Lcaddit getLcaddit() {
		return lcaddit;
	}

	public void setLcaddit(Lcaddit lcaddit) {
		this.lcaddit = lcaddit;
	}

	public Lcrisks getLcrisks() {
		return lcrisks;
	}

	public void setLcrisks(Lcrisks lcrisks) {
		this.lcrisks = lcrisks;
	}
	
}
