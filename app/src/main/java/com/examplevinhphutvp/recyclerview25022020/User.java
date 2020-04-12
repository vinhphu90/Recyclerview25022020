package com.examplevinhphutvp.recyclerview25022020;

public class User {
    private String name;
    private String describe;
    private int image;
    private String price;


    public User(String name, String describe, int image, String price) {
        this.name = name;
        this.describe = describe;
        this.image = image;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
