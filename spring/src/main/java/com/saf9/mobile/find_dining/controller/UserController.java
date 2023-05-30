package com.saf9.mobile.find_dining.controller;

import com.saf9.mobile.find_dining.dto.User;
import com.saf9.mobile.find_dining.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;
    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return service.getUserById(id);
    }
    @PostMapping
    public void insertUser(@RequestBody User user) {
        service.insertUser(user);
    }
    @PutMapping
    public void updateUser(@RequestBody User user) {
        service.updateUser(user);
    }
    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        service.deleteUserById(id);
    }
}
