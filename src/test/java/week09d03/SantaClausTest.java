package week09d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SantaClausTest {

    @Test

    public void test1(){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jancsi",10));
        persons.add(new Person("Juliska",9));
        persons.add(new Person("Ödönke",19));

        SantaClaus santa = new SantaClaus(persons);
        santa.getThroughChimneys();

        assertEquals("Ödönke", persons.get(2).getName());
        assertEquals("Jancsi", persons.get(0).getName());
        assertEquals(19, persons.get(2).getAge());
        assertEquals(9, persons.get(1).getAge());
        assertEquals(null, persons.get(2).getPresent());
      //  assertNotNull(persons.get(0).getPresent());
    }
}
