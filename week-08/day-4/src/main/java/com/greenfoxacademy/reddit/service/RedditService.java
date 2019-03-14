package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RedditService {
    private RedditRepository redditRepository;

    @Autowired
    public RedditService(RedditRepository redditRepository) {
        this.redditRepository = redditRepository;
    }

    public List<Post> listAll() {
        List<Post> result = new ArrayList<>();
        redditRepository.findAll().forEach(result::add);
        return result;
    }

    public void savePost(String title, String url) {
        redditRepository.save(new Post(title, url));
    }
}
