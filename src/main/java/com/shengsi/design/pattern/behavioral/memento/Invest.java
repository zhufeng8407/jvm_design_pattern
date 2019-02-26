package com.shengsi.design.pattern.behavioral.memento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "investset")
@XmlAccessorType(XmlAccessType.FIELD)
public class Invest {
    // 未使用
    @XmlElement(name = "acctorisk")
    private String acctorisk;
    // 未使用
    @XmlElement(name = "accno")
    private String accno;
    // 未使用
    @XmlElement(name = "acclot")
    private String acclot;
    // 未使用
    @XmlElement(name = "accmoney")
    private String accmoney;
    public String getAcctorisk() {
        return acctorisk;
    }
    public void setAcctorisk(String acctorisk) {
        this.acctorisk = acctorisk;
    }
    public String getAccno() {
        return accno;
    }
    public void setAccno(String accno) {
        this.accno = accno;
    }
    public String getAcclot() {
        return acclot;
    }
    public void setAcclot(String acclot) {
        this.acclot = acclot;
    }
    public String getAccmoney() {
        return accmoney;
    }
    public void setAccmoney(String accmoney) {
        this.accmoney = accmoney;
    }

}
