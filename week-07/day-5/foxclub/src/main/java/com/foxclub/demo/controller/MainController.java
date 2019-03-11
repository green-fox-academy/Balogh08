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

    @GetMapping("/index")
    public String getIndex(String name, Model model) {
        model.addAttribute("fox", foxes.getFoxWithName(name));
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(String name) {
        if (!name.equalsIgnoreCase("")) {
            Fox fox = new Fox(name);
            foxes.addFox(fox);
        } else {
            name = "Mr. Fox";
            Fox fox = new Fox(name);
            foxes.addFox(fox);
        }
        return "redirect:/index/?name=" + name;
    }

    @GetMapping("/nutrition")
    public String getNutrition(Model model, @RequestParam(required = false) String name) {
        model.addAttribute("name", name);
        model.addAttribute("fox", foxes.getFoxWithName(name));
        return "nutrition";
    }

    @PostMapping("/nutrition")
    public String postNutrition(@RequestParam(value = "name")String name,@RequestParam(value = "food")String food, @RequestParam(value = "drink")String drink, Model model) {
        foxes.getFoxWithName(name).setFood(food);
        foxes.getFoxWithName(name).setDrink(drink);
        model.addAttribute("food", foxes.getFoxWithName(name).getFood());
        model.addAttribute("drink", foxes.getFoxWithName(name).getDrink());
        return "redirect:/?name=" + name;
    }

    @GetMapping("/trick")
    public String getTrick(Model model, @RequestParam(value = "name", required = false)String name) {
        if (name != null) {
            model.addAttribute("name", name);
        } else {
            model.addAttribute("name", foxes.getFoxWithName("Mr. Fox"));
        }
        return "trick";
    }

    @PostMapping("/trick")
    public String postTrick(String trick, String name) {
        foxes.getFoxWithName(name).setTrick(trick);
        return "redirect:/index/?name=" + name;
    }
}