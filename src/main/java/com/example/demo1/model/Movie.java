package com.example.demo1.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Movie {

    @Id
    private Integer id;


    @ManyToOne
    @JoinColumn(
            name="user_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "user_movie_fk"
            )
    )
    private User user;

    private Integer movieId;
    private String title;
    private String director;
    private String country;
    private String rating;
    private String description;
    private String genre;
    private String year;
    private String poster;

    public Movie() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        if (this.user != null) {
            this.user = null;
        }
        this.user = user;
        user.addMovie(this);

    }

//    public void removeUser(User user) {
//        if (this.user != null) {
//            user.removeMovie(this);
//            this.user = null;
//        }
//    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
