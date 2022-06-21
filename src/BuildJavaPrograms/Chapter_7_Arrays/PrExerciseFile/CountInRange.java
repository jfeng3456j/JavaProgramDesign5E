package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

public class CountInRange {

    public static void main (String[] args) {
        String question = "Write a method called countInRange that accepts an array of integers, a minimum value, and a maximum value as\n" +
                "parameters and returns the count of how many elements from the array fall between the minimum and maximum\n" +
                "(inclusive). For example, in the array [14, 1, 22, 17, 36, 7, –43, 5], for minimum value 4 and maximum\n" +
                "value 17, there are four elements whose values fall between 4 and 17";
        int[] nums = {36, -12, 25, 19, 46, 31, 22};

        int rangeCount = rangeCountMinMax(nums,3,31);

        System.out.println("Number of elements between min and max are " + rangeCount);
    }

    private static int rangeCountMinMax(int[] nums, int min, int max) {
        if (nums.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
             if (nums[i] >= min && nums[i] <= max) {
                 count++;
             }
        }

        return count;


    }
}
