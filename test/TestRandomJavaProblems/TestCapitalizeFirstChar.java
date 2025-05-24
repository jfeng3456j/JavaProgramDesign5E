package TestRandomJavaProblems;

import RandomJavaProblems.StringsProblems.CapitalizeFirstChar;
import org.junit.Test;

import static junit.framework.Assert.*;

public class TestCapitalizeFirstChar {

    // constructor
    public TestCapitalizeFirstChar()
    {

    }

    @Test
    public void testCapitalizeFirstChar_emptyString()
    {
        String emptyString = "";
        String actual = CapitalizeFirstChar.capitalizeFirstChar(emptyString);
        assertEquals("",actual);
    }

    @Test
    public void testCapitalizeFirstChar_nullString()
    {
        String nullString = null;
        String actual = CapitalizeFirstChar.capitalizeFirstChar(nullString);
        assertNotNull(actual);
    }

    @Test
    public void testCapitalizeFirstChar()
    {
        String word = "hello there! mister";
        String actual = CapitalizeFirstChar.capitalizeFirstChar(word);
        assertEquals("Hello There! Mister", actual);
    }
}
