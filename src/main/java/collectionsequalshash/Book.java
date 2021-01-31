package collectionsequalshash;

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
}
