package BuildJavaPrograms.Chapter_11_Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListPrimeMain {

    public static void main (String[] args) {
        System.out.println("This program will find the prime numbers up to the maximum");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a max number");
        int max = input.nextInt();

        List<Integer> primes = sieve(max);
        System.out.println("Prime numbers up to " + max + " : " + primes );

    }

    public static List<Integer> sieve (int max) {
        List<Integer> primes = new LinkedList<>();
        List<Integer> numbers = new LinkedList<>();

        for (int i = 2; i <= max; i++) {
            numbers.add(i);
        }


        while (!numbers.isEmpty()) {
            //remove the prime number from front of the number list
            int front = numbers.remove(0);
            primes.add(front);

            Iterator<Integer> it = numbers.iterator();
            while (it.hasNext()) {
                  int current = it.next();
                  if ( current % front == 0) {
                      it.remove();
                  }
            }
        }

        return primes;
    }


}
