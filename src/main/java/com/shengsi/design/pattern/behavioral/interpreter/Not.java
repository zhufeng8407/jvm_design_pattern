package com.shengsi.design.pattern.behavioral.interpreter;

public class Not extends Expression {

    private Expression expression;


    public Not(Expression expression) {
        this.expression = expression;
    }

    @Override
    public boolean interpret(Context context) {
        return !expression.interpret(context);
    }
}
