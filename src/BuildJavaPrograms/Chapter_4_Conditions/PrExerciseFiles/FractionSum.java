package BuildJavaPrograms.Chapter_4_Conditions.PrExerciseFiles;

public class FractionSum {
    public static void main(String[] args)
    {
        String pr_description = "Write a method called fractionSum that accepts an integer parameter n and returns as a double the sum of the\n" +
                "first n terms of the sequence";

        System.out.println("Problem description: " + pr_description);
        double fracSum = fractionSum(5);
        System.out.println("what is fracSum: " + fracSum);

    }

    public static double fractionSum(int n)
    {
        double fracSum = 0.0;
        while (n > 0)
        {
            fracSum += (double) 1 / n;
            n--;
        }

        return fracSum;
    }
}
