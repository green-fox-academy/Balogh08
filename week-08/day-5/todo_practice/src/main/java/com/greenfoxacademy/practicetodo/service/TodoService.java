package com.greenfoxacademy.practicetodo.service;

import com.greenfoxacademy.practicetodo.model.Todo;
import com.greenfoxacademy.practicetodo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    @Autowired

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> listAll() {
        return (List) new ArrayList(todoRepository.findAll());
    }

    public void save(String title) {
        Todo todo = new Todo(title);
        todoRepository.save(todo);
    }
}
