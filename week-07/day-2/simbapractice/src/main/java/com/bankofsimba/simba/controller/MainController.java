package com.bankofsimba.simba.controller;

import com.bankofsimba.simba.model.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


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

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(int index) {
        bank.getIndexAccount(index).addGold();
        return "redirect:/show";
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String newAccount(String name, String type, boolean good, boolean king) {
        bank.addAccount(name, type, good, king);
        return "redirect:/show";
    }

    @RequestMapping(value = "/add2", method = RequestMethod.POST)
    public String add2(int index) {
        bank.getIndexAccount(index).addGold();
        return "redirect:/show";
    }

}
