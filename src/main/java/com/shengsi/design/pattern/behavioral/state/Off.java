package com.shengsi.design.pattern.behavioral.state;

public class Off extends State {

    @Override
    public void pull(Car car) {
        car.setCurrent(new Low());
        System.out.println("低挡");
    }
}
