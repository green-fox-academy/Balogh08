package com.greenfoxacademy.practicetodo.controller;

import com.greenfoxacademy.practicetodo.service.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping(value = "/assignees/add", method = RequestMethod.POST)
    public String addAssignee(String name, String email) {
        assigneeService.add(name, email);
        return "redirect:/assignees";
    }
}
