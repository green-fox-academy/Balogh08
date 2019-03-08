package com.foxclub.demo.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Foxes {
    private List<Fox> foxes;

    public Foxes() {
        foxes = new ArrayList<>();
    }

    public void addFox(Fox fox) {
        foxes.add(fox);
    }

    public List<Fox> getFoxes() {
        return foxes;
    }

    public boolean containsName(String name) {
        return foxes.stream()
                .map(fox -> fox.getName()).anyMatch(fox -> fox.equalsIgnoreCase(name));
    }

    public Fox getFoxWithName(String name) {
        return foxes.stream()
                .filter(fox -> fox.getName().equalsIgnoreCase(name)).findFirst().get();
    }
}
