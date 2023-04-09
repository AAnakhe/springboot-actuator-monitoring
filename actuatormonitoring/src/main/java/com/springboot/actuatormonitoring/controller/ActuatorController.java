package com.springboot.actuatormonitoring.controller;

import com.springboot.actuatormonitoring.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ActuatorController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("John", "Doe"));
        users.add(new User("Jane", "Doe"));
        users.add(new User("Bob", "Smith"));
        return users;
    }
}
