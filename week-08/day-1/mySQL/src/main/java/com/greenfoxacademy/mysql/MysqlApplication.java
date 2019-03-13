package com.greenfoxacademy.mysql;

import com.greenfoxacademy.mysql.model.Todo;
import com.greenfoxacademy.mysql.repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlApplication implements CommandLineRunner {

    private TodoRepository todoRepository;

    public MysqlApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(MysqlApplication.class, args);
    }

    public void run(String...args) throws Exception {
//        todoRepository.deleteAll();
        todoRepository.save(new Todo("daily task"));
        todoRepository.save(new Todo("make the beds", true, false));
        todoRepository.save(new Todo("do the washing up"));
        todoRepository.save(new Todo("clean the bathroom and the kitchen", false, true));
        todoRepository.save(new Todo("wipe all the surface with a cloth"));
    }
}
