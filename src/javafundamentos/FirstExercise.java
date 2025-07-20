package javafundamentos;

import java.time.LocalDateTime;
import java.util.Scanner;


/*
1 - Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a
seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
*/

public class FirstExercise {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        Scanner s = new Scanner(System.in);

        System.out.print("Write your name: ");
        String name = s.nextLine();

        System.out.print("Write your year of birth: ");
        int yearOfBirth = s.nextInt();

        int age = Math.abs(dateTime.getYear() - yearOfBirth);

        System.out.println("Hello, " + name + ", your are " + age + " years" );
    }
}
