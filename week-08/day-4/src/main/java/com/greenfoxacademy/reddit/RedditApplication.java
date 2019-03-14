package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.RedditRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    private RedditRepository redditRepository;

    public RedditApplication(RedditRepository redditRepository) {
        this.redditRepository = redditRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    public void run(String...args) throws Exception {
        redditRepository.save(new Post("Eat chocolate", "https://www.google.com/"));
        redditRepository.save(new Post("Soccer all day", "https://www.google.com/"));
        redditRepository.save(new Post("Summer holydays", "https://www.google.com/"));
        redditRepository.save(new Post("Programing languages", "https://www.google.com/"));
        redditRepository.save(new Post("Java", "https://www.google.com/"));
        redditRepository.save(new Post("Javavavavavavavvavava", "https://www.google.com/"));
    }
}
