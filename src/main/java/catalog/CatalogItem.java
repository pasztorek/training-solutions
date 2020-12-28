package catalog;

import week08d03.StringLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {

    private String registrationNumber;
    private int price;
    private List<Feature> features = new ArrayList<>();

    public int numberOfPagesAtOneItem(){
        int result=0;
        for(Feature feature: features){
            if(feature instanceof PrintedFeatures){
             result = result+((PrintedFeatures) feature).getNumberOfPages();
            }
        }

        return result;
    }

    public int fullLengthAtOneItem(){
        int result=0;
        for(Feature feature: features){
            if(feature instanceof AudioFeatures){
                result = result+((AudioFeatures) feature).getLength();
            }
        }

        return result;

    }

    public List<String> getContributors(){
        List<String> result= new ArrayList<>();

            for(Feature feature: features){
                result.addAll(feature.getContributors());
            }
        return result;
    }

    public List<String> getTitles(){
        List<String> result= new ArrayList<>();

        for(Feature feature: features){
            result.add(feature.getTitle());
        }
        return result;

    }

    public boolean hasAudioFeature(){
        for(Feature feature:features){
            if(feature instanceof AudioFeatures){
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature(){
        for(Feature feature:features){
            if(feature instanceof PrintedFeatures){
                return true;
            }
        }
        return false;
    }







    public CatalogItem(String registrationNumber, int price, Feature... feature) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.features = Arrays.asList(feature);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getPrice() {
        return price;
    }

    public List<Feature> getFeatures() {
        return features;
    }
}
