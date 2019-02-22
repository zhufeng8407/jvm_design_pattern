package com.shengsi.design.pattern.behavioral.state;

public class Middle extends State {


    @Override
    public void pull(Car car) {
        car.setCurrent(new High());
        System.out.println("高档");
    }
}
