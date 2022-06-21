package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class FindMedian {

    public static void main(String[] args) {
        String question = "Write a method called median that accepts an array of integers as its parameter and returns the median of the numbers in the array. The median is the number that appears in the middle of the list if you arrange the elements in order.\n" +
                "Assume that the array is of odd size (so that one sole element constitutes the median) and that the numbers in the\n" +
                "array are between 0 and 99 inclusive. For example, the median of [5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17]\n" +
                "is 5 and the median of [42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27] is 25. (Hint: You\n" +
                "may wish to look at the Tally program from earlier in this chapter for ideas.)";


        int[] nums = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17, 18};

        int median = findMedianSort(nums);

        System.out.println("the median in the array is : " + median);

    }

    //O(n(log(n))
    private static int findMedianSort(int[] nums) {

        //sort the array
        mergeSort(nums);

        System.out.println("sorted array: " + Arrays.toString(nums));

        int n = nums.length;

        if ( n % 2 == 0) {
            return (nums[n/2] + nums[n/2+1]) / 2;
        }

        return nums[n/2];
    }

    private static void mergeSort(int[] nums) {
        int n = nums.length;

        if ( n <=1) return;

        int mid = n / 2;

        //create two arrays
        int[] left = new int[mid];
        int[] right = new int[n -mid];

        //fill up the array
        for(int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }

        for (int i = mid; i < n; i++) {
            right[i - mid] = nums[i];
        }

        //recursive call
        mergeSort(left);
        mergeSort(right);

        merge(nums, left, right);

    }

    private static void merge(int[] nums, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                nums[k] = left[i++];
            } else {
                nums[k] = right[j++];
            }

            k++;
        }

        while ( i < left.length) {
            nums[k++] = left[i++];
        }

        while (j < right.length) {
            nums[k++] = right[j++];
        }
    }
}
