package com.romanov.example.chat.model.payload;


import com.romanov.example.chat.model.Payload;

import java.util.Set;


public class BroadcastAvailableUsersPayload implements Payload {

    public static final String TYPE = "broadcastAvailableUsers";

    private Set<String> usernames;

    public BroadcastAvailableUsersPayload() {

    }

    public Set<String> getUsernames() {
        return usernames;
    }

    public void setUsernames(Set<String> usernames) {
        this.usernames = usernames;
    }

    @Override
    public String getType() {
        return TYPE;
    }
}
