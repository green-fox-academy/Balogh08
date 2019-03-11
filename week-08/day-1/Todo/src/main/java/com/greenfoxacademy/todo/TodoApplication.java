package com.greenfoxacademy.todo;

import com.greenfoxacademy.todo.model.Todo;
import com.greenfoxacademy.todo.repository.TodoRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner{
    private TodoRepository todoRepository;

    @Autowired
    public TodoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    public void run(String...args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
    }


}
