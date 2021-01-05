package week10d02;

import org.junit.Test;

import java.util.List;
import static org.junit.Assert.assertEquals;

public class MaxTravelTest {

    @Test

    public void test(){

        MaxTravel maxTravel = new MaxTravel();
        assertEquals(3, maxTravel.getMaxIndex(List.of(5,5,5,5,1,1,7,1,2,3,3,3,3,3,4,4,4,4,8,1)));

    }
}
