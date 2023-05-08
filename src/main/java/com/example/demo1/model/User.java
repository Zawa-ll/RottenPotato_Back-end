package com.example.demo1.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(
            mappedBy = "user",
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE}
    )
    private List<Movie> movies = new ArrayList<>();
    private Integer userId;
    private String username;
    private String password;
    private String firstname;
    private String lastname;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Movie> getMovie() {
        return movies;
    }

    public void setMovie(List<Movie> movies) {
        this.movies = movies;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void addMovie(Movie movie) {
        if(movies.contains(movie)) {
            movies.add(movie);
            movie.setUser(this);
        }
    }

    public void removeMovie(Movie movie) {
        if (this.movies.contains(movie)) {
            this.movies.remove(movie);
            movie.setUser(null);
        }
    }
}
