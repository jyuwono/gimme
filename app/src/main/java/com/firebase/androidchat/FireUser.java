package com.firebase.androidchat;


/**
 * Created by io on 14/02/15.
 */
public class FireUser {
    private String chatSessions;
    private String belongings;

    public FireUser() {}

    public FireUser(String belongings, String chatSessions) {
        this.belongings = belongings;
        this.chatSessions = chatSessions;
    }

    public String getChatSessions() {
        return chatSessions;
    }

    public String getBelongings() {
        return belongings;
    }
}
