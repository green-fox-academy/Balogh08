package com.greenfoxacademy.practicetodo;

import com.greenfoxacademy.practicetodo.service.TodoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class PracticetodoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PracticetodoApplication.class, args);
    }

    private TodoService todoService;

    public PracticetodoApplication(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseBody
    public List<String> hello() {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Boti");
        words.add("Let's");
        words.add("Practice");
        return words;
    }

    @Override
    public void run(String... args) throws Exception {
//        todoService.save("Finish todo project");
//        todoService.save("Workout");
//        todoService.save("Clean up your room");
//        todoService.save("Walk in the city");
    }
}
