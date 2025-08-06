package javas.abstractwithclassandencapsulation.car.test;

import javas.abstractwithclassandencapsulation.car.domain.Car;

import java.util.Scanner;

public class testCar {
    public static void main(String[] args) {
        Car car = new Car();
        Scanner s = new Scanner(System.in);

        int option;

        System.out.println("\"Enter the car\"");

        do {
            System.out.println("=======Options=======");
            System.out.println("1 - Start the car");
            System.out.println("2 - Turn off the car");
            System.out.println("3 - Accelerate");
            System.out.println("4 - Slowdown");
            System.out.println("5 - Left");
            System.out.println("6 - Right");
            System.out.println("7 - Change gears");
            System.out.println("0 - Exit");
            System.out.println("=======Options=======");
            System.out.println();

            option = s.nextInt();

            switch (option){
                case 1 -> System.out.println(car.startTheCar());
                case 2 -> System.out.println(car.turnOffTheCar());
                case 3 -> System.out.println(car.accelerate());
                case 4 -> System.out.println(car.slowDown());
                case 5 -> System.out.println(car.left());
                case 6 -> System.out.println(car.right());
                case 7 -> System.out.println(car.changeGears());
                case 0 -> System.out.println("Exiting the car");
            }
        }while (option != 0);
    }
}
