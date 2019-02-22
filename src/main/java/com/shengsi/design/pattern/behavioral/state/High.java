package com.shengsi.design.pattern.behavioral.state;

public class High extends State {
    @Override
    public void pull(Car car) {
        car.setCurrent(new Off());
        System.out.println("回到空档");
    }
}
