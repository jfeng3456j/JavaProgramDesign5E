package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

import java.util.Arrays;

public class Collapse {

    public static void main(String[] args) {
        String question = "Write a method called collapse that accepts an array of integers as a parameter and returns a new array\n" +
                "containing the result of replacing each pair of integers with the sum of that pair. For example, if an array called\n" +
                "list stores the values [7, 2, 8, 9, 4, 13, 7, 1, 9, 10], then the call of collapse(list) should return a\n" +
                "new array containing [9, 17, 17, 8, 19]. The first pair from the original list is collapsed into 9 (7 + 2), the\n" +
                "second pair is collapsed into 17 (8 + 9), and so on. If the list stores an odd number of elements, the final element is\n" +
                "not collapsed. For example, if the list had been [1, 2, 3, 4, 5], then the call would return [3, 7, 5]. Your\n" +
                "method should not change the array that is passed as a parameter.";

        //            0  1  2  3  4  5   6  7  8  9
        int[] nums = {7, 2, 8, 9, 4, 13, 7, 1, 9, 10};

        int[] collapse = collapse(nums);

        System.out.println("collapse array is " + Arrays.toString(collapse));

       testX();
    }

    private static int[] collapse(int[] nums) {
        //[9, 17, 17, 8, 19]

        if (nums.length < 1) return new int[0];

        int n = nums.length / 2;

        if (n % 2 == 0) {
            n+=1;
        }


        int[] newArray = new int[n];

        for (int i = 0; i < nums.length - 1; i+=2) {
            newArray[i / 2] = nums[i] + nums[i+1];
        }

        if (nums.length % 2 != 0) {
            //[1, 2, 3, 4, 5]
            //[3, 7, 5]
            newArray[newArray.length -1] = nums[nums.length - 1];
        }

        return newArray;

    }

    public static void testX() {
        int x = 0;
        int[] a = new int[4];
        x++;

        mystery(x, a);
        System.out.println("x is : " + x + " " + Arrays.toString(a));

        x++;
        mystery(x, a);
        System.out.println(x + " " + Arrays.toString(a));
    }

    public static void mystery(int x, int[] a) {
        x++;
        a[x]++;
        System.out.println("x is : " + x + " " + Arrays.toString(a));
    }
}
