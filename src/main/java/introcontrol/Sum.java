package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

            int menu =0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Kérek egy számot");

            Scanner be = new Scanner(System.in);
            menu = be.nextInt() + menu;

        }
        System.out.println(menu);
    }
}
