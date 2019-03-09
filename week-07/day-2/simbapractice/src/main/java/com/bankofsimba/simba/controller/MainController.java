package com.bankofsimba.simba.controller;

import com.bankofsimba.simba.model.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {

    private Accounts bank;

    @Autowired
    public MainController(Accounts bank) {
        this.bank = bank;
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String showAccounts(Model model) {
        model.addAttribute("accounts", bank);
        return "index";
    }

    @RequestMapping(value = "/html", method = RequestMethod.GET)
    public String html(Model model) {
        model.addAttribute("string","This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "HTMLception";
    }

}
