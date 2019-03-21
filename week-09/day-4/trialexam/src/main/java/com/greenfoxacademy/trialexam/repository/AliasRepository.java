package com.greenfoxacademy.trialexam.repository;

import com.greenfoxacademy.trialexam.model.Alias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AliasRepository extends JpaRepository<Alias, Long> {
}
