package com.shengsi.design.pattern.structural.decorator;

public abstract class Decorator implements Coffee {
    private Coffee coffee;


    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double price() {
        return this.decoratorPrice() + coffee.price();
    }

    public abstract double decoratorPrice();
}
