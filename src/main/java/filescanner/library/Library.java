package filescanner.library;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    List<Book> books = new ArrayList<>();

    public void loadFromFile() {
        try (Scanner scanner = new Scanner(Library.class.getResourceAsStream("/books.csv"))) {
            scanner.useDelimiter(";|(\r\n)|\n");
            while (scanner.hasNextLine()) {
                  String regNum = scanner.next();
                  String author = scanner.next();
                  String title = scanner.next();
                  int yearOfPublish = scanner.nextInt();
                  books.add(new Book(regNum,author,title,yearOfPublish));
            }

        }
    }
    public List<Book> getBooks() {
        return books;
    }
}
