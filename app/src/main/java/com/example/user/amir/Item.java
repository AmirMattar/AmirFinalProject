package com.example.user.amir;

public class Item {
    private int image;

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {

        return image;
    }

    public String getName() {
        return name;
    }

    public Item(int image, String name) {

        this.image = image;
        this.name = name;
    }

    private String name;
}
