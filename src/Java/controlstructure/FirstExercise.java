package Java.controlstructure;

import java.util.Scanner;

public class FirstExercise {

    /*
    1 - Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10
    desse número
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = s.nextInt();

        System.out.println("The multiplication table of " + number + " is: ");

        for (int i = 1; i <= 10; i++) {
            int multiplicationTable = number * i;
            System.out.println(number + " x " + i + " = " + multiplicationTable);
        }
    }
}
