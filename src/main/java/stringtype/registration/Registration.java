package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {



        System.out.println("Kérem a felhasználónevet;");
        Scanner Name1 = new Scanner(System.in);
        String name1 = Name1.nextLine();

        UserValidator elson = new UserValidator();

        System.out.println(elson.isValidUesrname(name1)? "OK" : "Túl rövid");


        System.out.println("Kérem a felhasználónevet mégegyszer;");
        Scanner Name2 = new Scanner(System.in);
        String name2 = Name1.nextLine();

        UserValidator masodikn = new UserValidator();
        System.out.println(elson.isValidUesrname(name2)? "OK" : "Túl rövid");

        System.out.println(name1.equals(name2) ? "OK": "Nem egyezik a két név!");


        System.out.println("Kérem a jelszót;");
        Scanner Pwd1 = new Scanner(System.in);
        String pwd1 = Pwd1.nextLine();

        UserValidator elsop = new UserValidator();

        System.out.println(elsop.isValidPassword(pwd1)? "OK" : "Túl rövid");


        System.out.println("Kérem a jelszót mégegyszer;");
        Scanner Pwd2 = new Scanner(System.in);
        String pwd2 = Pwd2.nextLine();

        UserValidator masodikp = new UserValidator();
        System.out.println(masodikp.isValidUesrname(pwd2)? "OK" : "Túl rövid");

        System.out.println(pwd1.equals(pwd2) ? "OK" : "Nem egyezik a két jelszó!");

        System.out.println("Kérem az emailt;");
        Scanner Email = new Scanner(System.in);
        String  email = Email.nextLine();

        UserValidator email1 = new UserValidator();
        System.out.println(email1.isValidUesrname(email)? "OK" : "Nem felel meg");

    }
}
