package BuildJavaPrograms.Chapter_7_Arrays.ProgramProjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class BenfordLaw {

    public static void main(String[] args) throws FileNotFoundException {
        createOutputFile();

        // read output files and count frequence of how many times each num from 1 - 9 appeared
        Scanner console = new Scanner(System.in);
        System.out.println("Count the leading digits in output.txt");
        System.out.println("Enter the file name:");
        String fileName = console.nextLine();

        Scanner inputFile = new Scanner(new File("./src/BuildJavaPrograms/Chapter_7_Arrays/Output_files/"+fileName));

        int[] count = countDigits(inputFile);

        displayRessult(count);

    }

    // create input files with random num from 1 - 999
    public static void createOutputFile()
    {
        try{
            PrintStream output = new PrintStream("./src/BuildJavaPrograms/Chapter_7_Arrays/Output_files/output.txt");
            Random ran = new Random();

            for (int row = 0; row <= 20; row++)
            {
                for (int col = 0; col <= 10; col++)
                {
                    int num = ran.nextInt( 999) + 1;
                    output.print(num +"\t");
                }
                output.println();
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }

    // read in digits and compute the total frequency for each leading digit (1-9)
    public static int[] countDigits(Scanner input)
    {
        int[] count = new int[10];
        while(input.hasNextInt())
        {
            int num = input.nextInt();
            count[leadDigit(num)]++;
        }

        return count;
    }

    public static int leadDigit(int num)
    {
        int result = Math.abs(num);
        while (result >= 10)
        {
            result  = result / 10;
        }
        return result;
    }

    public static void displayRessult(int[] count)
    {
        System.out.println();

        if (count[0] > 0)
        {
            System.out.println("excluding " + count[0]  + "zeros");
        }

        int total = calSum(count) - count[0];

        System.out.println("Digit Count Percent");

        for (int i = 1; i <count.length; i++)
        {
            double pct = count[i] * 100.00 / total;
            System.out.printf("%5d %5d %6.2f\n", i, count[i], pct);
        }

        System.out.printf("Total %5d %6.2f\n", total, 100.0);
    }

    public static int calSum(int[] data)
    {
        int sum = 0;
        for (int num: data)
        {
            sum += num;
        }
        return sum;
    }
}
