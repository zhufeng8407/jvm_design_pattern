package com.zhufeng.design.pattern.creational.builder.signcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "risk")
@XmlAccessorType(XmlAccessType.FIELD)
public class Risk {
	// 险种编码
	@XmlElement(name = "riskcode")
	private String riskcode;
	// 险种名称
	@XmlElement(name = "riskname")
	private String riskname;
	// 保费
	@XmlElement(name = "prem")
	private String prem;
	// 加费信息
	@XmlElement(name = "addprem")
	private String addprem;
	// 份数
	@XmlElement(name = "mult")
	private String mult;
	// 保额
	@XmlElement(name = "amnt")
	private String amnt;
	// 未使用
	@XmlElement(name = "level")
	private String level;
	// 交费方式
	@XmlElement(name = "payendyear")
	private String payendyear;
	// 保险期间
	@XmlElement(name = "insuyear")
	private String insuyear;
	// 备注
	@XmlElement(name = "remark")
	private String remark;
	// 备注1
	@XmlElement(name = "remark1")
	private String remark1;
	// 备注2
	@XmlElement(name = "remark2")
	private String remark2;
	// 备注3
	@XmlElement(name = "remark3")
	private String remark3;
	// 备注4
	@XmlElement(name = "remark4")
	private String remark4;
	// 备注5
	@XmlElement(name = "remark5")
	private String remark5;
	
	@XmlElement(name = "dutys")
	private Dutys dutys;

	public String getRiskcode() {
		return riskcode;
	}

	public void setRiskcode(String riskcode) {
		this.riskcode = riskcode;
	}

	public String getRiskname() {
		return riskname;
	}

	public void setRiskname(String riskname) {
		this.riskname = riskname;
	}

	public String getPrem() {
		return prem;
	}

	public void setPrem(String prem) {
		this.prem = prem;
	}

	public String getAddprem() {
		return addprem;
	}

	public void setAddprem(String addprem) {
		this.addprem = addprem;
	}

	public String getMult() {
		return mult;
	}

	public void setMult(String mult) {
		this.mult = mult;
	}

	public String getAmnt() {
		return amnt;
	}

	public void setAmnt(String amnt) {
		this.amnt = amnt;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getPayendyear() {
		return payendyear;
	}

	public void setPayendyear(String payendyear) {
		this.payendyear = payendyear;
	}

	public String getInsuyear() {
		return insuyear;
	}

	public void setInsuyear(String insuyear) {
		this.insuyear = insuyear;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getRemark2() {
		return remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	public String getRemark3() {
		return remark3;
	}

	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}

	public String getRemark4() {
		return remark4;
	}

	public void setRemark4(String remark4) {
		this.remark4 = remark4;
	}

	public String getRemark5() {
		return remark5;
	}

	public void setRemark5(String remark5) {
		this.remark5 = remark5;
	}

	public Dutys getDutys() {
		return dutys;
	}

	public void setDutys(Dutys dutys) {
		this.dutys = dutys;
	}

}
