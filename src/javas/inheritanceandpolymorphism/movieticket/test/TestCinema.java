package javas.inheritanceandpolymorphism.movieticket.test;

import javas.inheritanceandpolymorphism.movieticket.domain.FamilyMovieTicket;
import javas.inheritanceandpolymorphism.movieticket.domain.HalfMovieTicket;
import javas.inheritanceandpolymorphism.movieticket.domain.Movie;
import javas.inheritanceandpolymorphism.movieticket.domain.MovieTicket;

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
