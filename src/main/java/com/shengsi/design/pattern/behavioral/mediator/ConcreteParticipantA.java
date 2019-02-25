package com.shengsi.design.pattern.behavioral.mediator;

public class ConcreteParticipantA extends Participant {

    public ConcreteParticipantA(String name) {
        super(name);
    }

    @Override
    public void receive(String from, String message) {
        System.out.println("to ConcreteParticipantA");
        super.receive(from, message);
    }
}
