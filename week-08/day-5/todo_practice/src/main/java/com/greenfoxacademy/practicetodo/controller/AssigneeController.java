package com.greenfoxacademy.practicetodo.controller;

import com.greenfoxacademy.practicetodo.service.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/todo")
public class AssigneeController {

    private AssigneeService assigneeService;

    @Autowired
    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @RequestMapping(value = "/assignees", method = RequestMethod.GET)
    public String listAssignees(Model model) {
        model.addAttribute("assignees", assigneeService.listAll());
        return "assignee";
    }

    @RequestMapping(value = "/todo/assignees/add", method = RequestMethod.POST)
    public String addAssignee(String name, String email) {
        assigneeService.add(name, email);
        return "redirect:/todo/assignees";
    }

    @DeleteMapping("/todo/assignees/{id}/delete")
    public String deleteAssignee(@PathVariable("id") Long id) {
        assigneeService.delete(id);
        return "redirect:/todo/assignees";
    }
}
