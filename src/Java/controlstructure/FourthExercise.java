package Java.controlstructure;

import java.util.Scanner;

public class FourthExercise {
    /*
     4 - Escreva um código onde o usuário informa um número inicial, posteriormente irá informar
    outros N números, a execução do código irá continuar até que o número informado dividido
    pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro
    número devem ser ignorados
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the starter number: ");
        int firstNumber = s.nextInt();

        int secondsNumbers;

        System.out.printf("Enter the number, that divided by %s the remainder is 0\n", firstNumber);

        do {
            secondsNumbers = s.nextInt();
            System.out.println(secondsNumbers);
            System.out.println(firstNumber % secondsNumbers == 0? "Good" : "Fail, repeat");
        }while (!(firstNumber % secondsNumbers == 0));
    }
}
