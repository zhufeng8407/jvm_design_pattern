package com.shengsi.design.pattern.behavioral.command;


public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setCommand(new ConcreteCommand().setReceiver(new Receiver()));
        invoker.executeCommand();
    }
}
