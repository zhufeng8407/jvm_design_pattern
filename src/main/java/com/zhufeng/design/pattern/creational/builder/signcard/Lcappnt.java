package com.zhufeng.design.pattern.creational.builder.signcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "lcappnt")
@XmlAccessorType(XmlAccessType.FIELD)
public class Lcappnt {
	//投保人姓名
	@XmlElement(name = "appntname")
	private String appntname;
	//投保人性别 1-女；0-男
	@XmlElement(name = "appntsex")
	private String appntsex;
	//投保人年龄
	@XmlElement(name = "appntage")
	private String appntage;
	//出生日期
	@XmlElement(name = "appntbirthday")
	private String appntbirthday;
	//与被保人关系
	@XmlElement(name = "appntrelationtoinsured")
	private String appntrelationtoinsured;
	//证件类型
	@XmlElement(name = "appntidtype")
	private String appntidtype;
	//证件号
	@XmlElement(name = "appntidno")
	private String appntidno;
	//证件有效期
	@XmlElement(name = "appntidenddate")
	private String appntidenddate;
	//婚姻状况
	@XmlElement(name = "appntmarriage")
	private String appntmarriage;
	//证件类型
	@XmlElement(name = "appntnativeplace")
	private String appntnativeplace;
	//户口所在地
	@XmlElement(name = "appntrgtaddress")
	private String appntrgtaddress;
	//通讯地址邮政编码
	@XmlElement(name = "appntpostaladdress")
	private String appntpostaladdress;
	//住址
	@XmlElement(name = "appnthomeaddress")
	private String appnthomeaddress;
	//首选回访电话	
	@XmlElement(name = "appntphone")
	private String appntphone;
	//投保人电子邮箱  
    @XmlElement(name = "appntemail")
    private String appntemail;
	//工作单位
	@XmlElement(name = "appntgrpname")
	private String appntgrpname;
	//是否拥有公费医疗、社会医疗保险
	@XmlElement(name = "appntsocialinsuflag")
	private String appntsocialinsuflag;
	//职业
	@XmlElement(name = "appntworktype")
	private String appntworktype;
	//兼职
	@XmlElement(name = "appntpluralitytype")
	private String appntpluralitytype;
	//职业编码
	@XmlElement(name = "appntoccupationcode")
	private String appntoccupationcode;
	//备注1
	@XmlElement(name = "remark1")
	private String remark1;
	//备注2
	@XmlElement(name = "remark2")
	private String remark2;
	//备注3
	@XmlElement(name = "remark3")
	private String remark3;
	//备注4
	@XmlElement(name = "remark4")
	private String remark4;
	//备注5
	@XmlElement(name = "remark5")
	private String remark5;
	
	 // 省（投保人）
	@XmlElement(name = "appntpostalprovince")
    private String appntpostalprovince;
    // 市（投保人）
	@XmlElement(name = "appntpostalcity")
    private String appntpostalcity;
    // 区（投保人
	@XmlElement(name = "appntpostalcounty")
    private String appntpostalcounty;
    
	public String getAppntname() {
		return appntname;
	}
	public void setAppntname(String appntname) {
		this.appntname = appntname;
	}
	public String getAppntsex() {
		return appntsex;
	}
	public void setAppntsex(String appntsex) {
		this.appntsex = appntsex;
	}
	public String getAppntage() {
		return appntage;
	}
	public void setAppntage(String appntage) {
		this.appntage = appntage;
	}
	public String getAppntbirthday() {
		return appntbirthday;
	}
	public void setAppntbirthday(String appntbirthday) {
		this.appntbirthday = appntbirthday;
	}
	public String getAppntrelationtoinsured() {
		return appntrelationtoinsured;
	}
	public void setAppntrelationtoinsured(String appntrelationtoinsured) {
		this.appntrelationtoinsured = appntrelationtoinsured;
	}
	public String getAppntidtype() {
		return appntidtype;
	}
	public void setAppntidtype(String appntidtype) {
		this.appntidtype = appntidtype;
	}
	public String getAppntidno() {
		return appntidno;
	}
	public void setAppntidno(String appntidno) {
		this.appntidno = appntidno;
	}
	public String getAppntidenddate() {
		return appntidenddate;
	}
	public void setAppntidenddate(String appntidenddate) {
		this.appntidenddate = appntidenddate;
	}
	public String getAppntmarriage() {
		return appntmarriage;
	}
	public void setAppntmarriage(String appntmarriage) {
		this.appntmarriage = appntmarriage;
	}
	public String getAppntnativeplace() {
		return appntnativeplace;
	}
	public void setAppntnativeplace(String appntnativeplace) {
		this.appntnativeplace = appntnativeplace;
	}
	public String getAppntrgtaddress() {
		return appntrgtaddress;
	}
	public void setAppntrgtaddress(String appntrgtaddress) {
		this.appntrgtaddress = appntrgtaddress;
	}
	public String getAppntpostaladdress() {
		return appntpostaladdress;
	}
	public void setAppntpostaladdress(String appntpostaladdress) {
		this.appntpostaladdress = appntpostaladdress;
	}
	public String getAppnthomeaddress() {
		return appnthomeaddress;
	}
	public void setAppnthomeaddress(String appnthomeaddress) {
		this.appnthomeaddress = appnthomeaddress;
	}
	public String getAppntphone() {
		return appntphone;
	}
	public void setAppntphone(String appntphone) {
		this.appntphone = appntphone;
	}
	public String getAppntemail() {
        return appntemail;
    }
    public void setAppntemail(String appntemail) {
        this.appntemail = appntemail;
    }
    public String getAppntgrpname() {
		return appntgrpname;
	}
	public void setAppntgrpname(String appntgrpname) {
		this.appntgrpname = appntgrpname;
	}
	public String getAppntsocialinsuflag() {
		return appntsocialinsuflag;
	}
	public void setAppntsocialinsuflag(String appntsocialinsuflag) {
		this.appntsocialinsuflag = appntsocialinsuflag;
	}
	public String getAppntworktype() {
		return appntworktype;
	}
	public void setAppntworktype(String appntworktype) {
		this.appntworktype = appntworktype;
	}
	public String getAppntpluralitytype() {
		return appntpluralitytype;
	}
	public void setAppntpluralitytype(String appntpluralitytype) {
		this.appntpluralitytype = appntpluralitytype;
	}
	public String getAppntoccupationcode() {
		return appntoccupationcode;
	}
	public void setAppntoccupationcode(String appntoccupationcode) {
		this.appntoccupationcode = appntoccupationcode;
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
	public String getAppntpostalprovince() {
		return appntpostalprovince;
	}
	public void setAppntpostalprovince(String appntpostalprovince) {
		this.appntpostalprovince = appntpostalprovince;
	}
	public String getAppntpostalcity() {
		return appntpostalcity;
	}
	public void setAppntpostalcity(String appntpostalcity) {
		this.appntpostalcity = appntpostalcity;
	}
	public String getAppntpostalcounty() {
		return appntpostalcounty;
	}
	public void setAppntpostalcounty(String appntpostalcounty) {
		this.appntpostalcounty = appntpostalcounty;
	}
	
}
