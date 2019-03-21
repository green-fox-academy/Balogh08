package com.greenfoxacademy.trialexam.repository;

import com.greenfoxacademy.trialexam.model.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
}
