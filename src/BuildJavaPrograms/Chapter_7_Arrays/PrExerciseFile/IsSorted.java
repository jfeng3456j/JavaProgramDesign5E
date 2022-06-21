package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

public class IsSorted {

    public static void main (String[] args) {
        String question = "Write a method called isSorted that accepts an array of real numbers as a parameter and returns true if the list is in\n" +
                "sorted (nondecreasing) order and false otherwise. For example, if arrays named list1 and list2 store [16.1,\n" +
                "12.3, 22.2, 14.4] and [1.5, 4.3, 7.0, 19.5, 25.1, 46.2] respectively, the calls isSorted(list1) and\n" +
                "isSorted(list2) should return false and true respectively. Assume the array has at least one element. A one-element array is considered to be sorted.";

        int[] nums = {36, -12, 25, 19, 46, 31, 22};

        System.out.println("Is the array sorted: " + isSorted(nums));
    }

    private static boolean isSorted(int[] nums) {

        if (nums.length < 1) {
            return false;
        }

        for (int i = 0; i < nums.length -1; i++) {
             if ((nums[i] > nums[i+1])) {
                  return false;
             }
        }

        return true;
    }

}
