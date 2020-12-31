package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    List<CatalogItem> catalogItems = new ArrayList<>();


    public void addItem(CatalogItem catalogItem){

        catalogItems.add(catalogItem);
    }

    public void deleteItemByRegistrationNumber(String item){
        for(CatalogItem catitem:catalogItems){
            if (catitem.getRegistrationNumber().toString().equals(item)){
                catalogItems.remove(catitem);
                return;
            }

        }

    }

    public List<CatalogItem> getAudioLibraryItems(){
        List<CatalogItem> result = new ArrayList<>();
        for(CatalogItem catitem: catalogItems){
            if(catitem.hasAudioFeature()){
                result.add(catitem);
            }
        }

        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems(){
        List<CatalogItem> result = new ArrayList<>();
        for(CatalogItem catitem: catalogItems){
            if(catitem.hasPrintedFeature()){
                result.add(catitem);
            }
        }

        return result;
    }

    public int getAllPageNumber() {
        int result = 0;
        for (CatalogItem catitem : catalogItems) {
            if (catitem.hasPrintedFeature()) {
                result = result + catitem.numberOfPagesAtOneItem();
            }
        }
        return result;
    }

    public int getFullLength(){
        int result = 0;
        for (CatalogItem catitem : catalogItems) {
            if (catitem.hasAudioFeature()) {
                result = result + catitem.fullLengthAtOneItem();
            }
        }
        return result;
    }

    public double averagePageNumberOver(int pages){
        int sumPages=0;
        int counter=0;

        if(pages<1){
            throw new IllegalArgumentException("Page number must be positive");
        }

        for (CatalogItem catitem : catalogItems) {
            if (catitem.hasPrintedFeature() && catitem.numberOfPagesAtOneItem()>pages) {
                sumPages = sumPages + catitem.numberOfPagesAtOneItem();
                counter++;
            }
        }
        if(counter==0){
            throw new IllegalArgumentException("No page");
        }

        return (double)sumPages/counter;
    }

    public List<CatalogItem> findByCriteria(SearchCriteria criteria){

        return null;
    }
}
