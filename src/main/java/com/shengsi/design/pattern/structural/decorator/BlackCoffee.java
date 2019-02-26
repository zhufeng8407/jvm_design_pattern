package com.shengsi.design.pattern.structural.decorator;

public class BlackCoffee implements Coffee {

    private double price = 30;

    @Override
    public double price() {
        return price;
    }
}
