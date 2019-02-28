package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.ListOfShopItems;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    ListOfShopItems listOfShopItems;

    public indexController() {
        listOfShopItems = new ListOfShopItems();
    }

    @RequestMapping("/index")
    public String webshop(Model model) {
        model.addAttribute("items", listOfShopItems.getListOfShopItems());
    return "index";
    }
}
