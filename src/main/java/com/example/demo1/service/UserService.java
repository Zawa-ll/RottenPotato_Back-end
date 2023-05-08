package com.example.demo1.service;

import com.example.demo1.model.Movie;
import com.example.demo1.model.User;
import com.example.demo1.repository.MovieRepository;
import com.example.demo1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> deleteUser(int id) {
        userRepository.deleteById(id);
        return userRepository.findAll();
    }

//    public ResponseEntity<List<User>> getUserByUsername(String username) {
//        return new ResponseEntity<List<User>>(userRepository.findByUsernameEquals(username), HttpStatus.OK);
//    }
    public List<User> getUserByUsername(String username, String password, String lastname) {
        return userRepository.findByUsernameEqualsAndPasswordAndLastname(username, password, lastname);
    }
}
