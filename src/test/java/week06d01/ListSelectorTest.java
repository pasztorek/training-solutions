package week06d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListSelectorTest {

    @Test
    public void test1(){
        List<String> words =  Arrays.asList("alma","körte","szilva","narancs");
        ListSelector select = new ListSelector();
        assertEquals("[körtenarancs]", select.selector(words));
    }

    @Test
    public void test2()
            throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new ListSelector().selector(null));
        assertEquals("Nincs lista!", ex.getMessage());
    }

    @Test
    public void test3(){
        List<String> words =  Arrays.asList();
        ListSelector select = new ListSelector();
        assertEquals("", select.selector(words));
    }
}
