package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {

    private List<Post> posts = new ArrayList<>();

    public List<Post> findPostsFor(String user){

        for(Post post: posts){
            if(!(post.getTitle().isEmpty() || post.getContent().isEmpty())){

            }

        }



       return null;
    }

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    public static void main(String[] args) {

        List<Post> mails = new ArrayList<>();

        mails.add(new Post("Nem tudom", LocalDate.of(2021, 02,8), "Szia", "Gabi"));
        mails.add(new Post("Jól van", LocalDate.of(2021, 02,9), "Hi", "Kati"));
        mails.add(new Post("Nem érdekel", LocalDate.of(2021, 02,10), "Csao", "Réka"));
        mails.add(new Post("Unom", LocalDate.of(2021, 02,11), "Hello", "Tibi"));
        mails.add(new Post("Viszlát", LocalDate.of(2021, 02,12), "Morgen", "Szandi"));
        mails.add(new Post("", LocalDate.of(2021, 02,12), "Morgen", "Szandi"));

        PostFinder pf = new PostFinder(mails);
    }

}
