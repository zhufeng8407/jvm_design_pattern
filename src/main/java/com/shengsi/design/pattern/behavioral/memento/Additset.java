package com.shengsi.design.pattern.behavioral.memento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "additest")
@XmlAccessorType(XmlAccessType.FIELD)
public class Additset {

    @XmlElement(name = "addit")
    private Addit addit;

    public Addit getAddit() {
        return addit;
    }

    public void setAddit(Addit addit) {
        this.addit = addit;
    }

}
