package meetingrooms;

import java.util.Scanner;

public class InputName {



    public static void main(String[] args) {

        String nevek[] = new String[5];
        InputName nevsor = new InputName();

        for (int i=0; i<5; i++) {
            System.out.println("nevet kérek:");
            Scanner nevbe = new Scanner(System.in);
            nevek[i] = nevbe.nextLine();
        }
        for (int i=0; i<5; i++) {
            System.out.println(i + ". elem " + nevek[i]);
        }


    }
}
