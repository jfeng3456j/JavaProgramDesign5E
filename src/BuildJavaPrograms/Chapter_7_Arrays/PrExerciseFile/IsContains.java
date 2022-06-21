package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsContains {

    public static void main(String[] args) {
        String question = "Write a method called contains that accepts two arrays of integers a1 and a2 as parameters and that returns a\n" +
                "boolean value indicating whether or not the sequence of elements in a2 appears in a1 (true for yes, false for no).\n" +
                "The sequence must appear consecutively and in the same order. For example, consider the following arrays:\n" +
                "int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};\n" +
                "int[] list2 = {1, 2, 1}; \n + " +
                "The call of contains(list1, list2) should return true because the sequence of values in list2 [1, 2, 1] is\n" +
                "contained in list1 starting at index 5. If list2 had stored the values [2, 1, 2], the call of contains(list1,\n" +
                "list2) would return false. Any two lists with identical elements are considered to contain each other. Every array\n" +
                "contains the empty array, and the empty array does not contain any arrays other than the empty array itself.";

        System.out.println("question detail is " + question);
        System.out.println();

        int[] list1 = {1, 2, 1, 2, 3};
        int[] list2 = {1, 2, 3};

        boolean isContains = contains(list1, list2);

        System.out.println("list1 contains list2: " + isContains);

        System.out.println("list1 contains list2 using array equals: " + containsArrayEquals(list1, list2));
    }

    private static boolean contains(int[] list1, int[] list2) {
        for(int i = 0; i <= list1.length - list2.length; i++) {

            int count = 0;

            for(int j = 0; j < list2.length; j++) {
                if (list1[i+j] == list2[j]) {
                    count++;
                }
            }

            if (count == list2.length) return true;
        }
        return false;
    }

    private static boolean containsArrayEquals(int[] list1, int[] list2) {
        // {0,1,2,3,4}
        // {1,2,1,2,3};
        for (int i = 0; i <= list1.length - list2.length; i++) {

            //add i and subtract i, so size is always 3 (list2 lenth)
            if(Arrays.equals(Arrays.copyOfRange(list1, i, i + list2.length), list2)) {
                System.out.println(" waht is i " + i);
                return true;
            }

        }

        return false;
    }

    //No good
    private static boolean containsOneLoop (int[] list1, int[] list2) {
        int start = 0;
        int maxLength = 0;
        int count = 0;

        for(int i = 0; i < list1.length; i++) {

            if (start < list2.length && list1[i] == list2[start]) {
                start++;
                count+=1;
            } else {
                start = 0;
                count = 0;
            }

            maxLength = Math.max(maxLength, count);
        }

        return maxLength == list2.length ? true : false;
    }
}
