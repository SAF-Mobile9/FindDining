package com.saf9.mobile.find_dining.controller;

import com.saf9.mobile.find_dining.dto.User;
import com.saf9.mobile.find_dining.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@Controller
public class UserController {
    private final UserRepository userRepository;

    @PostMapping("/user")
    public String createUser(@RequestBody User user) {
        userRepository.save(user);
        return "form";
    }

    @ResponseBody
    @GetMapping("/user/{id}")
    public Optional<User> readUser(@PathVariable("id") Long id) {
        return userRepository.findById(id);
    }

    @PutMapping("/user/")
    public String updateUser(@RequestBody User user) {
        userRepository.save(user);
        return "form";
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userRepository.deleteById(id);
        return "form";
    }
}
