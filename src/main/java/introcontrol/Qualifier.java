package introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {

        Scanner be = new Scanner(System.in);
                int szam = be.nextInt();

                if (szam <= 100) System.out.println("Kisebb vagy egyenlő mint 100");
                        else System.out.println("Nagyobb mint 100");


    }
}
