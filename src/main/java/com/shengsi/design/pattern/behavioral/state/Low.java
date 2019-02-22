package com.shengsi.design.pattern.behavioral.state;

public class Low extends State {
    @Override
    public void pull(Car car) {
        car.setCurrent(new Middle());
        System.out.println("中档");
    }
}
