package catalog;

import java.util.List;

public class AudioFeatures implements Feature{

    private String title;
    private int length;
    private List<String> performers;
    private List<String> composer;

    @Override
    public List<String> getContributors() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    public int getLength() {
        return length;
    }

    public AudioFeatures(String title, int lenght, List<String> performers, List<String> composer) {
        this.title = title;
        this.length = lenght;
        this.performers = performers;
        this.composer = composer;
    }

    public AudioFeatures(String title, int lenght, List<String> performers) {
        this.title = title;
        this.length = lenght;
        this.performers = performers;
    }
}
