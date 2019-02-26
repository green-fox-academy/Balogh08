package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {


    @RequestMapping("/web/greeting")
    public String greeting(Model model,@RequestParam String name) {
        Greeting greeting = new Greeting(name);
        model.addAttribute("name", greeting.getContent());
        model.addAttribute("id", greeting.getId());
        return "greeting";
    }
}
