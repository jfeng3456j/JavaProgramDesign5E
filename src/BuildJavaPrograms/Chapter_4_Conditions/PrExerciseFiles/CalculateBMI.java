package BuildJavaPrograms.Chapter_4_Conditions.PrExerciseFiles;

import java.util.Scanner;

public class CalculateBMI {

    public static void main(String[] args)
    {
        String pr_description = "write a program that prompts the user for\n" +
                "the height and weight of two individuals and reports the overall results for the two\n" +
                "people";

        System.out.println("problem description:" + pr_description);

        //approach use scanner object to prompt user for height and weight
        // calculate the bmi based on inputs
        // display the bmi

        intro();
        Scanner input = new Scanner(System.in);
        double person1BMI = getBMI(input);
        double person2BMI = getBMI(input);

        System.out.println("person 1 is:");
        displayBMIResult(person1BMI);

        System.out.println("person 2 is:");
        displayBMIResult(person2BMI);
    }

    public static void intro()
    {
        System.out.println("This program reads data for two persons");
        System.out.println("and compute their body mass index and weight status.");
        System.out.println();
    }

    public static double getBMI(Scanner scanner)
    {
        System.out.println("Enter the person's height (in inches):");
        double height = scanner.nextDouble();

        System.out.println("Enter the person's weight (in lbs):");
        double weight = scanner.nextDouble();

        return calculateBMI(height, weight);
    }

    public static double calculateBMI(double height, double weight)
    {
        return weight / (height * height) * 703;
    }

    public static void displayBMIResult(double bmi)
    {
        System.out.printf("Person BMI = %5.2f\n", bmi);
        calculateWeightStaus(bmi);
    }

    public static void calculateWeightStaus(double bmi)
    {
        if (bmi < 18.5)
        {
            System.out.println("under weight");
        }
        else if (bmi < 25)
        {
            System.out.println("weight is normal");
        }
        else if (bmi < 30)
        {
            System.out.println("weight is overweight");
        }
        else
        {
            System.out.println("weight is obese");
        }
    }

}
