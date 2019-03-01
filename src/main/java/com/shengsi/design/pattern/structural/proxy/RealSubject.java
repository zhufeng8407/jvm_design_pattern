package com.shengsi.design.pattern.structural.proxy;

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("do real subject");
    }
}
