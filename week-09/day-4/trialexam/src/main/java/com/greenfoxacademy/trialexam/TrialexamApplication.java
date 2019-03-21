package com.greenfoxacademy.trialexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
@SpringBootApplication
public class TrialexamApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrialexamApplication.class, args);
    }
//
//    @GetMapping("/")
//    @ResponseBody
//    public String hello() {
//        return "hello world!";
//    }

}
