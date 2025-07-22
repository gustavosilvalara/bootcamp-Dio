package Java.inheritanceandpolymorphism.movieticket.domain;

public class Movie {
    private final String name;
    private final double value;
    private final String type;

    public Movie(String name, double value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

}
