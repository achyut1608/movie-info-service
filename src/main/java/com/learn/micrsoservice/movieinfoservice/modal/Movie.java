package com.learn.micrsoservice.movieinfoservice.modal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@Entity
public class Movie {

    @Id
    private String movieId;
    private String movieName;
    private String movieDescription;
    private String genre;
    private String releaseYear;



}
