package introjunit;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {

    @Test
    public void testCreate() {
        //Given
        Gentleman uriember = new Gentleman();

        //When
        String name = uriember.sayHello("John Doe");

        //Then
        assertThat(name, equalTo("Hello John Doe"));
    }
}