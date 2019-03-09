package com.bankofsimba.simba.model;

public class BankAccount {
    private String name;
    private double balance;
    private String animalType;
    private boolean king;
    private boolean goodGuy;

    public BankAccount (String name, String animalType) {
        this.name = name;
        balance = (int) (Math.random() * 4000 + 1000);
        this.animalType = animalType;
        king = false;
        goodGuy = true;
    }

    public void addGold() {
        this.balance += this.king ? 100 :10;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean isKing() {
        return king;
    }

    public void setKing(boolean king) {
        this.king = king;
    }

    public boolean isGoodGuy() {
        return goodGuy;
    }

    public void setGoodGuy(boolean goodGuy) {
        this.goodGuy = goodGuy;
    }
}
