package com.example.userService.controller;

import com.example.userService.model.User;
import com.example.userService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/clean-up")
    public String deleteAllUsers() {
        userService.clearDb();
        return "DB cleaned";
    }

    @GetMapping("/user")
    public User getUserByName(@RequestParam String name) {
        return userService.getUserByName(name);
    }

    @PostMapping("/user")
    public User createNewUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
