package com.shengsi.design.pattern.behavioral.command;

public class ConcreteCommand extends Command {

    @Override
    public void execute() {
        receiver.action();
    }
}
