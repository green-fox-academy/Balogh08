package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping("/greeting")
    public static Greeting Greeting() {
        Greeting greeting = new Greeting(101, "Hello Boti!");
        return greeting;
    }
}
