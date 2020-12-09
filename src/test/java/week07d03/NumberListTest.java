package week07d03;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberListTest {

    @Test

    public void test1(){

        NumberList nl = new NumberList();
        assertEquals(true, nl.isIncreasing(Arrays.asList(1,2,3,4,5)));
        assertEquals(true, nl.isIncreasing(Arrays.asList(1,2,3,3,5)));
        assertEquals(false, nl.isIncreasing(Arrays.asList(1,2,3,4,3)));
        assertEquals(false, nl.isIncreasing(Arrays.asList(1,2,1,4,5)));

    }


}
