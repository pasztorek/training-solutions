package week06d03;

import org.junit.Test;
import week06d02.Category;
import week06d02.Store;
import week06s03.WordEraser;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordEraserTest {

    @Test
    public void test1(){
        assertEquals("alma szilva barack narancs", new WordEraser().eraseWord("alma körte szilva barack körte narancs körte", "körte"));

    }

}
