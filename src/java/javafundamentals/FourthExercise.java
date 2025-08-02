package java.javafundamentals;

import java.util.Scanner;

/*
4 - Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade
entre elas
 */

public class FourthExercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("tell me your mother's age: ");
        int motherAge = s.nextInt();

        System.out.print("tell me your age: ");
        int yourAge = s.nextInt();

        int difference = Math.abs(motherAge - yourAge);

        System.out.println("The difference between your mother and you is: " + difference);
    }
}
