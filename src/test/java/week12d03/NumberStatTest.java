package week12d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;


public class NumberStatTest {

    @Test

    public void test1(){
        NumberStat ns = new NumberStat();
        assertEquals(4, ns.getNumber(Arrays.asList(3,5,4,3,2,3,6,5,2)));
    }
}
