package com.greenfoxacademy.practicetodo.service;

import com.greenfoxacademy.practicetodo.model.Assignee;
import com.greenfoxacademy.practicetodo.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeService {
    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeService(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    public List<Assignee> listAll() {
        return new ArrayList<>(assigneeRepository.findAll());
    }

    public void add(String name, String email) {
        Assignee assignee = new Assignee(name, email);
        assigneeRepository.save(assignee);
    }
}
