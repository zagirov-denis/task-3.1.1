package ru.zanuda.springboot.service;

import ru.zanuda.springboot.models.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    void deleteById(long id);

    User findById(long id);

    void update(User user);
}
