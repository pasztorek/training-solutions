package week08d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Array;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListsTest {

@Test

    public void test1(){
    StringLists sl = new StringLists();

    assertEquals("[alma, körte, citrom,, narancs]", sl.stringListsUnion(List.of("alma","körte","körte"), List.of("citrom,","alma","narancs")).toString());
}

}
