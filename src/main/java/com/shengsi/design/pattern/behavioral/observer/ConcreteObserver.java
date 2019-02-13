package com.shengsi.design.pattern.behavioral.observer;

public class ConcreteObserver implements Observer{

    @Override
    public void update(Subject subject) {
        System.out.println("ConcreteObserver updated...  " + subject);
    }
}
