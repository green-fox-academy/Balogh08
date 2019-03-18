package com.greenfoxacademy.rest.Repository;

import com.greenfoxacademy.rest.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Long> {
}
