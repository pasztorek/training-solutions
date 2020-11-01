package statements;

import java.util.Scanner;

public class InvestMain {

    public static void main(String[] args) {

        System.out.println("Betét?:");
        Scanner be = new Scanner(System.in);
        int betet = be.nextInt();

        System.out.println("Kamat?:");
        Scanner Kamat = new Scanner(System.in);
        int kamat = Kamat.nextInt();

        System.out.println("Lekötés hossza:");
        Scanner Lekot = new Scanner(System.in);
        int lekot = Lekot.nextInt();

        Investment befekt = new Investment(kamat, betet);


        System.out.println( "Tőke:"+ befekt.getFund());
        System.out.println( "Hozam " + lekot + " napra = " + befekt.getYield(lekot));

        System.out.println("Lezár hányadik napon:");
        Scanner Lezar = new Scanner(System.in);
        int lezar = Lezar.nextInt();

        System.out.println( "Hozam " + lezar + " napra = " + befekt.close(lezar));

        System.out.println("Lezár hányadik napon:");
        Scanner Lezar2 = new Scanner(System.in);
        int lezar2 = Lezar2.nextInt();

        System.out.println( "Hozam " + lezar2 + " napra = " + befekt.close(lezar2));



    }
}
