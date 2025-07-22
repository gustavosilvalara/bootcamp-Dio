package Java.inheritanceandpolymorphism.movieticket.domain;

public class MovieTicket {
    private final Movie movie;
    private final String movieName;
    private double movieValue;
    private final String movieType;

    public MovieTicket(Movie movie) {
        this.movie = movie;
        movieName = movie.getName();
        movieValue = movie.getValue();
        movieType = movie.getType();
    }

    public void movieTicketPrice(){
        System.out.println("The prince of a cinema ticket for the movie " + getMovieName() + " is " + getMovieValue());
    }


    public Movie getMovie() {
        return movie;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getMovieValue() {
        return movieValue;
    }

    protected void setMovieValue(double movieValue){
        this.movieValue = movieValue;
    }

    public String getMovieType() {
        return movieType;
    }
}
