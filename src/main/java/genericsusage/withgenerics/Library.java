package genericsusage.withgenerics;

import java.util.ArrayList;
import java.util.List;

public class Library {


        public Book getFirstBook(List<Book> book){
            if(book == null){
                throw new NullPointerException();
            }

            if(book.isEmpty()){

                throw new IllegalArgumentException("Argument should not be empty!");
            }

            return book.get(0);
}

}


