package com.example.demo1.service;

import com.example.demo1.model.Movie;
import com.example.demo1.model.User;
import com.example.demo1.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;


    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }


//    public List<Movie> getMoviesByTitle(String title) {
//        return movieRepository.findMovieByTitle(title);
//    }

    public List<Movie> getMoviesByTitle(String title) {
        return movieRepository.findMovieByTitle(title);
    }
}
