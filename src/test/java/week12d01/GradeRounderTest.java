package week12d01;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class GradeRounderTest {

    @Test

    public void test1(){

        GradeRounder gr = new GradeRounder();
        assertEquals("[82, 85, 40, 41, 60]", Arrays.toString(gr.roundGrades(new int[]{82,83,40,41,58})));

    }
}
