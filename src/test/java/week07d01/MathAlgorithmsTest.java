package week07d01;

import org.junit.jupiter.api.Test;
import week06d04.Budget;
import week06d05.Biscuit;
import week06d05.BiscuitType;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathAlgorithmsTest {

    @Test
    public void test1() {
        assertEquals(true, MathAlgorithms.isPrime(2));
        assertEquals(false, MathAlgorithms.isPrime(1));
        assertEquals(true, MathAlgorithms.isPrime(18481));
        assertEquals(false, MathAlgorithms.isPrime(10));
        assertEquals(false, MathAlgorithms.isPrime(18482));

    }
}




