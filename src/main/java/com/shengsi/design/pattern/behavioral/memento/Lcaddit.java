package com.shengsi.design.pattern.behavioral.memento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "lcaddit")
@XmlAccessorType(XmlAccessType.FIELD)
public class Lcaddit {
    // 未使用
    @XmlElement(name = "additflag")
    private String additflag;

    @XmlElement(name = "additset")
    private Additset additset;

    public String getAdditflag() {
        return additflag;
    }

    public void setAdditflag(String additflag) {
        this.additflag = additflag;
    }

    public Additset getAdditset() {
        return additset;
    }

    public void setAdditset(Additset additset) {
        this.additset = additset;
    }
}
