package introjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GentlemanTest {

    @Test
    public void testCreate() {
        //Given
        Gentleman uriember = new Gentleman();

        //When
        String name = uriember.sayHello("John Doe");

        //Then
        assertEquals(name, "Hello John Doe");
    }

    private void assertEquals(String name, String hello_john_doe) {
    }
}