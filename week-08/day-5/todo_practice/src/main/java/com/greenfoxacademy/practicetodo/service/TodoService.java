package com.greenfoxacademy.practicetodo.service;

import com.greenfoxacademy.practicetodo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    @Autowired

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
}
