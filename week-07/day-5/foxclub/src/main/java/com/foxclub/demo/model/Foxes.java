package com.foxclub.demo.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Foxes {
    private List<Fox> foxes;

    public Foxes() {
        foxes = new ArrayList<>();
        Fox fox = new Fox("Mr. Fox");
        foxes.add(fox);
    }

    public void addFox(Fox fox) {
        foxes.add(fox);
    }

    public List<Fox> getFoxes() {
        return foxes;
    }

    public Fox getFoxWithName(String name) {
        return foxes.stream()
                .filter(fox -> fox.getName().equalsIgnoreCase(name)).findFirst().get();
    }
}
