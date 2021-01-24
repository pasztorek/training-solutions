package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Product termek = new Product("kifli", 30);

        System.out.println("Áremelés:");
        Scanner a = new Scanner(System.in);
        termek.increasePrice(a.nextInt());

        System.out.println("Árcsökkentés:");
        Scanner b = new Scanner(System.in);
        termek.decreasePrice(b.nextInt());

        System.out.println(termek.getPrice());
    }
}
