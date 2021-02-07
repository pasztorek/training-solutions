package collectionscomp;

public class Book implements Comparable<Book>{

    private int RegNumber;
    private String title;
    private String Author;

    public Book(int regNumber, String title, String author) {
        RegNumber = regNumber;
        this.title = title;
        Author = author;
    }

    public int getRegNumber() {
        return RegNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }


    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
}
