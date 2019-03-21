package com.greenfoxacademy.trialexam.controller;

import com.greenfoxacademy.trialexam.model.Alias;
import com.greenfoxacademy.trialexam.service.AliasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class AliasController {

    private AliasService aliasService;

    @Autowired
    public AliasController(AliasService aliasService) {
        this.aliasService = aliasService;
    }

    @GetMapping("/get")
    public String main(@ModelAttribute Alias alias) {
        return "index";
    }
}
