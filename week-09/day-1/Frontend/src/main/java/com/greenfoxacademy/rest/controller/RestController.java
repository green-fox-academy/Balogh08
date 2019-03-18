package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.AppendA;
import com.greenfoxacademy.rest.model.Doubling;
import com.greenfoxacademy.rest.model.ErrorMessage;
import com.greenfoxacademy.rest.model.Greeter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/doubling")
    public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
        if (input != null) {
            return new Doubling(input);
        } else {
            return new ErrorMessage("Please provide an input");
        }
    }


    @GetMapping("/greeter")
    public Object greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
        if (name != null && title != null) {
            return new Greeter(name, title);
        } else if (name != null) {
            return new ErrorMessage("Please provide a title!");
        } else if (title != null) {
            return new ErrorMessage("Please provide a name!");
        } else {
            return new ErrorMessage("Please provide a name and a title!");
        }
    }

    @GetMapping("/appenda/{appendable}")
    public Object appenda(@PathVariable(value = "appendable", required = false) String appendable) {
            return new AppendA(appendable);
    }
}
