package com.foxclub.demo.model;

import java.util.ArrayList;
import java.util.List;


public class Fox {
    private String name;
    private List<String> tricks;
    private String food;
    private String drink;

    public Fox(String name) {
        if (!name.equalsIgnoreCase("Mr. Fox")) {
            this.name = name;
        } else {
            this.name = "Mr. Fox";
        }
        this.tricks = new ArrayList<>();
        if (!name.equalsIgnoreCase("Mr. Fox")) {
            this.food = "salad";
            this.drink = "water";
        } else {
            this.food = "pizza";
            this.drink = "lemonade";
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getTricks() {
        return tricks;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setTrick(String trick) {
        tricks.add(trick);
    }
}
