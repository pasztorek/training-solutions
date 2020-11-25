package week05d03;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ListCounterTest {

    @Test
    public void test1() {

            List<String> lista = new ArrayList<>();
            lista.add("adfat");
            lista.add("6dfab");
            lista.add("adfad");
            lista.add("fdfax");
            assertEquals(2, new ListCounter().counter(lista));
        }
    @Test
    public void test2() {

        List<String> lista = new ArrayList<>();
        assertEquals(0, new ListCounter().counter(lista));
    }
    }
