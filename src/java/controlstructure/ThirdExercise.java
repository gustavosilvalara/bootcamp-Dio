package java.controlstructure;

import java.util.Scanner;

public class ThirdExercise {

    /*
    3 - Escreva um código que o usuário entre com um primeiro número, um segundo número maior que
    o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os
    números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados,
    incluindo os números informados e em ordem decrescente;
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner c = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = s.nextInt();

        System.out.print("Enter the second number, greater than the first: ");
        int secondNumber = s.nextInt();

        System.out.print("What sequence? \npair or odd: ");
        String parOrOdd = c.nextLine();

        if (parOrOdd.equalsIgnoreCase("pair")){
            System.out.println("Sequence in pair");
            for (int i = secondNumber; i >= firstNumber ; i--) {
                System.out.print(i + " ");
            }
        }else if (parOrOdd.equalsIgnoreCase("odd")){
            System.out.println("Sequence in odd");
            for (int i = secondNumber; i >= firstNumber ; i--) {
                System.out.print(i + " ");
            }
        }else{
            System.out.println("Error: write again");
        }
    }
}
