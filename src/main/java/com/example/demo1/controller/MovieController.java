package com.example.demo1.controller;

import com.example.demo1.model.Movie;
import com.example.demo1.model.User;
import com.example.demo1.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping("/movie")
    public Movie saveMovie(@RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    @GetMapping("/movies/title")
    public List<Movie> searchTitle(@RequestParam String title) {
        return movieService.getMoviesByTitle(title);
    }

//
//    @GetMapping("/movies/title")
//    public List<Movie> searchTitle(@RequestParam String title) {
//        return movieService.getMoviesByTitle(title);
//    }
}

