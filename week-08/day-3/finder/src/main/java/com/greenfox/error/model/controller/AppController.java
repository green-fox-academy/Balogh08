package com.greenfox.error.model.controller;

import com.greenfox.error.model.service.UserService;
import com.greenfox.error.model.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
@RequestMapping("/user")
public class AppController {


    private UserService userService;

    @Autowired
    public AppController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("users", userService.getAll());
        return "main";
    }

    @PostMapping("/app")
    public String create(String first, String last) {
        userService.save(new User(first, last));
        return "redirect:/user";
    }
}