package com.shengsi.design.pattern.structural.decorator;

public class MacchiatoDecorator extends Decorator {

    private Coffee coffee;

    public MacchiatoDecorator(Coffee coffee) {
        super(coffee);
        this.coffee = coffee;
    }

    @Override
    public double decoratorPrice() {
        return 10;
    }

    @Override
    public double price() {
        return this.decoratorPrice() + coffee.price();
    }
}
