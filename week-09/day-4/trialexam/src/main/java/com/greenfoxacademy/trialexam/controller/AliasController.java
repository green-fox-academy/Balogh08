package com.greenfoxacademy.trialexam.controller;

import com.greenfoxacademy.trialexam.model.Alias;
import com.greenfoxacademy.trialexam.service.AliasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AliasController {

    private AliasService aliasService;

    @Autowired
    public AliasController(AliasService aliasService) {
        this.aliasService = aliasService;
    }

    @GetMapping("/get")
    public String main(@ModelAttribute("alias") Alias alias) {
        return "index";
    }

    @GetMapping("/get/{id}")
    public String mainWithAlias(Model model, @PathVariable(value = "id", required = false) Long id) {
        if (id !=null) {
            model.addAttribute("alias", aliasService.getById(id));
        }
        return "index";
    }

    @PostMapping("/save-link")
    public String saveLink(@ModelAttribute("alias") Alias alias) {

        if (!aliasService.isExist(alias.getAliasName())) {
            aliasService.createAlias(alias);
            return "redirect:/get/" + alias.getId();
        } else {
            return "redirect:/get/" + aliasService.getByAliasName(alias.getAliasName()).getId();
        }
    }

    @GetMapping("/a/{aliasName}")
    public String goWebpage(@PathVariable("aliasName") String aliasName) {
        if (aliasService.getByAliasName(aliasName) != null) {
            aliasService.increaseHits(aliasName);
            return "redirect:" + aliasService.getByAliasName(aliasName).getUrl();
        } else {
            return "redirect:/error";
        }
    }

    @GetMapping("/error")
    @ResponseStatus(code = HttpStatus.FORBIDDEN)
    public String errorPage() {
        return "error";
    }

    @GetMapping("/api/links")
    @ResponseBody
    public Object links() {

        return aliasService.listAll();
    }
}
