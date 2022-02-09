package BuildJavaPrograms.Chapter_7_Arrays;

public class MaxMinInArray {

    public static void main (String[] args) {
        int[] nums = {1,9,10,11,5,3,0};

        if (nums.length < 1) {
            return;
        }

        int max = Integer.MIN_VALUE;
        int min = 0;

        for (int i = 0; i < nums.length; i++) {
             if (nums[i] > max) {
                 max = nums[i];
             }

             if (min == 0 || nums[i] < min) {
                 min = nums[i];
             }
        }

        System.out.printf("The max value is %s ", max);
        System.out.printf("The min value is %s ", min);
    }
}
