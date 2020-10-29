package classsctructureconstructors;

public class BookMain {
    public static void main(String[] args) {

        Book konyv = new Book("Verne", "80 nap");

        konyv.register(1234);

        System.out.println(konyv.getAuthor() + konyv.getTitle() + konyv.getRegNumber());
    }

}
