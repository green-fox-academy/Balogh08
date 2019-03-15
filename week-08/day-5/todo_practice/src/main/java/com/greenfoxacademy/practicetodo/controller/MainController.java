package com.greenfoxacademy.practicetodo.controller;

import com.greenfoxacademy.practicetodo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/todo")
public class MainController {

    private TodoService todoService;

    @Autowired
    public MainController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = {"", "/", "/list"}, method = RequestMethod.GET)
    public String list(Model model) {
        return "index";
    }
}
