package com.shengsi.design.pattern.behavioral.state;

/**
 * Context角色
 */
public class Car {

    private State current;

    public Car() {
        this.current = new Off();
        System.out.println("生产出来，空档");
    }

    public void pull() {
        current.pull(this);
    }

    public void setCurrent(State current) {
        this.current = current;
    }
}
