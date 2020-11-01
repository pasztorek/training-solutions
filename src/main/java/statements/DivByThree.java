package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {

        System.out.println("Szám:");
        Scanner h1 = new Scanner(System.in);
        int szam = h1.nextInt();

        boolean harommal = szam % 3 == 0;
        System.out.println(harommal);
    }
}
