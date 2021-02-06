package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionManager {

    private List<Book> library = new ArrayList<>();

    public CollectionManager(List<Book> library) {
        this.library = library;
    }

    public List<Book> getLibrary() {
        return library;
    }

    public List<Book> createUnmodifiableLibrary(){

        return Collections.unmodifiableList(library);

    }

    public List<Book> reverseLibrary(){
        Collections.reverse(library);
        return library;
    }

    public Book getFirstBook(){

        return library.get(0);
    }

    public Book getLastBook(){

        return library.get(library.size()-1);
    }

}
