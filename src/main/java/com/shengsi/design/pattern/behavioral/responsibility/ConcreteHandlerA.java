package com.shengsi.design.pattern.behavioral.responsibility;

public class ConcreteHandlerA extends Handler {

    @Override
    public void handlerRequest(int request) {
        if (request >= 0 && request <= 10)
            System.out.println(this.getClass().getName() + " handlerRequest: request= " + request);
        else if (handler != null)
            handler.handlerRequest(request);

    }
}
