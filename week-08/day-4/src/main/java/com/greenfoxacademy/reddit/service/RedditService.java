package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RedditService {
    private RedditRepository redditRepository;

    @Autowired
    public RedditService(RedditRepository redditRepository) {
        this.redditRepository = redditRepository;
    }

    public List<Post> listAll(Long pageNumber) {
        if (pageNumber == null) {
            pageNumber = 1L;
        }
        Long skipBy = 10 * (pageNumber - 1);
        List<Post> result = new ArrayList<>();
        redditRepository.findAll().forEach(result::add);

        result = result.stream()
                .sorted((a, b) -> a.getNumberLike() > b.getNumberLike() ? -1 : 0)
                .skip(skipBy)
                .limit(10)
                .collect(Collectors.toList());

        return result;
    }

    public void savePost(String title   , String url) {
        redditRepository.save(new Post(title, url));
    }

    public void upVote(Long id) {
        Post post = redditRepository.findById(id).orElseThrow(NullPointerException::new);
        post.increaseLike();
        redditRepository.save(post);
    }

    public  void downVote(Long id) {
        Post post = redditRepository.findById(id).orElseThrow(NullPointerException::new);
        post.decreaseLike();
        redditRepository.save(post);
    }

    public void delete(Long id) {
        redditRepository.deleteById(id);
    }

    public List<Post> get10BestPost(Long page) {
        return redditRepository.top10SecondVersion((page - 1) * 10);
    }

    public List<Post> get10BestPostSecondVersion(Long page) {
        return redditRepository.top10((page - 1) * 10);
    }
}
