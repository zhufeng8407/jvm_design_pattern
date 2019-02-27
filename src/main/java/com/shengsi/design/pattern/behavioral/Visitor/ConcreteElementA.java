package com.shengsi.design.pattern.behavioral.Visitor;

public class ConcreteElementA extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }
}
