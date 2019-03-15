package com.greenfoxacademy.practicetodo.service;

import com.greenfoxacademy.practicetodo.model.Todo;
import com.greenfoxacademy.practicetodo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    @Autowired

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> listAll(Boolean done) {
        if (done == null) {
            done = false;
        }

        List<Todo> result = new ArrayList<>(todoRepository.findAll());

        if (done) {
            return result.stream()
                    .filter(todo -> !todo.isDone())
                    .collect(Collectors.toList());
        }

        return result;
    }

    public void save(String title) {
        Todo todo = new Todo(title);
        todoRepository.save(todo);
    }

    public void delete(Long id) {
        todoRepository.deleteById(id);
    }

    public Todo editable(Long id) {
        return todoRepository.findById(id).get();
    }

    public void edit(Long id, String title) {
        Todo result;
        result = todoRepository.findById(id).get();
        result.setTitle(title);
    }
}
