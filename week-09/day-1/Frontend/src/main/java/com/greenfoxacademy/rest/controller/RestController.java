package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.*;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/doubling")
    public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
        if (input != null) {
            return new Doubling(input);
        } else {
            return new ErrorMessage("Please provide an input!");
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

    @PostMapping("/dountil/{action}")
    public Object doUntil(@PathVariable("action") String action, @RequestBody(required = false) Until until) {
        if (until.getUntil() != null) {
            DoUntil doUntil = new DoUntil();
            doUntil.setResult(action, until.getUntil());
            return doUntil;
        } else {
            return new ErrorMessage("Please provide a number!");
        }
    }
}
