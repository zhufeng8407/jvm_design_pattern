package com.shengsi.design.pattern.behavioral.Visitor;

public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new ConcreteElementA());
        objectStructure.attach(new ConcreteElementB());

        objectStructure.accept(new ConcreteVisitorA());

        objectStructure.accept(new ConcreteVisitorB());

    }
}
