package com.greenfoxacademy.trialexam.controller;

import com.greenfoxacademy.trialexam.model.Alias;
import com.greenfoxacademy.trialexam.service.AliasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/get/{id}")
    public String mainWithAlias(@ModelAttribute Alias alias, Model model, @PathVariable(value = "id", required = false) Long id) {
        if (id !=null) {
            model.addAttribute("alias", aliasService.getById(id));
        }
        return "index";
    }

    @PostMapping("save-link")
    public String saveLink(@PathVariable("id") Long id, @ModelAttribute Alias alias) {
        aliasService.createAlias(alias);
        return "redirect:/get/" + alias.getId();
    }
}
