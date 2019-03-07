package com.id.demo.controller;

import com.id.demo.model.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class UtilityController {
    private UtilityService utilityService;

    @Autowired
    public UtilityController(UtilityService utilityService) {
        this.utilityService = utilityService;
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

    @GetMapping("/useful/code")
    public String getCode(@RequestParam("text") String text, @RequestParam("number") int number, Model model) {
        model.addAttribute("codedWord", utilityService.caesar(text, number));
        return "useful";
    }
}
