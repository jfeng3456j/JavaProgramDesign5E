package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordLength {

    public static void main(String[] args) {
        String question = "Write a method called wordLengths that accepts a Scanner for an input file as its parameter. Your method should\n" +
                "open the given file, count the number of letters in each token in the file, and output a result diagram of how many\n" +
                "words contain each number of letters. For example, consider a file containing the following text:";

        String output = "Before sorting:\n" +
                "13 23 480 –18 75\n" +
                "hello how are you feeling today\n" +
                "After sorting:\n" +
                "–18 13 23 75 480\n" +
                "are feeling hello how today you\n" +
                "Your method should produce the following output to the console. Use tabs so that the stars line up:\n" +
                "1: 0\n" +
                "2: 6 ******\n" +
                "3: 10 **********\n" +
                "4: 0\n" +
                "5: 5 *****\n" +
                "6: 1 *\n" +
                "7: 2 **\n" +
                "8: 2 **\n" +
                "Assume that no token in the file is more than 80 characters in length.";
        try {
            Scanner input = new Scanner(new File("./src/BuildJavaPrograms/Chapter_7_Arrays/PrExerciseFile/wordlength.dat"));
            wordLength(input);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void wordLength(Scanner input) {

        int counts[] = getTokenCount(input);

        printWordCounts(counts);
    }

    private static int[] getTokenCount(Scanner input) {

        int[] result = new int[81];

        while(input.hasNext()) {
            result[input.next().length()]++;
        }

        return result;
    }

    private static void printWordCounts(int[] counts) {
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > 0 ) {
                System.out.printf("%d: %d\t", i , counts[i]);
                printChar('*', counts[i]);
                System.out.println();
            }
        }
    }

    private static void printChar(char ch, int n) {
        for (int i = 0 ; i < n; i++ ) {
            System.out.print(ch);
        }
    }

}

