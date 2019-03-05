package com.bankofsimba.simba.model;

public class BankAccount {
    private String name;
    private double balance;
    private String animalType;
    private static int index = 0;
    private int id;
    private boolean isKing;

    public BankAccount(String name, double balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.id = index++;
        isKing = false;
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

    public int getId() {
        return id;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing() {
        isKing = true;
    }
}
