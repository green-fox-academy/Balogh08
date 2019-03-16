package com.greenfoxacademy.practicetodo.controller;

import com.greenfoxacademy.practicetodo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class MainController {

    private TodoService todoService;

    @Autowired
    public MainController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = {"", "/", "/list"}, method = RequestMethod.GET)
    public String list(Model model, @RequestParam(value = "isActive", required = false) boolean done) {
        model.addAttribute("todos", todoService.listAll(done));
        return "index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return "create";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String create(String todo) {
        todoService.save(todo);
        return "redirect:/todo";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        todoService.delete(id);
        return "redirect:/todo";
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public String getEdit(Model model, @PathVariable("id") Long id) {
        model.addAttribute("todo", todoService.findById(id));
        return "edit";
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.PUT)
    public String edit(@PathVariable("id") Long id, String title, Boolean urgent, Boolean done) {
        todoService.edit(id, title, urgent, done);
        return "redirect:/todo";
    }

    @RequestMapping(value = "/{id}/info", method = RequestMethod.GET)
    public String getInfo(Model model, @PathVariable("id") Long id) {
        model.addAttribute("todo", todoService.findById(id));
        return "info";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(Model model ,@RequestParam("searchBy") int searchBy, @RequestParam("searchFor") String searchFor) {
        model.addAttribute("todos", todoService.search(searchBy, searchFor));
        return "index";
    }

    @RequestMapping(value = "/assignees", method = RequestMethod.GET)
    public String listAssignees(Model model) {
        model.addAttribute("assignees", assigneeService.listAll());
        return "assignee";
    }
}
