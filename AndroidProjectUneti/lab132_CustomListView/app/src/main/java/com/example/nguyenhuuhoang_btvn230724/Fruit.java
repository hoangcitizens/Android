package com.example.nguyenhuuhoang_btvn230724;

public class Fruit {
    private int fruitImage;
    private String fruitName;
    private double price;


    public Fruit() {
    }

    public Fruit(int fruitImage, String fruitName, double price) {
        this.fruitImage = fruitImage;
        this.fruitName = fruitName;
        this.price = price;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getFruitImage() {
        return fruitImage;
    }

    public void setFruitImage(int fruitImage) {
        this.fruitImage = fruitImage;
    }
}
