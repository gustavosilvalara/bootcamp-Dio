package java.abstractwithclassandencapsulation.petshop.test;

import java.abstractwithclassandencapsulation.petshop.domain.Pet;
import java.abstractwithclassandencapsulation.petshop.domain.PetShop;

import java.util.Scanner;

public class PetShopTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pet pet;
        PetShop petShop = new PetShop();

        System.out.println("Welcome to the Pet Shop");
        System.out.println("What is the name of the pet?");
        String namePet = s.nextLine();
        System.out.println("What is the type?");
        String typePet = s.nextLine();

        pet = new Pet(namePet, typePet);

        int option;

        do {
            System.out.println("===========Options===========");
            System.out.println("1 - Take a bath in the pet.");
            System.out.println("2 - Supply with water.");
            System.out.println("3 - Supply with shampoo.");
            System.out.println("4 - Checking the water level.");
            System.out.println("5 - Checking the shampoo level.");
            System.out.println("6 - Check if there is an animal in the bath.");
            System.out.println("7 - Put the pet in the machine.");
            System.out.println("8 - Remove the pet from the machine.");
            System.out.println("9 - Clean the machine.");
            System.out.println("0 - Exit.");
            System.out.println("===========Options===========");

            option = s.nextInt();
            switch (option){
                case 1 -> petShop.takeABath();
                case 2 -> petShop.supplyWithWater();
                case 3 -> petShop.supplyWithShampoo();
                case 4 -> petShop.verifyLevelWater();
                case 5 -> petShop.verifyLevelShampoo();
                case 6 -> petShop.checkPetBath();
                case 7 -> petShop.putPetMachine(pet);
                case 8 -> petShop.removePetMachine();
                case 9 -> petShop.cleanTheMachine();
                case 0 -> System.out.println("Exiting");
            }

        }while(option != 0);

        System.out.println("Thank you for using the pet shop");
    }
}
