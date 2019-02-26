package com.shengsi.design.pattern.behavioral.memento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "lcrisks")
@XmlAccessorType(XmlAccessType.FIELD)
public class Lcrisks {
    @XmlElement(name = "risks")
    private Risks risks;

    public Risks getRisks() {
        return risks;
    }

    public void setRisks(Risks risks) {
        this.risks = risks;
    }

}
