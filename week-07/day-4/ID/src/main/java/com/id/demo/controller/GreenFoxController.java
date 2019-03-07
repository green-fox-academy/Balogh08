package com.id.demo.controller;

import com.id.demo.model.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenFoxController {

    private StudentService studentService;

    @Autowired
    public GreenFoxController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/gfa")
    public String index() {
        return "gfa";
    }

    @GetMapping("/gfa/list")
    public String getStudentList(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "list";
    }

    @GetMapping("/gfa/add")
    public String getAdd() {
        return "add";
    }

    @PostMapping("/gfa/add")
    public String addStudent(Model model, @RequestParam("name") String name) {
        model.addAttribute("student", studentService.addStudent(name));
        return "add";
    }
}
