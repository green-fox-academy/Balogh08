package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RedditRepository extends CrudRepository <Post, Long> {

    @Query(value = "SELECT * FROM Post ORDER BY post.number_like DESC LIMIT :pageNumber, 10", nativeQuery = true)
    List<Post> top10(@Param ("pageNumber") Long pageNumber);

}
