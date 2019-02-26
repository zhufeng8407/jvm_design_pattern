package com.shengsi.design.pattern.behavioral.memento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "baseinfo")
@XmlAccessorType(XmlAccessType.FIELD)//解决Class has two properties of the same name问题
public class BaseInfo {
    @XmlElement(name = "servicecode")
    private String servicecode;

    @XmlElement(name = "version")
    private String version;

    @XmlElement(name = "xmlsource")
    private String xmlsource;

    @XmlElement(name = "modelcode")
    private String modelcode;

    @XmlElement(name = "servicesource")
    private String servicesource;

    public String getServicecode() {
        return servicecode;
    }

    public void setServicecode(String servicecode) {
        this.servicecode = servicecode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getXmlsource() {
        return xmlsource;
    }

    public void setXmlsource(String xmlsource) {
        this.xmlsource = xmlsource;
    }

    public String getModelcode() {
        return modelcode;
    }

    public void setModelcode(String modelcode) {
        this.modelcode = modelcode;
    }

    public String getServicesource() {
        return servicesource;
    }

    public void setServicesource(String servicesource) {
        this.servicesource = servicesource;
    }


}
