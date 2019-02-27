package com.shengsi.design.pattern.behavioral.Visitor;

public abstract class Visitor {

    public abstract void visitElementA(ConcreteElementA elementA);

    public abstract void visitElementB(ConcreteElementB elementB);
}
