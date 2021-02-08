package searching;

import java.util.Arrays;

public class BookArraySearch {

    private Book[] bookArray;

    public BookArraySearch(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book findBookByAuthorTitle(String author, String title) {

        if (title == null || title.isEmpty() || author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Author or title must not be empty!");
        }
        for (Book book : bookArray) {
            if (book.getAuthor().equals(author) || book.getTitle().equals(title)) {
                return book;
            }
        }
        throw new IllegalArgumentException("No book found by " + title + " with title " + author);
    }
}
