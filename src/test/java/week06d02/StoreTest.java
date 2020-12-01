package week06d02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {


    @Test
    public void test1(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("kifli", Category.BAKEDGOODS, 70));
        products.add(new Product("zsemle", Category.BAKEDGOODS, 50));
        products.add(new Product("kakóscsiga", Category.BAKEDGOODS, 100));
        products.add(new Product("ceruzaelem", Category.OTHER, 350));
        assertEquals(3, new Store(products).getProductByCategoryName(Category.BAKEDGOODS));

    }
    @Test
    public void test2(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("kifli", Category.BAKEDGOODS, 70));
        products.add(new Product("zsemle", Category.BAKEDGOODS, 50));
        products.add(new Product("kakóscsiga", Category.BAKEDGOODS, 100));
        products.add(new Product("ceruzaelem", Category.OTHER, 350));
        assertEquals(1, new Store(products).getProductByCategoryName(Category.OTHER));

    }

}
