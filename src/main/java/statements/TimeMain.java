package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {

        System.out.println("Első időpont / Óra");
        Scanner h1 = new Scanner(System.in);
        int ora1 = h1.nextInt();

        System.out.println("Első időpont / Perc");
        Scanner p1 = new Scanner(System.in);
        int perc1 = p1.nextInt();

        System.out.println("Első időpont / Másodperc");
        Scanner m1 = new Scanner(System.in);
        int masodp1 = m1.nextInt();

        Time ido1 = new Time(ora1, perc1, masodp1);

        System.out.println("Második időpont / Óra");
        Scanner h2 = new Scanner(System.in);
        int ora2 = h2.nextInt();

        System.out.println("Második időpont / Perc");
        Scanner p2 = new Scanner(System.in);
        int perc2 = p2.nextInt();

        System.out.println("Második időpont / Másodperc");
        Scanner m2 = new Scanner(System.in);
        int masodp2 = m2.nextInt();

        Time ido2 = new Time(ora2, perc2, masodp2);

        System.out.println("Első időpont: " + ido1.toString() + " "+ ido1.getInSeconds());
        System.out.println("Második időpont: " + ido2.toString() + " " + ido2.getInMinutes());

        System.out.println("Első korabbi mint a második: " + ido1.earlierThan(ido2));



    }
}
