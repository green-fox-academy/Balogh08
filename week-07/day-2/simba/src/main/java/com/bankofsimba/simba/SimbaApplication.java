package com.bankofsimba.simba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SimbaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimbaApplication.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello Simba! It's the default page!";
    }

}
