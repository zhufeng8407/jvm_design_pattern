package com.shengsi.design.pattern.structural.proxy;

public class Client {

    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.request();
    }
}
