package com.id.demo.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StudentFile implements ability {
    Path source;

    public StudentFile () {
        this.source = Paths.get("name.txt");
    }


    @Override
    public List<String> findAll() {
        return getNames();
    }

    @Override
    public void save(String student) {
        List<String> names = getNames();
        names.add(student);
        try {
            Files.write(source, names);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public List<String> getNames() {
        List<String> names;
        try {
            names = Files.readAllLines(source);
        } catch (IOException ex) {
            names = new ArrayList<>();
        }
        return names;
    }

    @Override
    public String addStudent(String student) {
        return null;
    }

    @Override
    public int counter() {
        return getNames().size();
    }

    @Override
    public String checkStudent(String student) {
        if (getNames().contains(student)) {
            return "<span style=\"color:green\">" + student + "</span> is in the list";
        } else {
            return "<span style=\"color:red\">" + student + "</span> is NOT in the list";
        }
    }
}
