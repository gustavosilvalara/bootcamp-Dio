package Java.inheritanceandpolymorphism.movieticket.domain;

public class HalfMovieTicket extends MovieTicket {

    public HalfMovieTicket(Movie movie) {
        super(movie);
    }

    @Override
    public void movieTicketPrice(){
        setMovieValue(getMovieValue() / 2);
        System.out.println("The prince of a cinema ticket for the movie " + getMovieName() + " is " + getMovieValue());
    }
}
