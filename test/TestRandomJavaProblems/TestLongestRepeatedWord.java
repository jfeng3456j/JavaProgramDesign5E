package TestRandomJavaProblems;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

public class TestLongestRepeatedWord {

    // empty constructor
    public TestLongestRepeatedWord()
    {

    }

    @Test
    public void testLongestRepeatedWord()
    {
        String input = "a day is a day to watch a long long video";
        String expected = "long";
        String actual = RandomJavaProblems.StringsProblems.LongestRepeatedWord.longestRepeatedWord(input);
        assertEquals(expected, actual);
    }
}
