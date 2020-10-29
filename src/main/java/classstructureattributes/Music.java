package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {

        Song zeneszam = new Song();

        Scanner eloado = new Scanner(System.in);
        System.out.println("Előadó:");
        String band = eloado.nextLine();

        Scanner cim = new Scanner(System.in);
        System.out.println("Cím:");
        String title = cim.nextLine();

        Scanner hossz = new Scanner(System.in);
        System.out.println("Hossz:");
        int lenght = hossz.nextInt();



        System.out.println(band + "-" + title + "-" + lenght + "perc");

    }
}
