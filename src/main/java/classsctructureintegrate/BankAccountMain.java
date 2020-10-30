package classsctructureintegrate;

import java.util.Scanner;

public class BankAccountMain {

    public static void main(String[] args) {

        System.out.println("Első bankszámla tulajdonosa:");
        Scanner account1Owner = new Scanner(System.in);
        String Owner1 = account1Owner.nextLine();


        System.out.println("Első bankszámla szama:");
        Scanner account1Number = new Scanner(System.in);
        String Number1 = account1Number.nextLine();

        System.out.println("Első bankszámla egyenlege:");
        Scanner account1balance = new Scanner(System.in);
        int Balance1 = account1balance.nextInt();

        BankAccount szamla1 = new BankAccount(Owner1, Number1, Balance1);

        System.out.println("Második bankszámla tulajdonosa:");
        Scanner account2Owner = new Scanner(System.in);
        String Owner2 = account2Owner.nextLine();

        System.out.println("Második bankszámla szama:");
        Scanner account2Number = new Scanner(System.in);
        String Number2 = account2Number.nextLine();

        System.out.println("Második bankszámla egyenlege:");
        Scanner account2balance = new Scanner(System.in);
        int Balance2 = account2balance.nextInt();

        BankAccount szamla2 = new BankAccount(Owner2, Number2, Balance2);

        System.out.println("Mennyit utalunk az első számláról a másodikra?");
        Scanner utal = new Scanner(System.in);
        int Utal = utal.nextInt();

        szamla1.transfer(szamla2, Utal);


        System.out.println(szamla1.getInfo());
        System.out.println(szamla2.getInfo());
    }
}
