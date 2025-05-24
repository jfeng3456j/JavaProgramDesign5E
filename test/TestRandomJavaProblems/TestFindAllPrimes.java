package TestRandomJavaProblems;

import BuildJavaPrograms.Chapter_9_Inheritance.Example.A;
import RandomJavaProblems.IntegerProblems.FindAllPrimes;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

public class TestFindAllPrimes {

    // empty constructor
    public TestFindAllPrimes()
    {

    }

    @Test
    public void testAllPrimes()
    {
        ArrayList<Integer> expectedPrimes = new ArrayList<>(Arrays.asList(2, 3, 5, 7));
        ArrayList<Integer> actualPrimes = FindAllPrimes.findAllPrimes(10);
        assertEquals(expectedPrimes, actualPrimes);
    }
}
