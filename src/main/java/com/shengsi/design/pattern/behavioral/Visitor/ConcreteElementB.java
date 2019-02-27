package com.shengsi.design.pattern.behavioral.Visitor;

public class ConcreteElementB extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementB(this);
    }
}
