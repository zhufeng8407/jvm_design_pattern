package com.shengsi.design.pattern.behavioral.interpreter;

public class Varriable extends Expression {

    private String name;

    public Varriable(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(Context context) {
        return context.lookup(this);
    }
}
