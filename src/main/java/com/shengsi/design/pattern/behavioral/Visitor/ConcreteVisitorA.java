package com.shengsi.design.pattern.behavioral.Visitor;

public class ConcreteVisitorA extends Visitor {

    @Override
    public void visitElementA(ConcreteElementA elementA) {
        System.out.println(this.getClass().getName() + " is visiting "
                + elementA.getClass().getName());
    }

    @Override
    public void visitElementB(ConcreteElementB elementB) {
        System.out.println(this.getClass().getName() + " is visiting "
                + elementB.getClass().getName());
    }
}
