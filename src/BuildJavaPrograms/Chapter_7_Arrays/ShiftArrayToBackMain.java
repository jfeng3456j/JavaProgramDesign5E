package BuildJavaPrograms.Chapter_7_Arrays;

import java.util.Arrays;

public class ShiftArrayToBackMain {

    public static void main (String[] args) {
        int[] arr = {3,8,9,7,5};

        //shift 3 to the back
        int temp = arr[0];

        int size = arr.length;

        for (int i = 0; i < arr.length - 1; i++) {
             arr[i] = arr[i+1];
        }

        arr[arr.length-1] = temp;

        System.out.println(Arrays.toString(arr));

    }
}
