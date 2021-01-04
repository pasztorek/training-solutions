package week10d01;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HikingTest {

    @Test

    public void test(){
        Hiking hiking = new Hiking();
        List<Double> latitudes = List.of(10d,20d,15d,18d);
        assertEquals(13d, hiking.getPlusElevation(latitudes));
    }

}
