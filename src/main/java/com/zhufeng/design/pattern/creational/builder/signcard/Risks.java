package com.zhufeng.design.pattern.creational.builder.signcard;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "investset")
@XmlAccessorType(XmlAccessType.FIELD)
public class Risks {
	//主险顺序
	@XmlElement(name = "riskno")
	private String riskno;
	
	@XmlElement(name = "risk")
	private ArrayList<Risk> risk;

	public String getRiskno() {
		return riskno;
	}

	public void setRiskno(String riskno) {
		this.riskno = riskno;
	}

    public ArrayList<Risk> getRisk() {
        return risk;
    }

    public void setRisk(ArrayList<Risk> risk) {
        this.risk = risk;
    }


	
}
