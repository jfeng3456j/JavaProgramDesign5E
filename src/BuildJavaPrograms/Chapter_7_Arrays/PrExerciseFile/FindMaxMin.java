package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

public class FindMaxMin {

    public static void main (String[] args) {
        String question = "Write a method called range that returns the range of values in an array " +
                "of integers. The range is defined as 1 more\n" +
                "than the difference between the maximum and minimum values in the array. " +
                "For example, if an array called list\n" +
                "contains the values [36, 12, 25, 19, 46, 31, 22], the call of range(list) " +
                "should return 35 (46 = 12 + 1).\n" +
                "You may assume that the array has at least one element.";

        int[] nums = {36, -12, 25, 19, 46, 31, 22};
        printQuestion(question);
        System.out.println("The range between the max and min values are:  "+rangeBtwMaxMin(nums));
    }

    private static void printQuestion(String s) {
        System.out.println(s);
    }

    private static int rangeBtwMaxMin(int[] nums) {
        int range = 0;

        if (nums.length < 1) {
            return range;
        }

        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
             if (nums[i] > max) {
                 max = nums[i];
             }
             if (nums[i] < max && nums[i] < min) {
                 min = nums[i];
             }
        }

        return (max - min + 1);
    }
}
