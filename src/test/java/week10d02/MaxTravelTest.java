package week10d02;



import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxTravelTest {

    @Test

    public void test(){

        MaxTravel maxTravel = new MaxTravel();
        assertEquals(3, maxTravel.getMaxIndex(List.of(5,5,5,5,1,1,7,1,2,3,3,3,3,3,4,4,4,4,8,1)));

    }
}
