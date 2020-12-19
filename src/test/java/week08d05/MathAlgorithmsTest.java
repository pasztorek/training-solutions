package week08d05;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathAlgorithmsTest {

    @Test

    public void test1(){
        assertEquals(5, MathAlgorithms.greatestCommonDivisor(10,5));
    }
}
