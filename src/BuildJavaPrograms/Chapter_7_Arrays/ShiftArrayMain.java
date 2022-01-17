package BuildJavaPrograms.Chapter_7_Arrays;

import java.util.Arrays;

public class ShiftArrayMain {

    public static void main (String[] args) {
        int[] arr = {3,8,9,7,5};
        int[] arr2 = {3,8,9,7,5};
        shiftRight(arr);
        System.out.println("-----------------------");
        shiftLeft(arr2);
    }

    public static void shiftRight(int[] array) {
        //[3,8,9,7,5] -> [8,9,7,5,3]

        System.out.println("Original array: " + Arrays.toString(array));
        int first = array[0];

        //shift right to left from start
        /*
        * 3 = 8
        * 8 = 9
        * 9 = 7
        * */

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = first;

        System.out.println("after shifting right to left: "+ Arrays.toString(array));

    }

    public static void shiftLeft(int[] array) {
        //[3,8,9,7,5] -> [5,3,8,9,7]

        System.out.println("Original array: " + Arrays.toString(array));

        int last = array[array.length -1];

        //shift left to right from end
        /*
        * 5 = 7
        * 7 = 9
        * 9 = 8
        * */

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i-1];
        }

        array[0] = last;
        System.out.println("after shifting left to right: "+ Arrays.toString(array));
    }
}
