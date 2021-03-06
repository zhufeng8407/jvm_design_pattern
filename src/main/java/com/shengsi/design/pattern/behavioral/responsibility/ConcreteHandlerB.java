package com.shengsi.design.pattern.behavioral.responsibility;

public class ConcreteHandlerB extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request > 10 && request <= 20)
            System.out.println(this.getClass().getName() + " handlerRequest: request= " + request);
        else if (handler != null)
            handler.handlerRequest(request);
    }
}
