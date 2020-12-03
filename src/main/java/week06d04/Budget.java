package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private List<Item> items = new ArrayList<>();
    private Item item;

    public Budget(Item... item) {
        if(item==null || item.length==0){
            throw new IllegalArgumentException("Nem volt vásárlás");
        }

        for (Item it: item){
            items.add(it);
        }
    }

    public List<Item> getItemsByMonth(int month){
        List<Item> result = new ArrayList<>();
        for (Item it: items){
            if(it.getMonth()==month){
                result.add(it);
            }
        }
        return result;
    }

    public static void main(String[] args) {
      Budget bt=  new Budget( new Item(100,1,"alma"),
                    new Item(200,1,"körte"),
                    new Item(220,1,"barack"),
                    new Item(300,2,"szilva"),
                    new Item(250, 2, "narancs"));

        System.out.println(bt.getItemsByMonth(1).toString());

    }

}
