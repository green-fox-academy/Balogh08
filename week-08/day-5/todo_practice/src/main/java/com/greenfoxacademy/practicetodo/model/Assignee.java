package com.greenfoxacademy.practicetodo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Assignee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String email;
    @OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY, mappedBy = "assignee")
    private List<Todo> todos;

    public Assignee() {
        todos = new ArrayList<>();
    }

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addTodo(Todo todo) {
        todos.add(todo);
    }
}
