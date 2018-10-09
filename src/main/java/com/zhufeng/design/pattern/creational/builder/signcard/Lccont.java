package com.zhufeng.design.pattern.creational.builder.signcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "lccont")
@XmlAccessorType(XmlAccessType.FIELD)
public class Lccont {
	// 产品总述
	@XmlElement(name = "product")
	private String product;
	// 投保单号
	@XmlElement(name = "prtno")
	private String prtno;
	// 保单号
	@XmlElement(name = "contno")
	private String contno;
	// 电子投保单号确认书号
	@XmlElement(name = "prtcheckno")
	private String prtcheckno;
	// 签单日期
	@XmlElement(name = "signdate")
	private String signdate;
	// 签单时间
	@XmlElement(name = "signtime")
	private String signtime;
	// 保单申请日期
	@XmlElement(name = "polapplydate")
	private String polapplydate;
	// 保单生效日期
	@XmlElement(name = "cvalidate")
	private String cvalidate;
	// 管理机构
	@XmlElement(name = "managecom")
	private String managecom;
	// 销售渠道（14-网销）
	@XmlElement(name = "salechnl")
	private String salechnl;
	// 代理人编码
	@XmlElement(name = "agentcode")
	private String agentcode;
	// 代理人姓名
	@XmlElement(name = "agentname")
	private String agentname;
	// 代理人所在区组
	@XmlElement(name = "agentgroup")
	private String agentgroup;
	// 代理人所属机构
	@XmlElement(name = "agentcom")
	private String agentcom;
	// 保单送达方式 0-返回银行领取；1-邮寄或专递
	@XmlElement(name = "getpolmode")
	private String getpolmode;
	// 首期交费形式（G-支付宝）
	@XmlElement(name = "paymode")
	private String paymode;
	// 续期交费形式（G-支付宝）
	@XmlElement(name = "paylocation")
	private String paylocation;
	// 银行编码
	@XmlElement(name = "bankcode")
	private String bankcode;
	// 账户名
	@XmlElement(name = "accname")
	private String accname;
	// 账号
	@XmlElement(name = "bankaccno")
	private String bankaccno;
	// 续期银行编码
	@XmlElement(name = "renbankcode")
	private String renbankcode;
	// 续期账户名
	@XmlElement(name = "renaccname")
	private String renaccname;
	// 续期银行账号
	@XmlElement(name = "renbankaccno")
	private String renbankaccno;
	// 溢交处理方式 1-退费；2-抵交续期保费
	@XmlElement(name = "outpayflag")
	private String outpayflag;
	// 浮动费率
	@XmlElement(name = "floatrate")
	private String floatrate;
	// 交费间隔 0-趸交；1-月交；3-季交；6-半年交；12-年交
	@XmlElement(name = "payintv")
	private String payintv;
	// 自动垫交标志 1-自动垫交；2-不自动垫交
	@XmlElement(name = "autopayflag")
	private String autopayflag;
	// 自动续保标志 -1-自动续保；-2-不续保
	@XmlElement(name = "rnewflag")
	private String rnewflag;
	// 特别约定
	@XmlElement(name = "spec")
	private String spec;
	// 初审员签名
	@XmlElement(name = "signname")
	private String signname;
	// 初审日期
	@XmlElement(name = "firsttrialdate")
	private String firsttrialdate;
	// 续期缴费提示 0-否；1-是
	@XmlElement(name = "xqremindflag")
	private String xqremindflag;
	// 电子保单标识
	@XmlElement(name = "electroniccontflag")
	private String electroniccontflag;
	// 祝福语
	@XmlElement(name = "blessingmark")
	private String blessingmark;
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
	// 卡单编码
	@XmlElement(name = "cardno")
	private String cardno;

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getPrtno() {
		return prtno;
	}

	public void setPrtno(String prtno) {
		this.prtno = prtno;
	}

	public String getContno() {
		return contno;
	}

	public void setContno(String contno) {
		this.contno = contno;
	}

	public String getPrtcheckno() {
		return prtcheckno;
	}

	public void setPrtcheckno(String prtcheckno) {
		this.prtcheckno = prtcheckno;
	}

	public String getSigndate() {
		return signdate;
	}

