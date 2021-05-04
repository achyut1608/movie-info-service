package com.learn.micrsoservice.movieinfoservice.service;

import com.learn.micrsoservice.movieinfoservice.modal.Movie;

import java.util.List;

public interface MovieService {

    public Movie getMovie(String movieId);

    public Movie insertMovie(Movie movie);

    public int deleteMovie(String movieId);

    public Movie updateMovie(String movieId,Movie movie);

    public List<Movie> getAllMovie();

    public List<Movie> getMovieByGenre(String genre);
}
