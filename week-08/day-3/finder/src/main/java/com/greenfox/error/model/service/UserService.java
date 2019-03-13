package com.greenfox.error.model.service;

import com.greenfox.error.model.model.User;
import com.greenfox.error.model.repository.ErrorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    private ArrayList<User> users;
    private ErrorRepository errorRepository;

    @Autowired
    public UserService(ErrorRepository errorRepository) {
        this.users = new ArrayList<>();
        this.errorRepository = errorRepository;
    }

    public ArrayList<User> getAll() {
        return users;
    }

    public void save(User user) {
        users.add(user);
    }

    public UserService service() {
        return new UserService(errorRepository);
    }
}
