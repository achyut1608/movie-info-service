package com.learn.micrsoservice.movieinfoservice.repositories;

import com.learn.micrsoservice.movieinfoservice.modal.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends JpaRepository<Movie,String> {

    public List<Movie> findByGenre(String genre);
}
