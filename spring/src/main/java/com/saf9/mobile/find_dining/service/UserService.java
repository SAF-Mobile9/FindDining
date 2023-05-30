package com.saf9.mobile.find_dining.service;

import com.saf9.mobile.find_dining.dto.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void insertUser(User user);
    void updateUser(User user);
    void deleteUserById(Long id);
}
