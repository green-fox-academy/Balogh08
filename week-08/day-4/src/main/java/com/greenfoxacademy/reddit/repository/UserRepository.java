package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
