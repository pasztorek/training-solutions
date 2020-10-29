package classsctructureconstructors;

public class Book {

    private String author;
    private String title;
    private int regNumber;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void register(int regNumber){
        this.regNumber = regNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getRegNumber() {
        return regNumber;
    }
}
