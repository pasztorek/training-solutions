package classstructureattributes;
import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        Client kliens = new Client();

        Scanner név = new Scanner(System.in);
        System.out.println("Név:");
        String name = név.nextLine();

        Scanner év = new Scanner(System.in);
        System.out.println("Év:");
        int year = év.nextInt();

        Scanner cím = new Scanner(System.in);
        System.out.println("Cím");
        String address = cím.nextLine();

        System.out.println(name);
        System.out.println(year);
        System.out.println(address);
    }
}
