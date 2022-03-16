package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

import heap.PriorityQueueMaxHeap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Exercise_Seven {

    public static void main (String[] args) {
        String question = "Write a method called kthLargest that accepts an integer k and an array a as its parameters and returns the element such that k elements have greater or equal value. If k = 0, return the largest element; if k = 1, return the \n" +
                "second-largest element, and so on. For example, if the array passed contains the values [74, 85, 102, 99, 101,\n" +
                "56, 84] and the integer k passed is 2, your method should return 99 because there are two values at least as large as\n" +
                "99 (101 and 102). Assume that 0 ≤ k < a.length. (Hint: Consider sorting the array or a copy of the array first.)";

        int[] nums = {74, 85, 102, 99, 101, 56, 84};
        int[] result = kthLargestSort(nums, 2);

        //O(nlog(n) -> sorting
        System.out.println("Sorting - Kth Largest numbers are: " + Arrays.toString(result));


        //O(nlog(k) -> maxHeap
        System.out.println("Max Heap - Kth Largest numbers are: " + Arrays.toString(result));
    }

    private static int[] kthLargestHeap(int[] nums, int k) {
        //result should be [99,101,102]
        int[] result = new int[k+1];

        if (nums.length < 1 || nums.length < k) return result;

        PriorityQueue<Integer> max = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < k; i++) {
            max.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max.peek()) {
                max.poll();
                max.add(nums[i]);
            }
        }

        int counter = 0;
        while(!max.isEmpty()) {

            result[counter++] = max.poll();
        }

        return result;

    }




    //O(log(n)
    private static int[] kthLargestSort(int[] nums, int k) {
        //result should be [99,101,102]
        int[] result = new int[k+1];

        if (nums.length < 1 || nums.length < k) return result;

        //merge sort

        mergeSort(nums);

        int kthPlace = nums.length - k - 1;

        for (int i = kthPlace; i < nums.length; i++) {
            result[i - kthPlace] = nums[i];
        }

        return result;

    }


    private static void mergeSort(int[] nums) {
        int n  = nums.length;

        if (n <= 1) return;

        int mid =  n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        //populate the left and right array
        for(int i = 0; i < left.length; i++) {
            left[i] = nums[i];
        }

        for(int i = mid; i < n; i++) {
            right[i - mid] = nums[i];
        }

        //recursive call
        mergeSort(left);
        mergeSort(right);

        merge(nums, left, right);

    }

    private static void merge(int[] nums, int[] left, int[] right) {
        int i = 0, j = 0, k =0;

        int leftSize = left.length;
        int rightSize = right.length;

        while(i < leftSize && j < rightSize) {

            if (left[i] <= right[j]) {
                nums[k] = left[i];
                i++;
            } else {
                nums[k] = right[j];
                j++;
            }

            k++;
        }

        while (i < leftSize) {
            nums[k] = left[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            nums[k] = right[j];
            j++;
            k++;
        }

    }
}
