package BuildJavaPrograms.Chapter_11_Collections;

import java.util.ArrayList;

public class FindMaxPrimeMain {

    public static void main (String[] args) {
        System.out.printf("%s " ,  findMaxPrime(10));
    }

    public static ArrayList<Integer> findMaxPrime(int maxNum) {
        ArrayList<Integer> primeList = new ArrayList<>();


        for (int i = 1; i <= maxNum; i++) {
            if (maxNum % i == 0 ) {
                primeList.add(i);
            }
        }

        return primeList;
    }
}
