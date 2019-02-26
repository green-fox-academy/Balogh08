package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private long id;
    private String content;
    private static AtomicLong counter = new AtomicLong();
    private String greet;
    private int size;
    private int redColor;
    private int greenColor;
    private int blueColor;
    private static int randomIndex;

    private String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    public Greeting(String content) {
        id = counter.incrementAndGet();
        this.content = content;
        size = (int)(Math.random() * 20 + 6);
        redColor = (int)(Math.random() * 255);
        greenColor = (int)(Math.random() * 255);
        blueColor = (int)(Math.random() * 255);
        randomIndex= (int)(Math.random() * hellos.length);
        greet = hellos[randomIndex];
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getGreet() {
        return greet;
    }

    public int getSize() {
        return size;
    }

    public int getRedColor() {
        return redColor;
    }

    public int getGreenColor() {
        return greenColor;
    }

    public int getBlueColor() {
        return blueColor;
    }
}
