package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_One{

    public static void main (String[] args) {
        String question = "Write a method called lastIndexOf that accepts an array of integers and an integer value as its parameters and returns\n" +
                "the last index at which the value occurs in the array. \n" +
                "The method should return –1 if the value is not found. \n" +
                "For example, in the array [74, 85, 102, 99, 101, 85, 56], the \n" +
                "last index of the value 85 is 5.";
        printQuestion(question);

        int[] nums = {74, 85, 102, 99, 101, 85, 56};

        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(nums));
        System.out.println("Enter an number from the above list");
        int target = Integer.parseInt(input.nextLine());
        System.out.println("The number is found at index: "+lastIndexOf(nums, target));

    }

    private static void printQuestion(String s) {
        System.out.println(s);
    }

    private static int lastIndexOf(int[] nums, int target) {
        int lastIndexOf = -1;

        if (nums.length < 1) {
            return lastIndexOf;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                lastIndexOf = i;
            }
        }
        return lastIndexOf;
    }



}
