package classsctructureconstructors;
import java.util.Scanner;

public class StoreMain {

    public static void main(String[] args) {


        Store raki = new Store("kifli");

        Scanner scannerA = new Scanner(System.in);
        System.out.println("Bevételezett mennyiség");
        raki.store(scannerA.nextInt());

        System.out.println(raki.getStock());

        Scanner scannerB = new Scanner(System.in);
        System.out.println("Kiszállított mennyiség");
        raki.dispatch(scannerB.nextInt());

        System.out.println(raki.getStock());
    }
}
