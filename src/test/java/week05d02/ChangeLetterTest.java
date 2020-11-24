package week05d02;


import org.junit.jupiter.api.Test;
import stringscanner.StringScanner;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ChangeLetterTest {

    @Test
public void test() {

        assertEquals("*sfd**df", new ChangeLetter().changeVowels("usfdAidf"));

}

}
