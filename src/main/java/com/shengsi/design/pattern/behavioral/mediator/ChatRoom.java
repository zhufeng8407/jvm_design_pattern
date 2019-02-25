package com.shengsi.design.pattern.behavioral.mediator;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ChatRoom implements IChatRoom {

    private Map<String, Participant> participants = new ConcurrentHashMap<>();

    @Override
    public void register(Participant participant) {
        if (!participants.containsKey(participant.getName()))
            participants.put(participant.getName(), participant);
    }

    @Override
    public void send(String from, String to, String message) {
        Participant participant = participants.get(to);
        if (null != participant) {
            participant.receive(from, message);
        }
    }
}
