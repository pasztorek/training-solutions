package week06d02;

import java.util.List;

public class Store {

    List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public int getProductByCategoryName(Category category){
        int counter=0;

        for(Product prod: products){
            if(prod.category==category){
                counter++;
            }
        }
        return counter;
    }

}
