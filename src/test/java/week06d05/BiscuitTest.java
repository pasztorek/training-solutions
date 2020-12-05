package week06d05;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BiscuitTest {

    @Test
    public void test1(){
        assertEquals("OREO 100 gram", new Biscuit(BiscuitType.OREO, 100).toString());
    }
}