package BuildJavaPrograms.Chapter_7_Arrays;

public class SecondHigestArray {

    public static void main (String[] args) {
        //find the second highest element in an array
        int[] nums = {5,10};

        int highestMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        //using Arrays.sort() it will nlog(n), we want O(n)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > highestMax) {
                secondMax = highestMax;
                highestMax = nums[i];
            }
            if (nums[i] > secondMax && nums[i] < highestMax) {
                secondMax = nums[i];
            }
        }

        System.out.println("Highest element is " + highestMax);
        System.out.println("Second highest element is " + secondMax);

    }
}
