package com.example.com.masterdetaildemo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by linke_000 on 26/10/2016.
 */

public class Item implements Serializable {
    private static final long serialVerionUID = -1;
    private String title;
    private String body;

    public Item(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public static ArrayList<Item> getItems() {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("title 1", "body 1"));
        items.add(new Item("title 2", "body 2"));
        items.add(new Item("title 3", "body 3"));
        items.add(new Item("title 4", "body 4"));
        items.add(new Item("title 5", "body 5"));
        items.add(new Item("title 6", "body 6"));
        items.add(new Item("title 7", "body 7"));
        items.add(new Item("title 8", "body 8"));
        items.add(new Item("title 9", "body 9"));
        items.add(new Item("title 10", "body 10"));
        return  items;
    }

    @Override
    public String toString() {
        return title;
    }
}
