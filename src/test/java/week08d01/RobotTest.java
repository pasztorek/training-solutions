package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {


    @Test

    public void test1(){

        Robot rbt = new Robot();
        assertEquals("RobotPosition{X=3, Y=-3}", rbt.move("FFLLLLLBBBBJJJJJJJ").toString());
    }
}