package com.greenfoxacademy.springstart.models;

public class ShopItem {
    private String name;
    private String description;
    private String price;
    private int quantity;

    public ShopItem(String name, String description, String price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return this.name + " "  + this.description + " " + this.price + " " + this.quantity;
    }
}
