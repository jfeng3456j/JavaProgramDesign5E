package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

import java.util.Arrays;
import java.util.Random;

public class Exercise_Five {

    public static void main (String[] args) {
        Random random = new Random();
        String question = "Write a method called mode that returns the most frequently occurring element of an array of integers. Assume that\n" +
                "the array has at least one element and that every element in the array has a value between 0 and 100 inclusive. Break\n" +
                "ties by choosing the lower value. For example, if the array passed contains the values [27, 15, 15, 11, 27], your\n" +
                "method should return 15.";

        System.out.println(question);

        int[] nums = {5,5,5,4,4,4};

//        for (int i = 0; i < nums.length; i++) {
//            //https://stackoverflow.com/questions/52250048/random-number-using-nextint-inclusive-5-15-java
//             nums[i] = random.nextInt(101);
//        }

        System.out.println(Arrays.toString(nums));
        int frequency = findHighFrequencyElements(nums);
        System.out.println("highest frequency is: " + frequency);

    }

    private static int findHighFrequencyElements(int[] nums) {

        if (nums.length < 1) {
            throw new IllegalArgumentException();
        }

        int[] counts = new int[6];

        for (int i = 0; i < nums.length; i++) {
            //count[31]
            counts[nums[i]]++;
        }

        int frequency = 0;
        int max = counts[0];

        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > max) {
                frequency = i;
                max = counts[i];
            }
        }

        System.out.println("values in count array is" + Arrays.toString(counts));

        return frequency;

    }
}
