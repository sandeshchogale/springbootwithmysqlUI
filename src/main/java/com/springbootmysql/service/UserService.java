package com.springbootmysql.service;

import java.util.List;

import com.springbootmysql.entity.User;

public interface UserService {
    User createUser(User user);

    User getUserById(Integer userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Integer userId);
}
