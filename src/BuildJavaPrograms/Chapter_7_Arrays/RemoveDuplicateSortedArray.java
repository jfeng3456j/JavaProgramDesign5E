package BuildJavaPrograms.Chapter_7_Arrays;

public class RemoveDuplicateSortedArray {

    public static void main (String[] args) {
        //remove duplicates in array {1,3,4,4,5} => {1,3,4,5}
        int[] nums = {1,3,4,4,4,5};
        int count = removeDuplicate(nums);
        System.out.print(nums[0]);
        for (int i = 1; i < count;i++) {
            System.out.print(" , "+nums[i]);
        }

    }

    private static int removeDuplicate(int[] nums) {
        int count = 0;

        if (nums.length <= 1) return count;

        for (int i = 0; i < nums.length;i++) {
            if (i < nums.length - 1 && nums[i] == nums[i+1]) {
                continue;
            }

            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}
