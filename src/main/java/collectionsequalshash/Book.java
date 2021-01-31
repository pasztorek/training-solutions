package collectionsequalshash;

import java.util.Objects;

public class Book {

    private String RegNumber;
    private String title;
    private String Author;

    public Book(String RegNumber, String title, String author) {
        this.RegNumber = RegNumber;
        this.title = title;
        Author = author;
    }

    public Book(String title, String author) {
        this.title = title;
        Author = author;
    }

    public String getRegNumber() {
        return RegNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) &&
                Author.equals(book.Author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, Author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "regNumber='" + RegNumber + '\'' +
                ", title='" + title + '\'' +
                ", author='" + Author + '\'' +
                '}';
    }
}
