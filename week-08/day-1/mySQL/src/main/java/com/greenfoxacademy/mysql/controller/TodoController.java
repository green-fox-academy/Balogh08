package com.greenfoxacademy.mysql.controller;

import com.greenfoxacademy.mysql.repository.TodoRepository;
import com.greenfoxacademy.mysql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = {"/", "/list", "/todo"}, method = RequestMethod.GET)
    public String list(Model model, @RequestParam(value = "isActive", required = false) boolean isActive) {
        model.addAttribute("todos", isActive ? todoService.listActive() : todoService.listAll());
        return "todolist";
    }
}
