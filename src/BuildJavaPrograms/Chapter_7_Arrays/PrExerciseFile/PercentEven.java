package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

public class PercentEven {

    public static void main (String[] args) {
        String quesiton = "Write a method called percentEven that accepts an array of integers as a parameter and returns the percentage of\n" +
                "even numbers in the array as a real number. For example, if the array stores the elements [6, 2, 9, 11, 3], then\n" +
                "your method should return 40.0. If the array contains no even elements or no elements at all, return 0.0.";

        int[] nums = {6, 2, 9, 11, 3};
        System.out.println("Question detail " + quesiton);
        double percentEven = calPercentEven(nums);

        System.out.println("percent of even number in the arary is " + percentEven);
    }

    private static double calPercentEven(int[] nums) {

        if (nums.length < 1) return 0.0;

        int countEvent = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) countEvent++;
        }

        return ((double) countEvent / nums.length) * 100;

    }
}
