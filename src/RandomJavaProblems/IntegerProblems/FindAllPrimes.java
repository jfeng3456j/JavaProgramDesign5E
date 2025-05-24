package RandomJavaProblems.IntegerProblems;

import java.util.ArrayList;

public class FindAllPrimes {
    public static void main(String[] args)
    {
        String pr_description = "Find all the prime number up to a given integer N.";

        System.out.println("Problem description: " + pr_description);

        int input = 20;
        System.out.printf("list of primes give a num %d is: %s", input, findAllPrimes(input));
    }

    public static ArrayList<Integer> findAllPrimes(int num)
    {
        ArrayList<Integer> allPrimes = new ArrayList<>();

        if (num < 2) {
            return allPrimes;
        }

        for (int i = 2; i <= num; i++)
        {
            boolean isPrime = true;


            // checks j up to sqrt(i), which is equivalent j * j
            //for (int j = 2; j * j <= i; j++)
            for (int j = 2; j <= (int)Math.sqrt(i); j++)
            {
                // no reminder means the num is not a prime, then break out the loop
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
            {
                allPrimes.add(i);
            }
        }
        return allPrimes;
    }
}
