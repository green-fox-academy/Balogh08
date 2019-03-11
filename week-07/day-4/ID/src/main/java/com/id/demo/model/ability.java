package com.id.demo.model;

import java.util.ArrayList;
import java.util.List;

public interface ability {
    public List<String> findAll();

    public void save(String student);

    public List<String> getNames();

    public String addStudent(String student);

    public String counter();

    public String checkStudent(String student);
}
