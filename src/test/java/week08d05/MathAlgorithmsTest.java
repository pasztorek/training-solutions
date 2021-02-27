package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathAlgorithmsTest {

    @Test

    public void test1(){
        assertEquals(5, MathAlgorithms.greatestCommonDivisor(10,5));
    }
}
