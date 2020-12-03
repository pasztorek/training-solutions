package week06d04;

import org.junit.Test;
import week06d03.WordEraser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BudgetTest {


    @Test
    public void test1(){
        Budget bt=  new Budget( new Item(100,1,"alma"),
                new Item(200,1,"körte"),
                new Item(220,2,"barack"),
                new Item(300,2,"szilva"),
                new Item(250, 2, "narancs"));

        assertEquals("[barack/2, szilva/2, narancs/2]",bt.getItemsByMonth(2).toString());
    }

    @Test
    public void test2() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Budget());
        assertEquals("Nem volt vásárlás", ex.getMessage());

    }
}
