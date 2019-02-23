package com.shengsi.design.pattern.behavioral.responsibility;

public class Client {

    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        handlerA.setHandler(handlerB);
        handlerB.setHandler(handlerC);

        int[] requests = new int[]{3,5,7,9,16,19,22,24};

        for(int i : requests) {
            handlerA.handlerRequest(i);
        }

    }
}
