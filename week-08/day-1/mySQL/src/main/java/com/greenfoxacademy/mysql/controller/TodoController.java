package com.greenfoxacademy.mysql.controller;

import com.greenfoxacademy.mysql.model.Todo;
import com.greenfoxacademy.mysql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = {"", "/list"}, method = RequestMethod.GET)
    public String list(Model model, @RequestParam(value = "isActive", required = false) boolean isActive) {
        model.addAttribute("todos", isActive ? todoService.listActive() : todoService.listAll());
        return "todolist";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getAdd() {
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String postAdd(String newToDo) {
        todoService.addToDo(newToDo);
        return "redirect:/todo";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        todoService.deleteToDo(id);
        return "redirect:/todo";
    }

    @RequestMapping(value = "/{id}/delete")
    public String delete2(@PathVariable("id") Long id) {
        todoService.deleteToDo(id);
        return "redirect:/todo";
    }

    @RequestMapping(value = "/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        model.addAttribute("todo", todoService.getEditable(id));
        return "edit";
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.POST)
    public String edit2(@PathVariable Long id, Todo todo) {

//        todoService.editTodo(todo);
        return "redirect:/todo";
    }
}
