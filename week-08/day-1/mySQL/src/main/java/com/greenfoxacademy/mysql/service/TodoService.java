package com.greenfoxacademy.mysql.service;

import com.greenfoxacademy.mysql.model.Todo;
import com.greenfoxacademy.mysql.repository.TodoRepository;
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

    public List<Todo> listAll() {
        List<Todo> result = new ArrayList<>();
        todoRepository.findAll().forEach(result::add);
        return result;
    }

    public List<Todo> listActive() {
        return listAll().stream().filter(todo -> !todo.isDone()).collect(Collectors.toList());
    }

    public void addToDo(String toDo) {
        todoRepository.save(new Todo(toDo));
    }

    public void deleteToDo(long id) {
        todoRepository.deleteById(id);
    }

    public Todo getEditable(long id) {
        return todoRepository.findById(id).orElseThrow(NullPointerException::new);
    }

//    public void editTodo(long id, String name) {
//        Todo todo = new Todo(todoRepository.findById(id).toString());
//        todo.
//        todoRepository.findById(id);
//        todoRepository.save(todo);
//    }
}
