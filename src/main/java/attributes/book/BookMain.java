package attributes.book;

public class BookMain {

    public static void main(String[] args) {
        Book konyv = new Book("Pánik");

        konyv.getTitle();
        konyv.setTitle("Pánik2");
        System.out.println(konyv.getTitle());
    }
}
