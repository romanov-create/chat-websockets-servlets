package com.romanov.example.chat.model.payload;


import com.romanov.example.chat.model.Payload;


public class SendTextMessagePayload implements Payload {

    public static final String TYPE = "sendTextMessage";

    private String content;

    public SendTextMessagePayload() {

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getType() {
        return TYPE;
    }
}
