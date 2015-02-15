package com.firebase.androidchat;
/**
 * Created by io on 14/02/15.
 */
public class Item {
    private String name;
    private String owner;

    @SuppressWarnings("unused")
    private Item() {}

    Item(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }
}
