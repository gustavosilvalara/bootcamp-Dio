package javas.abstractwithclassandencapsulation.petshop.domain;

public record Pet(String name, String type) {
    public Pet(String name, String type) {
        this.name = name;
        this.type = name;
    }
}
