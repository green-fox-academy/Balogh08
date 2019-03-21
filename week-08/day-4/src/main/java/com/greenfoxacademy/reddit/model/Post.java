package com.greenfoxacademy.reddit.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long numberLike;
    private String title;
    private String link;
    @Temporal(TemporalType.DATE)
    private Date date;
    @ManyToOne
    private User user;

    public Post() {
        numberLike = 0;
        date = new Date();
    }

    public Post(String title, String link) {
        this.title = title;
        this.link = link;
        numberLike = 0;
        date = new Date();
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
