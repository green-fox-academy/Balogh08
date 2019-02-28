package com.greenfoxacademy.springstart.models;

public class ShopItem {
    private String name;
    private String description;
    private long price;
    private int quantity;

    public ShopItem(String name, String description, long price, int quantity) {
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

    public long getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return this.name + " "  + this.description + " " + this.price + " " + this.quantity;
    }
}
