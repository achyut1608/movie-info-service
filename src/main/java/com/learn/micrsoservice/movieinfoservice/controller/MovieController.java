package com.learn.micrsoservice.movieinfoservice.controller;

import com.learn.micrsoservice.movieinfoservice.exception.MovieNotFoundException;
import com.learn.micrsoservice.movieinfoservice.modal.Movie;
import com.learn.micrsoservice.movieinfoservice.service.MovieService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movie-info")
public class MovieController {
    Logger LOGGER = LogManager.getLogger(MovieController.class.getName());
    @Autowired
    MovieService movieService;

    @GetMapping("/{movieId}")
    public ResponseEntity<Movie> getMovieInfo(@PathVariable("movieId") String movieId){
        try {
            System.out.println("inside get movie info controller");
            return new ResponseEntity<Movie>(movieService.getMovie(movieId),HttpStatus.OK);
        }catch (MovieNotFoundException ex){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Movie not found");
        }

    }

    @PostMapping
    public ResponseEntity<Movie> insertMovie(@RequestBody Movie movie){
        try{
            System.out.println("inside put mapping");
            return new ResponseEntity<Movie>(movieService.insertMovie(movie), HttpStatus.OK);
        } catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"There is some problem");
        }
    }

    @PutMapping("/{movieId}")
    public ResponseEntity<Movie> updateMovie(@PathVariable("movieId") String movieId, @RequestBody Movie movie){
        try {
            return  new ResponseEntity<Movie>(movieService.updateMovie(movieId,movie),HttpStatus.OK);
        } catch (Exception ex){
            throw  new ResponseStatusException(HttpStatus.BAD_REQUEST,"There is some problem");
        }
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovie(){
        try {
            System.out.println("in get all movie in get all movie");
            return new ResponseEntity<List<Movie>>(movieService.getAllMovie(),HttpStatus.OK);
        } catch(Exception ex){
            throw  new ResponseStatusException(HttpStatus.BAD_REQUEST,"There is some problem");
        }
    }

    @DeleteMapping("/{movieId}")
    public ResponseEntity<Movie> deleteForm(@PathVariable("movieId") String movieId) {
        try {
            return new ResponseEntity(movieService.deleteMovie(movieId), HttpStatus.OK);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application not found");
        }
    }

    @GetMapping("/genre/{genre}")
    public ResponseEntity<List<Movie>> getMovieByGenre(@PathVariable("genre") String genre){
        try {
            return  new ResponseEntity<List<Movie>>(movieService.getMovieByGenre(genre),HttpStatus.OK);
        } catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"There is some Problem");
        }
    }
}