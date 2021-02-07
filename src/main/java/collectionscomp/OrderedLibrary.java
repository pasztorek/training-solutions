package collectionscomp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class OrderedLibrary {

    private List<Book> books = new ArrayList<>();

    public OrderedLibrary(List<Book> books) {
        this.books = books;
    }


    public List<Book> orderedByTitle(){
        List<Book> ordered = new ArrayList<>(books);
        Collections.sort(ordered);
        return ordered;
    }

    public List<Book> orderedByAuthor(){
        List<Book> ordered = new ArrayList<>(books);
        Collections.sort(ordered, new AuthorComparator());

        return ordered;
    }

    public List<String> orderedByTitleLocale(Locale locl){

        return null;
    }

}
