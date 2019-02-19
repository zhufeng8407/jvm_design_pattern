package com.shengsi.design.pattern.behavioral.command;

public abstract class Command {

    protected Receiver receiver;

    public Command setReceiver(Receiver receiver) {
        this.receiver = receiver;
        return this;
    }

    abstract void execute();
}
