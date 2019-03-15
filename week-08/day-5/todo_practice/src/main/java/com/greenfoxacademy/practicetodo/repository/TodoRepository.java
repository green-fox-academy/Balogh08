package com.greenfoxacademy.practicetodo.repository;

import com.greenfoxacademy.practicetodo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
