package com.shengsi.design.pattern.behavioral.memento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "lcinsureddes")
@XmlAccessorType(XmlAccessType.FIELD)
public class Lcinsureddes {
    // 被保人姓名
    @XmlElement(name = "name")
    private String name;
    // 性别
    @XmlElement(name = "sex")
    private String sex;
    // 出生日期
    @XmlElement(name = "birthday")
    private String birthday;
    // 年龄
    @XmlElement(name = "age")
    private String age;
    // 户口所在地
    @XmlElement(name = "rgtaddress")
    private String rgtaddress;
    // 证件类型
    @XmlElement(name = "idtype")
    private String idtype;
    // 证件号
    @XmlElement(name = "idno")
    private String idno;
    // 与投保人关系
    @XmlElement(name = "relationtoappnt")
    private String relationtoappnt;
    // 证件有效期
    @XmlElement(name = "idenddate")
    private String idenddate;
    // 婚姻状况
    @XmlElement(name = "marriage")
    private String marriage;
    // 国籍
    @XmlElement(name = "nativeplace")
    private String nativeplace;
    // 职业
    @XmlElement(name = "worktype")
    private String worktype;
    // 职业编码
    @XmlElement(name = "occupationcode")
    private String occupationcode;
    // 与第一保险人关系
    @XmlElement(name = "relationtomaininsured")
    private String relationtomaininsured;
    // 住址
    @XmlElement(name = "homeaddress")
    private String homeaddress;
    // 首选回访电话
    @XmlElement(name = "phone")
    private String phone;
    // 其他联系电话
    @XmlElement(name = "phone2")
    private String phone2;
    // 工作单位
    @XmlElement(name = "grpname")
    private String grpname;
    // 是否拥有工费医疗、社会医疗保险
    @XmlElement(name = "socialinsuflag")
    private String socialinsuflag;
    // 兼职
    @XmlElement(name = "pluralitytype")
    private String pluralitytype;
    // 备注1
    @XmlElement(name = "remark1")
    private String remark1;
    // 备注2
    @XmlElement(name = "remark2")
    private String remark2;
    // 备注3
    @XmlElement(name = "remark3")
    private String remark3;
    // 备注4
    @XmlElement(name = "remark4")
    private String remark4;
    // 备注5
    @XmlElement(name = "remark5")
    private String remark5;

    // 省（投保人）
    @XmlElement(name = "homeprovince")
    private String homeprovince;
    // 市（投保人）
    @XmlElement(name = "homecity")
    private String homecity;
    // 区（投保人
    @XmlElement(name = "homecounty")
    private String homecounty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRgtaddress() {
        return rgtaddress;
    }

    public void setRgtaddress(String rgtaddress) {
        this.rgtaddress = rgtaddress;
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getRelationtoappnt() {
        return relationtoappnt;
    }

    public void setRelationtoappnt(String relationtoappnt) {
        this.relationtoappnt = relationtoappnt;
    }

    public String getIdenddate() {
        return idenddate;
    }

    public void setIdenddate(String idenddate) {
        this.idenddate = idenddate;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public String getWorktype() {
        return worktype;
    }

    public void setWorktype(String worktype) {
        this.worktype = worktype;
    }

    public String getOccupationcode() {
        return occupationcode;
    }

    public void setOccupationcode(String occupationcode) {
        this.occupationcode = occupationcode;
    }

    public String getRelationtomaininsured() {
        return relationtomaininsured;
    }

    public void setRelationtomaininsured(String relationtomaininsured) {
        this.relationtomaininsured = relationtomaininsured;
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getGrpname() {
        return grpname;
    }

    public void setGrpname(String grpname) {
        this.grpname = grpname;
    }

    public String getSocialinsuflag() {
        return socialinsuflag;
    }

    public void setSocialinsuflag(String socialinsuflag) {
        this.socialinsuflag = socialinsuflag;
    }

    public String getPluralitytype() {
        return pluralitytype;
    }

    public void setPluralitytype(String pluralitytype) {
        this.pluralitytype = pluralitytype;
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

    public String getHomeprovince() {
        return homeprovince;
    }

    public void setHomeprovince(String homeprovince) {
        this.homeprovince = homeprovince;
    }

    public String getHomecity() {
        return homecity;
    }

    public void setHomecity(String homecity) {
        this.homecity = homecity;
    }

    public String getHomecounty() {
        return homecounty;
    }

    public void setHomecounty(String homecounty) {
        this.homecounty = homecounty;
    }

}
