package com.example.demo1.repository;

import com.example.demo1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository
        extends JpaRepository<User, Integer> {
        List<User> findByUsernameEqualsAndPasswordAndLastname(String userName, String password, String lastname);
}