	public void setSigndate(String signdate) {
		this.signdate = signdate;
	}

	public String getSigntime() {
		return signtime;
	}

	public void setSigntime(String signtime) {
		this.signtime = signtime;
	}

	public String getPolapplydate() {
		return polapplydate;
	}

	public void setPolapplydate(String polapplydate) {
		this.polapplydate = polapplydate;
	}

	public String getCvalidate() {
		return cvalidate;
	}

	public void setCvalidate(String cvalidate) {
		this.cvalidate = cvalidate;
	}

	public String getManagecom() {
		return managecom;
	}

	public void setManagecom(String managecom) {
		this.managecom = managecom;
	}

	public String getSalechnl() {
		return salechnl;
	}

	public void setSalechnl(String salechnl) {
		this.salechnl = salechnl;
	}

	public String getAgentcode() {
		return agentcode;
	}

	public void setAgentcode(String agentcode) {
		this.agentcode = agentcode;
	}

	public String getAgentname() {
		return agentname;
	}

	public void setAgentname(String agentname) {
		this.agentname = agentname;
	}

	public String getAgentgroup() {
		return agentgroup;
	}

	public void setAgentgroup(String agentgroup) {
		this.agentgroup = agentgroup;
	}

	public String getAgentcom() {
		return agentcom;
	}

	public void setAgentcom(String agentcom) {
		this.agentcom = agentcom;
	}

	public String getGetpolmode() {
		return getpolmode;
	}

	public void setGetpolmode(String getpolmode) {
		this.getpolmode = getpolmode;
	}

	public String getPaymode() {
		return paymode;
	}

	public void setPaymode(String paymode) {
		this.paymode = paymode;
	}

	public String getPaylocation() {
		return paylocation;
	}

	public void setPaylocation(String paylocation) {
		this.paylocation = paylocation;
	}

	public String getBankcode() {
		return bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	public String getAccname() {
		return accname;
	}

	public void setAccname(String accname) {
		this.accname = accname;
	}

	public String getBankaccno() {
		return bankaccno;
	}

	public void setBankaccno(String bankaccno) {
		this.bankaccno = bankaccno;
	}

	public String getRenbankcode() {
		return renbankcode;
	}

	public void setRenbankcode(String renbankcode) {
		this.renbankcode = renbankcode;
	}

	public String getRenaccname() {
		return renaccname;
	}

	public void setRenaccname(String renaccname) {
		this.renaccname = renaccname;
	}

	public String getRenbankaccno() {
		return renbankaccno;
	}

	public void setRenbankaccno(String renbankaccno) {
		this.renbankaccno = renbankaccno;
	}

	public String getOutpayflag() {
		return outpayflag;
	}

	public void setOutpayflag(String outpayflag) {
		this.outpayflag = outpayflag;
	}

	public String getFloatrate() {
		return floatrate;
	}

	public void setFloatrate(String floatrate) {
		this.floatrate = floatrate;
	}

	public String getPayintv() {
		return payintv;
	}

	public void setPayintv(String payintv) {
		this.payintv = payintv;
	}

	public String getAutopayflag() {
		return autopayflag;
	}

	public void setAutopayflag(String autopayflag) {
		this.autopayflag = autopayflag;
	}

	public String getRnewflag() {
		return rnewflag;
	}

	public void setRnewflag(String rnewflag) {
		this.rnewflag = rnewflag;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getSignname() {
		return signname;
	}

	public void setSignname(String signname) {
		this.signname = signname;
	}

	public String getFirsttrialdate() {
		return firsttrialdate;
	}

	public void setFirsttrialdate(String firsttrialdate) {
		this.firsttrialdate = firsttrialdate;
	}

	public String getXqremindflag() {
		return xqremindflag;
	}

	public void setXqremindflag(String xqremindflag) {
		this.xqremindflag = xqremindflag;
	}

	public String getElectroniccontflag() {
		return electroniccontflag;
	}

	public void setElectroniccontflag(String electroniccontflag) {
		this.electroniccontflag = electroniccontflag;
	}

	public String getBlessingmark() {
		return blessingmark;
	}

	public void setBlessingmark(String blessingmark) {
		this.blessingmark = blessingmark;
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

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

}
