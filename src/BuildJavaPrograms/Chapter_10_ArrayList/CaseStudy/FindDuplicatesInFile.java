package BuildJavaPrograms.Chapter_10_ArrayList.CaseStudy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindDuplicatesInFile {

    public static void main(String[] args) throws FileNotFoundException
    {
        problemDescription();

        Scanner file1 = new Scanner(new File("./src/BuildJavaPrograms/Chapter_10_ArrayList/CaseStudy/test1.txt"));
        Scanner file2 = new Scanner(new File("./src/BuildJavaPrograms/Chapter_10_ArrayList/CaseStudy/test2.txt"));

        ArrayList<String> fileListOne = readFile(file1);
        ArrayList<String> fileListTwo = readFile(file2);
        ArrayList<String> duplicates = findDuplicates(fileListOne, fileListTwo);

        displayResults(fileListOne, fileListTwo, duplicates);


    }

    public static void problemDescription()
    {
        System.out.println("This program compares 2 text files and reports the number of words in common and the percenet overlap.");
        System.out.println();
    }

    public static ArrayList<String> readFile(Scanner input)
    {
        //ignore eveerything but alphabets
        input.useDelimiter("[^a-zA-Z]+");

        ArrayList<String> words = new ArrayList<>();
        while (input.hasNext())
        {
            String next = input.next().toLowerCase();
            words.add(next);
        }

        Collections.sort(words);

        ArrayList<String> uniqueWords = new ArrayList<>();

        if (!words.isEmpty()) uniqueWords.add(words.get(0));

        for (int i = 1; i < words.size(); i++)
        {
            if (!words.get(i).equals(words.get(i - 1)))
            {
                uniqueWords.add(words.get(i));
            }
        }

        return uniqueWords;
    }

    public static ArrayList<String> findDuplicates(ArrayList<String> fileOne, ArrayList<String> fileTwo)
    {
        int counterOne = 0,  counterTwo = 0;
        ArrayList<String> duplicates = new ArrayList<>();

        while (counterOne < fileOne.size() && counterTwo < fileTwo.size())
        {
            int equality = fileOne.get(counterOne).compareTo(fileTwo.get(counterTwo));
            if (equality == 0)
            {
                duplicates.add(fileOne.get(counterOne));
                counterOne++;
                counterTwo++;
            }
            else if (equality < 0)
            {
                counterOne++;
            }
            else
            {
                counterTwo++;
            }
        }
        return duplicates;
    }

    public static void displayResults(ArrayList<String> fileListOne, ArrayList<String> fileListTwo, ArrayList<String> duplicates)
    {
        System.out.println("file #1 words = " + fileListOne.size());
        System.out.println("file #2 words = " + fileListTwo.size());
        System.out.println("common words = " + duplicates.size());

        double pct1 = 100.0 * duplicates.size() / fileListOne.size();
        double pct2 = 100.0 * duplicates.size() / fileListTwo.size();

        System.out.println("% of file 1 duplicates: " + pct1);
        System.out.println("% of file 2 duplicates: " + pct2);
    }
}
