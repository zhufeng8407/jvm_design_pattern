package com.shengsi.design.pattern.behavioral.memento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "lcdealtype")
@XmlAccessorType(XmlAccessType.FIELD)
public class LcdealType {
    //主险序号
    @XmlElement(name = "typetorisk")
    private String typetorisk;
    //领取年龄年期标志
    @XmlElement(name = "getyearflag")
    private String getyearflag;
    //领取年龄年期
    @XmlElement(name = "getyear")
    private String getyear;
    //领取期间
    @XmlElement(name = "getyears")
    private String getyears;
    //年金类型
    @XmlElement(name = "getyearkind")
    private String getyearkind;
    //给付责任类型
    @XmlElement(name = "getdutykind")
    private String getdutykind;
    //生存金领取方式
    @XmlElement(name = "livegetmode")
    private String livegetmode;
    //红利金领取方式
    @XmlElement(name = "bonusgetmode")
    private String bonusgetmode;
    //备注1
    @XmlElement(name = "remark1")
    private String remark1;
    //备注2
    @XmlElement(name = "remark2")
    private String remark2;
    //备注3
    @XmlElement(name = "remark3")
    private String remark3;
    //备注4
    @XmlElement(name = "remark4")
    private String remark4;
    //备注5
    @XmlElement(name = "remark5")
    private String remark5;
    public String getTypetorisk() {
        return typetorisk;
    }
    public void setTypetorisk(String typetorisk) {
        this.typetorisk = typetorisk;
    }
    public String getGetyearflag() {
        return getyearflag;
    }
    public void setGetyearflag(String getyearflag) {
        this.getyearflag = getyearflag;
    }
    public String getGetyear() {
        return getyear;
    }
    public void setGetyear(String getyear) {
        this.getyear = getyear;
    }
    public String getGetyears() {
        return getyears;
    }
    public void setGetyears(String getyears) {
        this.getyears = getyears;
    }
    public String getGetyearkind() {
        return getyearkind;
    }
    public void setGetyearkind(String getyearkind) {
        this.getyearkind = getyearkind;
    }
    public String getGetdutykind() {
        return getdutykind;
    }
    public void setGetdutykind(String getdutykind) {
        this.getdutykind = getdutykind;
    }
    public String getLivegetmode() {
        return livegetmode;
    }
    public void setLivegetmode(String livegetmode) {
        this.livegetmode = livegetmode;
    }
    public String getBonusgetmode() {
        return bonusgetmode;
    }
    public void setBonusgetmode(String bonusgetmode) {
        this.bonusgetmode = bonusgetmode;
    }
    public String getRemark1() {
        return remark1;
    }
    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }
    public String getRemark2() {
        return remark2;
    }
    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }
    public String getRemark3() {
        return remark3;
    }
    public void setRemark3(String remark3) {
        this.remark3 = remark3;
    }
    public String getRemark4() {
        return remark4;
    }
    public void setRemark4(String remark4) {
        this.remark4 = remark4;
    }
    public String getRemark5() {
        return remark5;
    }
    public void setRemark5(String remark5) {
        this.remark5 = remark5;
    }

}
