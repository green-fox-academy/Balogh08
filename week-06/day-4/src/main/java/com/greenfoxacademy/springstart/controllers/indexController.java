package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.ListOfShopItems;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    ListOfShopItems listOfShopItems;

    public indexController() {
        listOfShopItems = new ListOfShopItems();
    }

    @GetMapping("/allItems")
    public String allItems(Model model) {
        model.addAttribute("items", listOfShopItems.getListOfShopItems());
        return "index";
    }

    @GetMapping("/onlyAvailable")
    public String availableItems(Model model) {
        model.addAttribute("items", listOfShopItems.sortOnlyAvailable());
        return "index";
    }

    @GetMapping("/cheapestFirst")
    public String cheapestFirst(Model model) {
        model.addAttribute("items", listOfShopItems.cheapestFirst());
        return "index";
    }

    @GetMapping("/containsNike")
    public String containsNike(Model model) {
        model.addAttribute("items", listOfShopItems.containsNike());
        return "index";
    }

    @GetMapping("/averageStock")
    public String averageStock(Model model) {
        model.addAttribute("items", listOfShopItems.averageStock());
        return "dataOfItem";
    }

    @GetMapping("/mostExpensive")
    public String mostExpensive(Model model) {
        model.addAttribute("items", listOfShopItems.mostExpensive());
        return "dataOfItem";
    }


}
