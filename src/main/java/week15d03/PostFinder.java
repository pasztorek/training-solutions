package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {

    private List<Post> posts = new ArrayList<>();

    public List<Post> findPostsFor(String user){



       return null;
    }

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    public static void main(String[] args) {
        Post po1 = new Post("Nem tudom", LocalDate.of(2021, 02,8), "Szia", "Gabi");
        Post po2 = new Post("Jól van", LocalDate.of(2021, 02,9), "Hi", "Kati");
        Post po3 = new Post("Nem érdekel", LocalDate.of(2021, 02,10), "Csao", "Réka");
        Post po4 = new Post("Unom", LocalDate.of(2021, 02,11), "Hello", "Tibi");
        Post po5 = new Post("Viszlát", LocalDate.of(2021, 02,12), "Morgen", "Szandi");

    }

}
