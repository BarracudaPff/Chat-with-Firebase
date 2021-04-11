package com.samsung.firebasetest.models;

import android.graphics.Color;

import java.util.Random;

public class Message {
    public String from;
    public String text;

    public Message() {
        // Firebase
    }

    public Message(String from, String text) {
        this.from = from;
        this.text = text;
    }

    public int generateColor() {
        Random random = new Random(from.length() * text.length());

        return Color.argb(
                random.nextInt(255),
                random.nextInt(255),
                random.nextInt(255),
                random.nextInt(255)
        );
    }
}
