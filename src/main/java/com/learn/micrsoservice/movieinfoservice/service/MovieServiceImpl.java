package com.learn.micrsoservice.movieinfoservice.service;

import com.learn.micrsoservice.movieinfoservice.modal.Movie;
import com.learn.micrsoservice.movieinfoservice.repositories.MovieRepo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("movieService")
public class MovieServiceImpl implements  MovieService {

    Logger LOGGER = LogManager.getLogger(MovieServiceImpl.class.getName());

    @Autowired
    MovieRepo movieRepo;


    @Override
    public Movie getMovie(String movieId) {
        System.out.println("inside movie service");
        Movie movie =(Movie) movieRepo.findById(movieId).get();
        LOGGER.info("Movie finded : " + movie + " using movieID : " + movieId);
        return movie;
    }

    @Override
    @Transactional
    public Movie insertMovie(Movie movie) {
        Movie movie1= movieRepo.save(movie);
        LOGGER.info("Movie is saved : " + movie1);

        return  movie1;
    }

    @Override
    @Transactional
    public int deleteMovie(String movieId) {
        try {
            movieRepo.deleteById(movieId);
            return  1;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return  -1;
    }

    @Override
    @Transactional
    public Movie updateMovie(String movieId, Movie movie) {
        Movie movie1 = movie;




        return null;
    }

    @Override
    public List<Movie> getAllMovie() {
        System.out.println("in get all movie service");
        List<Movie> list=movieRepo.findAll();
        return  list;
    }

    @Override
    public List<Movie> getMovieByGenre(String genre) {
        List<Movie> list = movieRepo.findByGenre(genre);
        return list;
    }
}
