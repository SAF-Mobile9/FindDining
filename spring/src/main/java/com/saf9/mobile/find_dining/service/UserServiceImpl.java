package com.saf9.mobile.find_dining.service;

import com.saf9.mobile.find_dining.dto.User;
import com.saf9.mobile.find_dining.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> getAllUsers() {
        return mapper.getAllUsers();
    }

    @Override
    public User getUserById(Long id) {
        return mapper.getUserById(id);
    }

    @Override
    public void insertUser(User user) {
        mapper.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        mapper.updateUser(user);
    }

    @Override
    public void deleteUserById(Long id) {
        mapper.deleteUserById(id);
    }
}
