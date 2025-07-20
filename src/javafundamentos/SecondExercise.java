package javafundamentos;

import java.util.Scanner;

/*
2 - Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na
tela
fórmula: área=lado X lado
 */

public class SecondExercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Write the length of the side of a square: ");
        int side = s.nextInt();

        int zoneSquare = side * side;

        System.out.println("The area of square is " + zoneSquare);
    }
}
