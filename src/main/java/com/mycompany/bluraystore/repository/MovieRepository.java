package com.mycompany.bluraystore.repository;

import com.mycompany.bluraystore.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private static List<Movie> movies = new ArrayList<>();

    public void createMovie(Movie movie) {

        movies.add(movie);
        System.out.println("Movie called : " + movie.getTitle() + " has been added !");

    }
}
