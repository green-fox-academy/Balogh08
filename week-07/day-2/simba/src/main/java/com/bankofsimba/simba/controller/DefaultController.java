package com.bankofsimba.simba.controller;

import com.bankofsimba.simba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DefaultController {

    private List<BankAccount> bankAccounts = new ArrayList<>();

    public DefaultController() {
        bankAccounts.add(new BankAccount("Simba", 2000, "lion"));
        bankAccounts.add(new BankAccount("Mufasa", 20000, "monkey"));
        bankAccounts.add(new BankAccount("Timon", 50, "something"));
        bankAccounts.add(new BankAccount("Pumba", 100, "pig"));
        bankAccounts.add(new BankAccount("Boti", 5000, "human"));

        bankAccounts.get(4).setKing();

    }

    @GetMapping("/account")
    public String getAccount(Model model) {
        model.addAttribute("accounts", bankAccounts);
        return "index";
    }

    @GetMapping("/htmlception")
    public String getHtml(Model model) {
        model.addAttribute("string", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "htmlception";
    }

    @GetMapping("/accounts")
    public String getAccounts(Model model) {
        model.addAttribute("accounts", bankAccounts);
        return "accounts";
    }
}
