package com.shengsi.design.pattern.behavioral.observer;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();
}
