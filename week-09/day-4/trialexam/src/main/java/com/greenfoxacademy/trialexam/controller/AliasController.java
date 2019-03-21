package com.greenfoxacademy.trialexam.controller;

import com.greenfoxacademy.trialexam.model.Alias;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class AliasController {

    private Alias alias;

    @GetMapping("/get")
    public String main(@ModelAttribute Alias alias) {
        return "index";
    }
}
