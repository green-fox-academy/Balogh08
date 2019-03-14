package com.greenfoxacademy.reddit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long numberLike;
    private String title;
    private String link;

    public Post() {
    }

    public Post(String title, String link) {
        this.title = title;
        this.link = link;
        numberLike = 0;
    }

    public Post(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getNumberLike() {
        return numberLike;
    }

    public void setNumberLike(long numberLike) {
        this.numberLike = numberLike;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void increaseLike() {
        numberLike++;
    }

    public void decreaseLike() {
        if (numberLike > 0) {
            numberLike--;
        }
    }
}
