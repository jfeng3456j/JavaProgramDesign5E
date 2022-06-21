package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

public class LongestSortedSequence {

    public static void main(String[] args) {
        String question = "Write a method called longestSortedSequence that accepts an array of integers as a parameter and returns the\n" +
                "length of the longest sorted (nondecreasing) sequence of integers in the array. For example, in the array [3, 8,\n" +
                "10, 1, 9, 14, –3, 0, 14, 207, 56, 98, 12], the longest sorted sequence in the array has four values in it\n" +
                "(the sequence 3, 0, 14, 207), so your method would return 4 if passed this array. Sorted means nondecreasing, so a\n" +
                "sequence could contain duplicates. Your method should return 0 if passed an empty array.";

        int[] nums = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};

        int longestSortedSequence = getLongestSortedSequence(nums);

        System.out.println("The longest sorted Sequence is " + longestSortedSequence);

    }

    //O(n)
    private static int getLongestSortedSequence(int[] nums) {
        //https://stackoverflow.com/questions/12860070/java-post-increment-not-behaving-as-expected-when-passed-as-a-parameter
        int maxLength = 0;

        if (nums.length < 1) return maxLength;

        int count = 1;

        for(int i = 0; i < nums.length -1; i++ ) {
            if (nums[i] < nums[i+1]) {
                count++;
                maxLength = Math.max(maxLength, count);
            }
            else {
                count = 1;
            }
        }

        return maxLength;
    }
}
