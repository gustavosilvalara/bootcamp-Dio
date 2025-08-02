package java.collections.equals;

public class Test {
    public static void main(String[] args) {
        User user = new User(1, "Jão");
        User user2 = new User(2, "Maria");
        User user3 = new User(1, "Jão");

        System.out.println(user.equals(user2));
        System.out.println(user.equals(user3));

        System.out.println(user);
        System.out.println(user2);
        System.out.println(user3);
    }
}
