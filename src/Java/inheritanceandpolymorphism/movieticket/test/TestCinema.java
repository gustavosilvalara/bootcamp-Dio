package Java.inheritanceandpolymorphism.movieticket.test;

import Java.inheritanceandpolymorphism.movieticket.domain.FamilyMovieTicket;
import Java.inheritanceandpolymorphism.movieticket.domain.HalfMovieTicket;
import Java.inheritanceandpolymorphism.movieticket.domain.Movie;
import Java.inheritanceandpolymorphism.movieticket.domain.MovieTicket;

public class TestCinema {
    public static void main(String[] args) {
        Movie movie = new Movie("SuperMan", 60, "dubbed");

        MovieTicket movieTicket = new MovieTicket(movie);
        movieTicket.movieTicketPrice();

        HalfMovieTicket halfMovieTicket = new HalfMovieTicket(movie);
        halfMovieTicket.movieTicketPrice();

        FamilyMovieTicket familyMovieTicket = new FamilyMovieTicket(movie, 4);
        familyMovieTicket.movieTicketPrice();
    }
}
