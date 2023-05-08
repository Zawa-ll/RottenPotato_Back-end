package com.example.demo1.repository;

import com.example.demo1.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MovieRepository
        extends JpaRepository<Movie, Integer> {
    List<Movie> findMovieByTitle(String title);
    //    List<Movie> findMovieByTitle(String title);
}
