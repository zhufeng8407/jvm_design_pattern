package com.shengsi.design.pattern.structural.proxy;

public class ProxySubject implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null)
            realSubject = new RealSubject();
        realSubject.request();;

        this.afterRequest();
    }

    private void afterRequest() {
        System.out.println("do after request");
    }
}
