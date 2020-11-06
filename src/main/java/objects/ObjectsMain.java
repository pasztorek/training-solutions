package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {



    public static void main(String[] args) {


        Books konyv = new Books();
        System.out.println(konyv);
        Books kotet = null;
        System.out.println(kotet);

        Books book = konyv;
        System.out.println(book);
        book = null;
        System.out.println(book);
        book = konyv;
        System.out.println(book);

        Books konyvuj = new Books();
        Books anotherBook = konyvuj;
        System.out.println(anotherBook);
        System.out.println(konyvuj);
        System.out.println(anotherBook == konyvuj);
        System.out.println(book instanceof Books);


        Books book1 = new Books();
        Books book2 = new Books();
        Books book3 = new Books();
        Books book4 = book1;
        Books book5 = book1;
        Books book6 = book3;
        Books book7 = null;
        book4 = book5;
        book5 = new Books();
        book6 = null;

        Books tomb[] = {book1,book2,book3};
        List<Books> konyvek = Arrays.asList(book1, book2, book3);
        List<Books> konyvek2 = new ArrayList<>();
        konyvek2.add(book4);
        konyvek2.add(book5);
        konyvek2.add(book6);

        konyvek2.add(book1);
        System.out.println(konyvek2);


    }
}
