package com.id.demo.controller;

import com.id.demo.model.UtilityService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    private UtilityService utilityService;

    public Controller() {
        utilityService = new UtilityService();
    }

    @GetMapping("useful")
    public String getUseful() {
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String getColored(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }

    @GetMapping("/useful/email")
    public String getEmail(@RequestParam("email") String email, Model model) {
        model.addAttribute("validEmail", utilityService.validateEmail(email));
        return "useful";
    }

}
