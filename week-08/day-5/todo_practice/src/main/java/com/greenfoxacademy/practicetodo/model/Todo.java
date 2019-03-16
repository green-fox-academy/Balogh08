package com.greenfoxacademy.practicetodo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private boolean isUrgent;
    private boolean isDone;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "assigne_id")
    private Assignee assignee;

    public Todo() {
    }

    public Todo(String title) {
        this.title = title;
        isUrgent = false;
        isDone = false;
        date = new Date();

    }

    public Todo(String title, Assignee assignee) {
        this.title = title;
        isUrgent = false;
        isDone = false;
        date = new Date();
        this.assignee = assignee;
    }

    @Override
    public String toString() {
        return "<b>Title:</b> " + title
                + "<b>Urgent:</b> " + isUrgent
                + "<b>Done:</b> " + isDone;
    }
}
