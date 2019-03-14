package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private RedditService redditService;

    @Autowired
    public LoginController(RedditService redditService) {
        this.redditService = redditService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginWithUser(@RequestParam("name") String name) {

        return "redirect:/reddit";
    }
}
