package baloghbotond_webshop.webshop2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Webshop2Application {

    public static void main(String[] args) {
        SpringApplication.run(Webshop2Application.class, args);

    }

    @RequestMapping("/")
    @ResponseBody
    public static String hello() {
        return "Hello world";
    }

}
