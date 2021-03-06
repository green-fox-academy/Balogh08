package com.greenfoxacademy.practicetodo.controller;

import com.greenfoxacademy.practicetodo.service.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignees")
public class AssigneeController {

    private AssigneeService assigneeService;

    @Autowired
    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String listAssignees(Model model) {
        model.addAttribute("assignees", assigneeService.listAll());
        return "assignee";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addAssignee(String name, String email) {
        assigneeService.add(name, email);
        return "redirect:/assignees";
    }

    @DeleteMapping("/{id}/delete")
    public String deleteAssignee(@PathVariable("id") Long id) {
        assigneeService.delete(id);
        return "redirect:/assignees";
    }

    @GetMapping("/{id}/edit")
    public String getEditAssignee(Model model, @PathVariable("id") Long id) {
        model.addAttribute("assignee", assigneeService.findById(id));
        return "editassignee";
    }

    @PutMapping("/{id}/edit")
    public String editAssignee(@PathVariable("id") Long id, String name, String email) {
        assigneeService.edit(id, name, email);
        return "redirect:/assignees";
    }

    @GetMapping("/filter")
    public String filterByAssignee(Model model, @RequestParam("assigneeName") String name) {
        model.addAttribute("todos", assigneeService.findByName(name));
        return "redirect:/todo";
    }

    @GetMapping("/{id}/details")
    public String getAssigneesTodos(Model model, @PathVariable("id") Long id) {
        model.addAttribute("assignee", assigneeService.findById(id));
        model.addAttribute("todos", assigneeService.findById(id).getTodos());
        return "assignees_todos";
    }
}
