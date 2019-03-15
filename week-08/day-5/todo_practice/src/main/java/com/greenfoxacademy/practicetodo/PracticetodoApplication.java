package com.greenfoxacademy.practicetodo;

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
public class PracticetodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticetodoApplication.class, args);
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

}
