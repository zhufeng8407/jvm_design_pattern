package com.shengsi.design.pattern.behavioral.memento;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Lcinsureds")
@XmlAccessorType(XmlAccessType.FIELD)
public class Lcinsureds {

    @XmlElement(name = "lcinsured")
    private Lcinsured lcinsured;

    public Lcinsured getLcinsured() {
        return lcinsured;
    }

    public void setLcinsured(Lcinsured lcinsured) {
        this.lcinsured = lcinsured;
    }

}
