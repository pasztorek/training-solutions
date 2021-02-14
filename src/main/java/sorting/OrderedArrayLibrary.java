package sorting;

import java.util.Arrays;

public class OrderedArrayLibrary {

    private Book[] bookArray;

    public OrderedArrayLibrary(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book[] sortingById(){
        Arrays.sort(bookArray);

        return bookArray;
    }


    public Book[] sortingByTitle(){
        Comp co = new Comp(bookArray);


        return bookArray;
    }



    class Comp implements Comparable<Book> {
        private Book[] bookArray;

        public Comp(Book[] bookArray) {
            this.bookArray = bookArray;
        }


        @Override
        public int compareTo(Book o) {
            return 0;
        }
    }
}

