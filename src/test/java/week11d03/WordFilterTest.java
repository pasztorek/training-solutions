package week11d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import schoolrecords.Student;
import stringmethods.filename.FileNameManipulator;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class WordFilterTest {


    @Test

    public void test1(){
        WordFilter wf = new WordFilter();
        assertEquals("[alma, barack, narancs]", wf.wordsWithChar(List.of("alma","körte","barack","narancs","kiwi"),'a').toString());

    }

    @Test
    public void test2() throws IllegalArgumentException {
        WordFilter wf = new WordFilter();

        Exception ex = assertThrows(IllegalArgumentException.class, () -> wf.wordsWithChar(null,'a').toString());
        assertEquals("Nem jó paraméter", ex.getMessage());
    }


    }

