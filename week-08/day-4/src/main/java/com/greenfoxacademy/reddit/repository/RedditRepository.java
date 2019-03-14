package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface RedditRepository extends CrudRepository <Post, Long> {
}