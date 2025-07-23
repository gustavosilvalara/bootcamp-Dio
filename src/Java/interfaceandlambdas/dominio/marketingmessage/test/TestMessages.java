package Java.interfaceandlambdas.dominio.marketingmessage.test;

import Java.interfaceandlambdas.dominio.marketingmessage.domain.Email;
import Java.interfaceandlambdas.dominio.marketingmessage.domain.Sms;
import Java.interfaceandlambdas.dominio.marketingmessage.domain.SocialNetwork;
import Java.interfaceandlambdas.dominio.marketingmessage.domain.Whatsapp;

import java.util.Scanner;

public class TestMessages {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int option;

        System.out.println("\"Criar mensagem\"\n");
        System.out.println("===========================");
        System.out.print("Escreva sua mensagem:");
        String message = s.nextLine();
        System.out.println();


        do {
            System.out.println("=======Informe a forma de envio=======");
            System.out.println("1 - Sms");
            System.out.println("2 - Email");
            System.out.println("3 - Rede social");
            System.out.println("4 - Whatsapp");
            System.out.println("0 - Exit");
            System.out.println("=======Informe a forma de envio=======");
            System.out.println();

            option = s.nextInt();
            Scanner m = new Scanner(System.in);
            switch (option) {
                case 1 -> {
                    System.out.println("Informe o numero que sera enviado a mensagem");
                    String number = m.nextLine();
                    Sms sms = new Sms();
                    sms.invite(number, message);
                }
                case 2 -> {
                    System.out.println("Informe o email que sera enviado a mensagem");
                    String email2 = m.nextLine();
                    Email email = new Email();
                    email.invite(email2, message);
                }
                case 3 -> {
                    System.out.println("Informe o user que sera enviado a mensagem");
                    String user = m.nextLine();
                    SocialNetwork socialNetwork = new SocialNetwork();
                    socialNetwork.invite(user, message);
                }
                case 4 -> {
                    System.out.println("Informe o numero que sera enviado a mensagem");
                    String number = m.nextLine();
                    Whatsapp whatsapp = new Whatsapp();
                    whatsapp.invite(number, message);
                }
                case 0 -> System.out.println("Saindo da criação de mensagem");
            }
        } while (option != 0);
    }
}
