package com.shengsi.design.pattern.behavioral.mediator;

public class Client {

    public static void main(String[] args) {
        IChatRoom iChatRoom = new ChatRoom();

        Participant participantA = new ConcreteParticipantA("a");
        Participant participantB = new ConcreteParticipantB("b");
        iChatRoom.register(participantA);
        iChatRoom.register(participantB);
        participantA.setChatRoom(iChatRoom);
        participantB.setChatRoom(iChatRoom);

        participantA.send(participantB.getName(), "give you a message");

    }
}
