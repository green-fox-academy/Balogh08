package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/reddit")
public class RedditController {

    private RedditService redditService;

    @Autowired
    public RedditController(RedditService redditService) {
        this.redditService = redditService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String main(Model model, @RequestParam(value = "pageNumber", required = false) Long pageNumber) {
        model.addAttribute("posts", redditService.listAll(pageNumber));
        return "main";
    }

    @RequestMapping(value = "submit", method = RequestMethod.GET)
    public String getSubmit() {
        return "submit";
    }

    @RequestMapping(value = "submit", method = RequestMethod.POST)
    public String addPost(String title, String url) {
        redditService.savePost(title, url);
        return "redirect:/reddit";
    }

    @RequestMapping(value = "/{id}/increase", method = RequestMethod.POST)
    public String increaseLike(@PathVariable("id") Long id) {
        redditService.upVote(id);
        return "redirect:/reddit";
    }

    @RequestMapping(value = "/{id}/decrease", method = RequestMethod.POST)
    public String decreaseLike(@PathVariable("id") Long id) {
        redditService.downVote(id);
        return "redirect:/reddit";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.DELETE)
    public String deletePost(@PathVariable("id") Long id) {
        redditService.delete(id);
        return "redirect:/reddit";
    }

    @RequestMapping(value = "top", method = RequestMethod.GET)
    public String top(Model model, @RequestParam(value = "pageNumber", required = false) Long pageNumber) {
        model.addAttribute("posts", redditService.get10BestPost(pageNumber));
        return "main";
    }
}
