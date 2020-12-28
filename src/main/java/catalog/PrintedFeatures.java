package catalog;

import java.util.List;

public class PrintedFeatures implements Feature{

    private String title;
    private int numberOfPages;
    private List<String> authors;


    @Override
    public List<String> getContributors() {
        return authors;
    }

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        }
        this.title = title;
        if(numberOfPages<1){
            throw new IllegalArgumentException();
        }
        this.numberOfPages = numberOfPages;

        if(Validators.isEmpty(authors)){
            throw new IllegalArgumentException();
        }
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
