package com.zhufeng.design.pattern.creational.builder.signcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "addit")
@XmlAccessorType(XmlAccessType.FIELD)
public class Addit {
	// 未使用
	@XmlElement(name = "addittorisk")
	private String addittorisk;
	// 未使用
	@XmlElement(name = "additprem")
	private String additprem;
	// 未使用
	@XmlElement(name = "additamnt")
	private String additamnt;
	// 未使用
	@XmlElement(name = "addamnt")
	private String addamnt;
	// 未使用
	@XmlElement(name = "addtoprem")
	private String addtoprem;
	public String getAddittorisk() {
		return addittorisk;
	}
	public void setAddittorisk(String addittorisk) {
		this.addittorisk = addittorisk;
	}
	public String getAdditprem() {
		return additprem;
	}
	public void setAdditprem(String additprem) {
		this.additprem = additprem;
	}
	public String getAdditamnt() {
		return additamnt;
	}
	public void setAdditamnt(String additamnt) {
		this.additamnt = additamnt;
	}
	public String getAddamnt() {
		return addamnt;
	}
	public void setAddamnt(String addamnt) {
		this.addamnt = addamnt;
	}
	public String getAddtoprem() {
		return addtoprem;
	}
	public void setAddtoprem(String addtoprem) {
		this.addtoprem = addtoprem;
	}
	
}
