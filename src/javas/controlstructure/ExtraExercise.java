package javas.controlstructure;

import java.util.Random;
import java.util.Scanner;

public class ExtraExercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Random random = new Random();
        int resRandom = random.nextInt(100);

        System.out.printf("Enter the number, that divided %s the remainder is 0 \n", resRandom);
        int attempt;
        do {
            attempt = s.nextInt();
            System.out.println(resRandom % attempt == 0? "Good" : "Fail, repeat");
        }while (!(resRandom % attempt == 0));
    }
}
