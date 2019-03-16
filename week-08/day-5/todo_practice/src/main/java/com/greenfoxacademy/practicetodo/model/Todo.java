package com.greenfoxacademy.practicetodo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    public Todo() {
    }

    public Todo(String title) {
        this.title = title;
        isUrgent = false;
        isDone = false;
        date = new Date();
    }

    @Override
    public String toString() {
        return "<b>Title:</b> " + title
                + "<b>Urgent:</b> " + isUrgent
                + "<b>Done:</b> " + isDone;
    }
}
