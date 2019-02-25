package com.shengsi.design.pattern.behavioral.mediator;

public abstract class Participant {

    private String name;

    private IChatRoom chatRoom;

    public Participant(String name) {
        this.name = name;
    }

    public IChatRoom getChatRoom() {
        return chatRoom;
    }

    public void setChatRoom(IChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public void send(String to, String message) {
        chatRoom.send(name, to, message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void receive(String from, String message) {
        System.out.println("receive from: " + from + " a message: " + message);
    }
}
