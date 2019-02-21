package com.shengsi.design.pattern.behavioral.interpreter;

public class And extends Expression {

    private Expression expressionA;

    private Expression expressionB;

    public And(Expression expressionA, Expression expressionB) {
        this.expressionA = expressionA;
        this.expressionB = expressionB;
    }

    @Override
    public boolean interpret(Context context) {
        return (expressionA.interpret(context) && expressionB.interpret(context));
    }
}
