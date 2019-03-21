package com.greenfoxacademy.trialexam.controller;

import com.greenfoxacademy.trialexam.service.LinkService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private LinkService linkService;

    public MainController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping("/")
    public String get(@RequestParam(name = "urlName", required = false) String urlName, @RequestParam(name = "alias", required = false) String alias, Model model) {
        if (alias != null && urlName != null)
        model.addAttribute("url",linkService.);
        model.addAttribute("alias", alias);
        return "index";
    }

    @PostMapping("/save-link")
    public String saveLink(@RequestParam("urlName") String urlName, @RequestParam("alias") String alias) {
        linkService.add(urlName, alias);
        return "redirect:/?urlName=" + urlName + "&alias=" + alias;
    }
}
