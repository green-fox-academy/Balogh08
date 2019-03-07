package com.id.demo.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private ArrayList<String> names;

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public String addStudent(String student) {
        names.add(student);
        return "<b>" + student + "</b>  has been added to student list!";
    }

    public String counter() {
        return "Number of Students: " + names.size();
    }

    public String checkStudent(String student) {
        if (names.contains(student)) {
            return "<span style=\"color:green\">" + student + "</span> is in the list";
        } else {
            return "<span style=\"color:red\">" + student + "</span> is NOT in the list";
        }
    }
}
