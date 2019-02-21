package com.shengsi.design.pattern.behavioral.interpreter;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        Varriable a = new Varriable("a");
        Varriable b = new Varriable("b");
        Constant c = new Constant(true);

        context.assign(a, false);;
        context.assign(b, true);;

        Expression expression = new Or(new And(a, b), new Not(c));

        System.out.println(expression.interpret(context));

    }
}
