package com.bankofsimba.simba.controller;

import com.bankofsimba.simba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DefaultController {

    private List<BankAccount> bankAccounts = new ArrayList<>();

    public DefaultController() {
        bankAccounts.add(new BankAccount("Simba", 2000, "lion", true));
        bankAccounts.add(new BankAccount("Mufasa", 20000, "monkey", true));
        bankAccounts.add(new BankAccount("Timon", 50, "something", false));
        bankAccounts.add(new BankAccount("Pumba", 100, "pig", false));
        bankAccounts.add(new BankAccount("Boti", 5000, "human", true));

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

    @PostMapping("/addGold")
    public String sendGold(Model model, @RequestParam("add") int index) {
    bankAccounts.get(index).raiseBalance();
model.addAttribute("accounts", bankAccounts);
        return "accounts";
    }

    @PostMapping("/accounts")
    public String addAccount(Model model, @RequestParam("name") String name, @RequestParam("balance") int balance, @RequestParam("type") String type, @RequestParam("isGoodGuy") boolean isGood) {
        bankAccounts.add(new BankAccount(name, balance, type, isGood));
        model.addAttribute("accounts", bankAccounts);
        return "accounts";
    }
}
