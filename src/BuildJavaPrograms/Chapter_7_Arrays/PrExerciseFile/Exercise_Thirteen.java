package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

public class Exercise_Thirteen {

    public static void main(String[] args) {
        String question = "Write a method called longestSortedSequence that accepts an array of integers as a parameter and returns the\n" +
                "length of the longest sorted (nondecreasing) sequence of integers in the array. For example, in the array [3, 8,\n" +
                "10, 1, 9, 14, –3, 0, 14, 207, 56, 98, 12], the longest sorted sequence in the array has four values in it\n" +
                "(the sequence 3, 0, 14, 207), so your method would return 4 if passed this array. Sorted means nondecreasing, so a\n" +
                "sequence could contain duplicates. Your method should return 0 if passed an empty array.";

        int[] nums = {3, 8,
                10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};

        int longestSortedSequence = getLongestSortedSequence(nums);

    }

    private static int getLongestSortedSequence(int[] nums) {
        int maxLength = 0;
        if (nums.length < 1) return maxLength;
    }
}
