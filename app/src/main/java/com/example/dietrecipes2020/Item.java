package com.example.dietrecipes2020;

public class Item {
    private String text;

    public Item(String text) {
        this.text = text;
    }

    public Item() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
