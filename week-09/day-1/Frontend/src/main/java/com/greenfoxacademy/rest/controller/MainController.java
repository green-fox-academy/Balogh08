package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.Doubling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
            return new Doubling(input);

    }
}
