package week11d02;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourierTest {


    @Test
        public void test1(){

        Ride rd1 = new Ride(1, 1, 12);
        Ride rd2 = new Ride(1, 2, 11);
        Ride rd3 = new Ride(2, 1, 10);
        Ride rd4 = new Ride(4, 1, 19);

        Courier cr = new Courier();

        cr.addRide(rd1);
        cr.addRide(rd2);
        cr.addRide(rd3);
        cr.addRide(rd4);

        assertEquals(3,cr.getFirstHoliday());

    }

    @Test
    public void test2(){

        Ride rd1 = new Ride(1, 1, 12);
        Ride rd2 = new Ride(2, 1, 11);
        Ride rd3 = new Ride(1, 1, 10);


        Courier cr = new Courier();

        cr.addRide(rd1);
        cr.addRide(rd2);


        Exception ex = assertThrows(IllegalArgumentException.class, () -> cr.addRide(rd3));
        assertEquals("Nem jó paraméter", ex.getMessage());

    }

    @Test
    public void test3(){

        Ride rd1 = new Ride(1, 1, 12);
        Ride rd2 = new Ride(1, 2, 11);
        Ride rd3 = new Ride(1, 1, 10);


        Courier cr = new Courier();

        cr.addRide(rd1);
        cr.addRide(rd2);


        Exception ex = assertThrows(IllegalArgumentException.class, () -> cr.addRide(rd3));
        assertEquals("Nem jó paraméter", ex.getMessage());

    }


}
