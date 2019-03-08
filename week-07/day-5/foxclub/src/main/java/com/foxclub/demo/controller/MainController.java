package com.foxclub.demo.controller;

import com.foxclub.demo.model.Fox;
import com.foxclub.demo.model.Foxes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private Foxes foxes;

    @Autowired
    public MainController(Foxes foxes) {
        this.foxes = foxes;
    }

    @GetMapping("/")
    public String getIndex(@RequestParam(value = "name", required = false)String name, Model model) {
//        model.addAttribute("name", name);
        if (name != null) {
            model.addAttribute("fox", foxes.getFoxWithName(name));
        } else {
            model.addAttribute("fox", new Fox(name));
        }
        return "index";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(String name) {
        Fox fox = new Fox(name);
        foxes.addFox(fox);
        return "redirect:/?name=" + name;
    }

    @GetMapping("/nutrition")
    public String getNutrition() {
        return "nutrition";
    }
}
















/*
redirect:/?name=" + name*/
//        if (name != null && foxes.containsName(name))
//                foxes.addFox(model, foxes.getFoxWithName(name));