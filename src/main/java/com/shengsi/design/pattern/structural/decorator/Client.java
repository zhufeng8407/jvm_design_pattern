package com.shengsi.design.pattern.structural.decorator;

public class Client {

    public static void main(String[] args) {
        Coffee coffee = new BlackCoffee();

        Coffee macchiato = new MacchiatoDecorator(coffee);

        Coffee doubleMacchiato = new MacchiatoDecorator(macchiato);

        System.out.println(macchiato.price());

        System.out.println(doubleMacchiato.price());

    }
}
