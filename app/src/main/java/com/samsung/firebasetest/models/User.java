package com.samsung.firebasetest.models;

import android.graphics.Color;

import java.util.Random;

public class User {
    public String name;
    public int age;

    public User() {
        // Firebase
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int generateColor() {
        Random random = new Random(name.length() * age);

        return Color.argb(
                random.nextInt(255),
                random.nextInt(255),
                random.nextInt(255),
                random.nextInt(255)
        );
    }
}
