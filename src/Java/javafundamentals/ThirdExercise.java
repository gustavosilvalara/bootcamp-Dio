package Java.javafundamentals;

import java.util.Scanner;

/*
3 - Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na
tela

fórmula: área=base X altura
 */

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Report what the base of the rectangle is: ");
        int baseRectangle = s.nextInt();

        System.out.print("Report the height of the rectangle: ");
        int heightRectangle = s.nextInt();

        int areaRectangle = baseRectangle * heightRectangle;

        System.out.println("The area of the rectangle is " + areaRectangle);
    }
}
