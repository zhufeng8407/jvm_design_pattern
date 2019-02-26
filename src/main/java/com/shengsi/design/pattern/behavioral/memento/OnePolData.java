package com.shengsi.design.pattern.behavioral.memento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "onepoldata")
@XmlAccessorType(XmlAccessType.FIELD)//解决Class has two properties of the same name问题
public class OnePolData {
    @XmlElement(name = "lccont")
    private Lccont lccont;

    @XmlElement(name = "lcappnt")
    private Lcappnt lcappnt;

    @XmlElement(name = "lcinsureds")
    private Lcinsureds lcinsureds;

    public Lccont getLccont() {
        return lccont;
    }

    public void setLccont(Lccont lccont) {
        this.lccont = lccont;
    }

    public Lcappnt getLcappnt() {
        return lcappnt;
    }

    public void setLcappnt(Lcappnt lcappnt) {
        this.lcappnt = lcappnt;
    }

    public Lcinsureds getLcinsureds() {
        return lcinsureds;
    }

    public void setLcinsureds(Lcinsureds lcinsureds) {
        this.lcinsureds = lcinsureds;
    }


}
