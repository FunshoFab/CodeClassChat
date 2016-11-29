package com.funsooyenuga.codeclasschat;

public class Message {
    private String messageBody;
    private String username;

    public Message(String messageBody, String username) {
        this.messageBody = messageBody;
        this.username = username;
    }

    public Message() {}

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
