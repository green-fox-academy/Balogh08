package com.greenfox.error.model.repository;

import com.greenfox.error.model.model.User;
import org.springframework.data.repository.CrudRepository;


public interface ErrorRepository extends CrudRepository<User, Long> {
}
