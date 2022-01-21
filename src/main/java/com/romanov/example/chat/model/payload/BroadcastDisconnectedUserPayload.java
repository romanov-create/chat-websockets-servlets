package com.romanov.example.chat.model.payload;


import com.romanov.example.chat.model.Payload;


public class BroadcastDisconnectedUserPayload implements Payload {

    public static final String TYPE = "broadcastDisconnectedUser";

    private String username;

    public BroadcastDisconnectedUserPayload() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getType() {
        return TYPE;
    }
}
