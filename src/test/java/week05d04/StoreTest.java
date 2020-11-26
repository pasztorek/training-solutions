package week05d04;

import org.junit.jupiter.api.Test;
import week05d03.ListCounter;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @Test
    public void test1(){
        Store store = new Store();
        store.addProduct(new Product("Kifli", 2020,12,31));
        assertEquals(LocalDate.of(2020,12,31), store.products.get(0).getExp());
        assertEquals("Kifli", store.products.get(0).getProduct());
    }
}
