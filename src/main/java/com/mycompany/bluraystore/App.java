package com.mycompany.bluraystore;

import com.mycompany.bluraystore.entity.Movie;
import com.mycompany.bluraystore.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // je récupère les infos liées au film
        String title, genre;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your title : ");
        title = scanner.nextLine();

        System.out.println("Enter a genre : ");
        genre = scanner.nextLine();

        // créer le film
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);

        // j'appelle le service pour enrergistrer le film
        MovieService service = new MovieService();
        service.registerMovie(movie);

    }
}
