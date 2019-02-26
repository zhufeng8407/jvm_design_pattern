package com.shengsi.design.pattern.behavioral.memento;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "dutys")
@XmlAccessorType(XmlAccessType.FIELD)
public class Dutys {

    @XmlElement(name = "duty")
    private ArrayList<Duty> duty;

    public ArrayList<Duty> getDuty() {
        return duty;
    }

    public void setDuty(ArrayList<Duty> duty) {
        this.duty = duty;
    }

}
