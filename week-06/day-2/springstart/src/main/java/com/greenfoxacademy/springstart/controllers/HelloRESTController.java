package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong initial = new AtomicLong(0);

    @RequestMapping("/greeting")
    public Greeting Greeting(@RequestParam String name) {
        Greeting greeting = new Greeting(initial.incrementAndGet(),"Hello " + name + "!");
        return greeting;
    }
}
