package javas.exploresyntaxandlogic;

import java.util.Scanner;

public class Freight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double weight = s.nextDouble();

        double freight = s.nextDouble();

        double resFreight =  weight * freight;

        System.out.format("%.2f",resFreight);
    }
}
