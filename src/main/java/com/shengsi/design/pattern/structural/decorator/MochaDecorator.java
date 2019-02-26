package com.shengsi.design.pattern.structural.decorator;

public class MochaDecorator extends Decorator {

    private Coffee coffee;

    public MochaDecorator(Coffee coffee) {
        super(coffee);
        this.coffee = coffee;
    }

    @Override
    public double decoratorPrice() {
        return 5;
    }

    @Override
    public double price() {
        return this.decoratorPrice() + coffee.price();
    }
}
