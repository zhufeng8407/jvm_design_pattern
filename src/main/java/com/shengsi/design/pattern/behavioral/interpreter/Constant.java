package com.shengsi.design.pattern.behavioral.interpreter;

public class Constant extends Expression {


    private Boolean value;

    public Constant(Boolean value) {
        this.value = value;
    }

    @Override
    public boolean interpret(Context context) {
        return value;
    }

}
