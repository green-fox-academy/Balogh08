package com.greenfoxacademy.todo.controller;

import com.greenfoxacademy.todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

    private Todo todo;

    @Autowired
    public TodoController(Todo todo) {
        this.todo = todo;
    }

    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    @ResponseBody
    public String list() {
        return "This is my first Todo";
    }


}
