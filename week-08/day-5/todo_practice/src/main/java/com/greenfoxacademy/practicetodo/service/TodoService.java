package com.greenfoxacademy.practicetodo.service;

import com.greenfoxacademy.practicetodo.model.Todo;
import com.greenfoxacademy.practicetodo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> listAll(Boolean done) {
        if (done == null) {
            done = false;
        }

        List<Todo> result = new ArrayList<>(todoRepository.findAll());

        if (done) {
            return result.stream()
                    .filter(todo -> !todo.isDone())
                    .collect(Collectors.toList());
        }

        return result;
    }

    public void save(String title) {
        Todo todo = new Todo(title);
        todoRepository.save(todo);
    }

    public void delete(Long id) {
        todoRepository.deleteById(id);
    }

    public Todo findById(Long id) {
        return todoRepository.findById(id).orElseThrow(NullPointerException::new);
    }

    public void edit(Long id, String title, Boolean urgent, Boolean done) {
        if (urgent == null) {
            urgent = false;
        }
        if (done == null) {
            done = false;
        }

        Todo result = todoRepository.findById(id).orElseThrow(NullPointerException::new);
        result.setTitle(title);
        result.setUrgent(urgent);
        result.setDone(done);
        todoRepository.save(result);
    }

    public List<Todo> search(int searchBy, String searchFor) throws ParseException {
        List<Todo> result = new ArrayList<>(todoRepository.findAll());

        if (searchBy == 0) {
            return result.stream()
                    .filter(todo -> todo.getId() == Integer.parseInt(searchFor))
                    .collect(Collectors.toList());
        } else if (searchBy == 1) {
            return result.stream()
                    .filter(todo -> todo.getTitle().toLowerCase().contains(searchFor.toLowerCase()))
                    .collect(Collectors.toList());
        } else if (searchBy == 2) {
            return result.stream()
                    .filter(todo -> todo.getAssignee().getName().toLowerCase().contains(searchFor.toLowerCase()))
                    .collect(Collectors.toList());
        } else if (searchBy == 3) {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
            Date date;
            try {
                date = dateFormat.parse(searchFor);
                return result.stream()
                        .filter(todo -> todo.getDate().equals(date))
                        .collect(Collectors.toList());
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
            return result;
    }
}
