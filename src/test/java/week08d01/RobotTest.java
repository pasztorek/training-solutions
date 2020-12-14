package week08d01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotTest {


    @Test

    public void test1(){

        Robot rbt = new Robot();
        assertEquals("RobotPosition{X=3, Y=-3}", rbt.move("FFLLLLLBBBBJJJJJJJ").toString());
    }
}
