package com.shengsi.design.pattern.behavioral.memento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "lcdealtypeset")
@XmlAccessorType(XmlAccessType.FIELD)
public class Lcdealtypeset {
    @XmlElement(name = "lcdealtype")
    private LcdealType lcdealtype;

    public LcdealType getLcdealtype() {
        return lcdealtype;
    }

    public void setLcdealtype(LcdealType lcdealtype) {
        this.lcdealtype = lcdealtype;
    }

}
