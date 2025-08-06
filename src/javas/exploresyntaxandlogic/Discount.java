package javas.exploresyntaxandlogic;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double value = s.nextDouble();

        double discount = s.nextDouble();

        if (discount == 0 || discount >= 100){
            System.out.println("Invalid discount");
        }else{
            double resFinal = value -(value *(discount / 100));
            System.out.format("%.2f", resFinal);
        }
    }
}
