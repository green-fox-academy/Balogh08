package com.greenfoxacademy.practicetodo.controller;

import com.greenfoxacademy.practicetodo.model.Assignee;
import com.greenfoxacademy.practicetodo.service.AssigneeService;
import com.greenfoxacademy.practicetodo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;
    private AssigneeService assigneeService;

    @Autowired
    public TodoController(TodoService todoService, AssigneeService assigneeService) {
        this.todoService = todoService;
        this.assigneeService = assigneeService;
    }

    @RequestMapping(value = {"", "/", "/list"}, method = RequestMethod.GET)
    public String list(Model model, @RequestParam(value = "isActive", required = false) boolean done) {
        model.addAttribute("todos", todoService.listAll(done));
        return "index";
    }

    @GetMapping("/filter")
    public String filterByAssignee(Model model, @RequestParam("assigneeName") Assignee key) {
        model.addAttribute("todos", todoService.findByForeignKey(key));
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
        model.addAttribute("assignees", assigneeService.listAll());
        return "edit";
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.PUT)
    public String edit(@PathVariable("id") Long id, String title, Boolean urgent, Boolean done, Assignee assignee) {
        todoService.edit(id, title, urgent, done, assignee);
        return "redirect:/todo";
    }

    @RequestMapping(value = "/{id}/info", method = RequestMethod.GET)
    public String getInfo(Model model, @PathVariable("id") Long id) {
        model.addAttribute("todo", todoService.findById(id));
        return "info";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(Model model ,@RequestParam("searchBy") int searchBy, @RequestParam("searchFor") String searchFor) {
        try {
            model.addAttribute("todos", todoService.search(searchBy, searchFor));
        } catch (ParseException ex) {
            ex.getErrorOffset();
        }
        return "index";
    }

//    @PutMapping("/set/assignee")
//    public String setAssignee(Model model, @RequestParam("assignee"))
}
