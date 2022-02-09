package BuildJavaPrograms.Chapter_7_Arrays;

import java.util.Arrays;

public class RemoveZerosInArray {

    public static void main (String[] args) {
        int[] nums =  {0,1,0,3,5};// result: {1,3,5,0,0}
        removeZero(nums);

    }

    private static void removeZero(int[] nums) {
        //slow and fast point method
        int count = 0;

        if (nums.length <= 1 || (nums.length == 1 && nums[0] == 0)) {
            return;
        }

        for (int i = 0; i < nums.length;i++) {
            //if element != zero move it to the front (count position) and increment
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }

        Arrays.fill(nums, count, nums.length, 0);

        System.out.print(Arrays.toString(nums));
    }
}
