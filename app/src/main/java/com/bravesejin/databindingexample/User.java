package com.bravesejin.databindingexample;

public class User {
    private String name, imageUrl;
    private int age;

    public User(String name, String imageUrl, int age) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getAge() {
        return age;
    }
}
