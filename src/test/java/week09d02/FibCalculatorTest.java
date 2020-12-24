package week09d02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibCalculatorTest {

    @Test
    public void test1() {
        assertEquals(798, new FibCalculator().sumEvens(610));
    }
}
