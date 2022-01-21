package com.romanov.example.chat.model.payload;


import com.romanov.example.chat.model.Payload;


public class BroadcastConnectedUserPayload implements Payload {

    public static final String TYPE = "broadcastConnectedUser";

    private String username;

    public BroadcastConnectedUserPayload() {

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
