package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private LogServiceInterface logService;

    public RestController(LogServiceInterface logServiceInterface) {
        this.logService = logServiceInterface;
    }

    @GetMapping("/doubling")
    public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
        if (input != null) {
            logService.log("/doubling", "input=" + input.toString());
            return new Doubling(input);
        } else {
            logService.log("/doubling", "input=");
            return new ErrorMessage("Please provide an input!");
        }
    }


    @GetMapping("/greeter")
    public Object greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
        logService.log("/greeter", "name=" + name + " title=" + title);
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
        logService.log("/appenda/" + appendable, "");
            return new AppendA(appendable);
    }

    @PostMapping("/dountil/{action}")
    public Object doUntil(@PathVariable("action") String action, @RequestBody(required = false) Until until) {
        logService.log("/dountil/" + action, "until=" + until.getUntil());
        if (until.getUntil() != null) {
            DoUntil doUntil = new DoUntil();
            doUntil.setResult(action, until.getUntil());
            return doUntil;
        } else {
            logService.log("/dountil/" + action, "until=null");
            return new ErrorMessage("Please provide a number!");
        }
    }

    @PostMapping("/arrays")
    public Object arrayHandler(@RequestBody(required = false) ArrayObject array) {
        logService.log("/arrays", "what=" + array.getWhat() + " numbers=" + Arrays.toString(array.getNumbers()));
        if (array.getWhat() != null && array.getNumbers() != null) {
            if(array.getWhat().equalsIgnoreCase("sum")) {
                return array.sum();
            } else if (array.getWhat().equalsIgnoreCase("multiply")) {
                return array.multiply();
            } else if(array.getWhat().equalsIgnoreCase("doubling")) {
                    return array.doubling();
            }
        }
        return new ErrorMessage("Please provide what to do with the numbers!");
    }

    @GetMapping("/log")
    public Object getLog() {
        logService.log("/log", "");
        return new LogReport(logService);
    }
}
