package week05d04;

import java.util.ArrayList;
import java.util.List;

public class Store {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }
}
