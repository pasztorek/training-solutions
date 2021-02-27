package week07d05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class VehicleTest {


    @Test
    public void test1() {


        assertEquals(5, new Vehicle().getNumberOfGears());
        assertEquals("MANUAL", new Vehicle().getTransmissionType().toString());
    }

    @Test
    public void test2() {


        assertEquals(5, new Car().getNumberOfGears());
        assertEquals("AUTOMATIC", new Car().getTransmissionType().toString());
    }

    @Test
    public void test3() {


        assertEquals(5, new Truck().getNumberOfGears());
        assertEquals("MANUAL", new Truck().getTransmissionType().toString());
    }

    @Test
    public void test4() {


        assertEquals(5, new Motorcycle().getNumberOfGears());
        assertEquals("SEQUENTIAL", new Motorcycle().getTransmissionType().toString());
    }

}