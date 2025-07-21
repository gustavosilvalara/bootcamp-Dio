package Java.abstractwithclassandencapsulation.bank.test;

import Java.abstractwithclassandencapsulation.bank.domain.BankAccount;

import java.util.Scanner;

public class TestCreateBank {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        double firstDeposit;

        int option;

        System.out.print("Helo, welcome to G9\n");
        System.out.print("Enter your name, to created your account: ");
        name = s.nextLine();

        System.out.print("Enter your first deposit: ");
        firstDeposit = s.nextDouble();

        BankAccount bank = new BankAccount(name, firstDeposit);


        do {

            System.out.println("==================================================");
            System.out.println("Write 1 to verify the statement of account.");
            System.out.println("Write 2 to verify the statement of the special check.");
            System.out.println("Write 3 to deposit money.");
            System.out.println("Write 4 to withdraw money.");
            System.out.println("Write 5 to pay the bill.");
            System.out.println("Write 6 to verify the limit of the special check.");
            System.out.println("Write 0 to exit");
            System.out.println("==================================================\n");

            option = s.nextInt();
            if (option == 1) System.out.println(bank.statementBalance());
            if (option == 2) System.out.println(bank.statementEspecialCheck());
            if (option == 3) {
                System.out.print("Enter the amount to deposit: ");
                double deposit = s.nextDouble();
                System.out.println(bank.depositMoney(deposit));
            }
            if (option == 4){
                System.out.print("Enter the amount to be withdraw: ");
                double withDraw = s.nextDouble();
                System.out.println(bank.withdrawMoney(withDraw));
            }
            if (option == 5){
                System.out.print("Enter the amount to be paid for the bill: ");
                double payBill = s.nextDouble();
                System.out.println(bank.payBill(payBill));
            }
            if (option == 6) System.out.println(bank.checkingSpecialCheck());

            System.out.println();

        }while (option != 0);

        System.out.println("Thank you for your preference");
    }
}
