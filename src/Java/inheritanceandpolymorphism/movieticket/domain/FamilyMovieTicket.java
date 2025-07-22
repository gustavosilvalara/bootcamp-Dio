package Java.inheritanceandpolymorphism.movieticket.domain;

public class FamilyMovieTicket extends MovieTicket {
    public FamilyMovieTicket(Movie movie, int personInFamily) {
        super(movie);
        this.personInFamily = personInFamily;
   }
   private final int personInFamily;

   @Override
    public void movieTicketPrice(){
        setMovieValue(getMovieValue() * getPersonInFamily());
        if (getPersonInFamily() > 3){
            setMovieValue(getMovieValue() - (getMovieValue() * 0.05));
            System.out.println("The prince of a cinema ticket for the movie " + getMovieName() + " is " + getMovieValue());
        }else {
            System.out.println("The prince of a cinema ticket for the movie " + getMovieName() + " is " + getMovieValue());
        }
    }

    public int getPersonInFamily() {
        return personInFamily;
    }
}
