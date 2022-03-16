package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

public class Exercise_Nine {

    public static void main (String[] args) {
        String question = "Write a method called minGap that accepts an integer array as a parameter and returns the minimum difference or\n" +
                "gap between adjacent values in the array, where the gap is defined as the later value minus the earlier value. For example, in the array [1, 3, 6, 7, 12], the first gap is 2 (3 - 1), the second gap is 3 (6 - 3), the third gap is 1 (7 - 6),\n" +
                "and the fourth gap is 5 (12 - 7). So your method should return 1 if passed this array. The minimum gap could be a\n" +
                "negative number if the list is not in sorted order. If you are passed an array with fewer than two elements, return 0.";

        int[] nums = {1, 3, 6, 7, 12};

        int minGap = findMinGap(nums);

        System.out.println("the Min gap between two numbers in array is : " + minGap);
    }


    private static int findMinGap(int[] nums) {
        int min = Integer.MAX_VALUE;

        if (nums.length < 2) return 0;

        //iterate nums.length - 1 and cal the different of current and next

        for(int i = 0; i < nums.length -1; i++) {
            min = Math.min(min, nums[i+1] - nums[i]);
        }

        return min;
    }
}
