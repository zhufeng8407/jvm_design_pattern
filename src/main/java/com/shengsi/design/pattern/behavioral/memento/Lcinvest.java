package com.shengsi.design.pattern.behavioral.memento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "lcinvest")
@XmlAccessorType(XmlAccessType.FIELD)
public class Lcinvest {
    //未使用
    @XmlElement(name = "investflag")
    private String investflag;

    @XmlElement(name = "investset")
    private Investset investset;

    public String getInvestflag() {
        return investflag;
    }

    public void setInvestflag(String investflag) {
        this.investflag = investflag;
    }

    public Investset getInvestset() {
        return investset;
    }

    public void setInvestset(Investset investset) {
        this.investset = investset;
    }

}
