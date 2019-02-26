package com.shengsi.design.pattern.behavioral.memento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "investset")
@XmlAccessorType(XmlAccessType.FIELD)
public class Investset {
    // 未使用
    @XmlElement(name = "efftime")
    private String efftime;

    @XmlElement(name = "invest")
    private Invest invest;

    public String getEfftime() {
        return efftime;
    }

    public void setEfftime(String efftime) {
        this.efftime = efftime;
    }

    public Invest getInvest() {
        return invest;
    }

    public void setInvest(Invest invest) {
        this.invest = invest;
    }

}
