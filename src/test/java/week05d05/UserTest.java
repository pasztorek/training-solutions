package week05d05;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {


    @Test
    public void test1(){
        User user = new User("Gábor", "Pasztorek","pgk977@outlook.com");
        assertEquals("Pasztorek Gábor", user.getFullName());

    }

    @Test
    public void test2()
            throws IllegalArgumentException {
            Exception ex = assertThrows(IllegalArgumentException.class, () -> new User("Gábor", "Pasztorek","pgk977outlook.com"));
            assertEquals("Nem megfelelő email formatum!", ex.getMessage());
    }

}
