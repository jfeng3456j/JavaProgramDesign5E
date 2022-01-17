package BuildJavaPrograms.Chapter_7_Arrays;

import java.util.Arrays;

public class ReferenceArray {

    public static void main (String[] args) {
        int[] nums = {1,2,3};

        //newArray and nums are reference to the same array object
        int[] newArray = changeNumsArray(nums);

        for (int num: newArray) {
            System.out.println(num);
        }

    }

    private static int[] changeNumsArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]++;
        }
        return nums;
    }
}
