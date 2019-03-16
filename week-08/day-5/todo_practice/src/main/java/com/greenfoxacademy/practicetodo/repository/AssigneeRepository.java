package com.greenfoxacademy.practicetodo.repository;

import com.greenfoxacademy.practicetodo.model.Assignee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssigneeRepository extends JpaRepository<Assignee, Long> {
}
