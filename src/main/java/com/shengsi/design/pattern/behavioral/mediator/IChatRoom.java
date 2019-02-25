package com.shengsi.design.pattern.behavioral.mediator;

public interface IChatRoom {

    void register(Participant participant);

    void send(String from, String to, String message);
}
