package com.example.demo1.controller;

import com.example.demo1.model.Movie;
import com.example.demo1.model.User;
import com.example.demo1.repository.UserRepository;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @DeleteMapping("/user/{Id}")
    List<User> deleteUser(@PathVariable("Id") Integer id) {
        return userService.deleteUser(id);
    }

    @GetMapping("/users/username")
    public List<User> findUser(@RequestParam String username, String password, String lastname) {
        return userService.getUserByUsername(username, password, lastname);
    }
}
