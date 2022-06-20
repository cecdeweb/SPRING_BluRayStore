package com.mycompany.bluraystore.service;

import com.mycompany.bluraystore.entity.Movie;
import com.mycompany.bluraystore.repository.MovieRepository;

public class MovieService {

    private MovieRepository repository = new MovieRepository();

    public void registerMovie(Movie movie){

        repository.createMovie(movie);

    }

}
