package Java.controlstructure;

import java.util.Scanner;

public class SecondExercise {
    /*
    2 - Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do
    seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:

    Se for menor ou igual a 18,5 "Abaixo do peso";
    se for entre 18,6 e 24,9 "Peso ideal";
    Se for entre 25,0 e 29,9 "Levemente acima do peso";
    Se for entre 30,0 e 34,9 "Obesidade Grau I";
    Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
    Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your height: ");
        double height = s.nextDouble();

        System.out.print("Enter your weight: ");
        double weight = s.nextDouble();

        System.out.println("Calculating your BMC...");

        double bmc =  weight /(height * height);

        if (bmc <= 18.5){
            System.out.printf("Your BMC: %.2f is underweight", bmc);
        } else if (bmc <= 24.9 ) {
            System.out.printf("Your BMC: %.2f is ideal weight", bmc);
        } else if (bmc <= 29.9) {
            System.out.printf("Your BMC: %.2f is slightly overweight", bmc);
        } else if (bmc <= 34.9) {
            System.out.printf("Your BMC: %.2f is obesity grade I", bmc);
        } else if (bmc <= 39.9) {
            System.out.printf("Your BMC: %.2f is obesity grade II (Severe)", bmc);
        } else {
            System.out.printf("Your BMC: %.2f is obesity grade III (Morbid)", bmc);
        }

    }
}
