package collectionsequalshash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookCatalog {

    List<Book> book = new ArrayList<>();


    public Book findBookByTitleAuthor(List<Book> books, String title, String author){
        Book result=null;

        for(Book book: books){
            if(book.equals(new Book(title,author))){
                result = book;
            }
        }
        return result;
    }

    public Book findBook(List<Book> books, Book book){
        Book result=null;

        for(Book findBook: books){
            if(book.equals(findBook)){
                result = book;
            }
        }
        return result;

    }

    public Set<Book> addBooksToSet(Book[] books){
        Set <Book> samebooks = new HashSet<>();
        for(Book bk :books){
            samebooks.add(bk);
        }

        return samebooks;
    }
}
