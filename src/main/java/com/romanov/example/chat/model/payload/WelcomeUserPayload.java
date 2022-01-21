package com.romanov.example.chat.model.payload;


import com.romanov.example.chat.model.Payload;


public class WelcomeUserPayload implements Payload {

    public static final String TYPE = "welcomeUser";

    private String username;

    public WelcomeUserPayload() {

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
