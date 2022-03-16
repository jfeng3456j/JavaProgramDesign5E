package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercise_Eleven {

    public static void main(String[] args) {
        String question = "Write a method called isUnique that accepts an array of integers as a parameter and returns a boolean value indicating whether or not the values in the array are unique (true for yes, false for no). The values in the list are considered unique if there is no pair of values that are equal. For example, if passed an array containing [3, 8, 12,\n" +
                "2, 9, 17, 43, –8, 46], your method should return true, but if passed [4, 7, 3, 9, 12, –47, 3, 74],\n" +
                "your method should return false because the value 3 appears twice";

        int[] nums = {3, 8, 12, 2, 9, 17, 43, -8, 46, -8};

        boolean isUnique = isUniquArraySort(nums);

        System.out.println("the array is unique: " + isUnique);
    }

    //set approach
    //O(n) s(O(1)
    private static boolean isUniqueSet(int[] nums) {
        Set<Integer> unique = new HashSet<>();

        for(int i = 0; i < nums.length;i++) {
            if (!unique.add(nums[i])) return false;
        }

        return true;
    }

    //n(log(n) s(0(1))
    private static boolean isUniquArraySort(int[] nums) {
        if (nums.length < 1) return true;

        //quick sort
        quickSort(nums, 0, nums.length -1);

        System.out.println("after sort " + Arrays.toString(nums));

        for(int i = 0; i < nums.length -1; i++) {
            if (nums[i] == nums[i+1]) return false;
        }
        return true;
    }

    private static void quickSort(int[] nums, int start, int end) {

        if (start >= end) return;

        int random = new Random().nextInt(end - start) + start;

        //swap random with end
        swap(nums, random, end);

        int leftPointer = start;
        int rightPointer = end;

        int pivot = nums[end];

        while (leftPointer < rightPointer)  {
               while(nums[leftPointer] <= pivot && leftPointer < rightPointer ) leftPointer++;
               while(nums[rightPointer] >= pivot && leftPointer < rightPointer ) rightPointer--;

               //swap left and right values
               if (leftPointer != rightPointer) {
                   swap (nums, leftPointer, rightPointer);
               }
        }

        //swap leftPointer with end
        swap(nums, leftPointer, end);

        //recursive call left and right subArray
        quickSort(nums, 0, leftPointer - 1 );
        quickSort(nums, leftPointer + 1, end);

    }

    private static void swap(int[] nums, int random, int end) {
        int temp = nums[random];
        nums[random] = nums[end];
        nums[end] = temp;
    }
}
