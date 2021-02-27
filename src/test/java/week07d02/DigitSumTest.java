package week07d02;

import org.junit.jupiter.api.Test;
import week07d01.MathAlgorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitSumTest {

    @Test
    public void test1(){
        DigitSum ds = new DigitSum();
        assertEquals(24, ds.sumOfDigits(33333333));

    }
}
