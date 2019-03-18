package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.Doubling;
import com.greenfoxacademy.rest.model.ErrorMessage;
import com.greenfoxacademy.rest.model.Greeter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
