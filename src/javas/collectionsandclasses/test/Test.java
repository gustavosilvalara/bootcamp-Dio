package javas.collectionsandclasses.test;

import javas.collectionsandclasses.domain.Calculadora;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        Calculadora c = new Calculadora();
        int option;

        do {
            System.out.println("========Calcular========");
            System.out.println("Informe os números separando por virgula");
            System.out.print("Digite aqui: ");
            List<Integer> numbers = Arrays.stream(s.nextLine().split(","))
                                    .map(Integer::parseInt)
                                    .toList();
            System.out.println("Calculando...");
            System.out.println("Resultado: " + c.calcular(numbers)) ;

            System.out.println("Deseja calcular novamente?");
            System.out.println("0 - Sim");
            System.out.println("1 - Não");

            option = m.nextInt();
        }while (option != 1);
    }
}
