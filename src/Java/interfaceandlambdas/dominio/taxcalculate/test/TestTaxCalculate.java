package Java.interfaceandlambdas.dominio.taxcalculate.test;

import Java.interfaceandlambdas.dominio.taxcalculate.domain.Product;
import Java.interfaceandlambdas.dominio.taxcalculate.domain.Types;

import java.util.Scanner;

public class TestTaxCalculate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner v = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        Product p;
        int option;


        do {
            System.out.println("\"Criação de produtos e verificação de taxas\"");
            p = new Product();
            System.out.println("==================================================");
            System.out.print("Informe o nome: ");
            String name = m.nextLine();
            p.setName(name);

            System.out.print("Informe o valor: ");
            int value = v.nextInt();
            p.setValue(value);

            System.out.println("=====Informe o tipo=====");
            System.out.println("1 - Alimentação");
            System.out.println("2 - Saúde e bem estar");
            System.out.println("3 - Vestuário");
            System.out.println("4 - Cultura");

            int select = s.nextInt();
            switch (select){
                case 1 -> p.setType(Types.ALIMENTO);
                case 2 -> p.setType(Types.SAUDE);
                case 3 -> p.setType(Types.VESTUARIO);
                case 4 -> p.setType(Types.CULTURA);
            }

            System.out.println("====Taxa Aplicada====");
            p.calculateTax();
            System.out.println("=======================================");

            System.out.println("Deseja sair?");
            System.out.println("0 - Sim");
            System.out.println("1 - Não");
            option = s.nextInt();
            System.out.println("==================================================");

        } while (option != 0);

    }
}
