package week07d04;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabTest {

    @Test

    public void test1() {

        Lab lab = new Lab("Java");
        assertEquals("Java, completed=false, completedAt=null", lab.toString());

    }
    @Test

    public void test2() {

        Lab lab = new Lab("Java", LocalDate.now());
        assertEquals("Java, completed=null, completedAt=2020-12-11", lab.toString());

    }
    @Test
    public void test3() {

        Lab lab = new Lab("Java");
        lab.complete();
        assertEquals("Java, completed=true, completedAt=2020-12-11", lab.toString());

    }

    @Test
    public void test4() {

        Lab lab = new Lab("Java");
        lab.complete(LocalDate.of(2020,12,31));
        assertEquals("Java, completed=true, completedAt=2020-12-31", lab.toString());

    }


}
