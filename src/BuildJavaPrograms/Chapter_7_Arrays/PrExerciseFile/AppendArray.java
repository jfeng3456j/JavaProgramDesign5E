package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

import java.util.Arrays;
import java.util.stream.Stream;

public class AppendArray {

    public static void main(String[] args) {

        String question = "Write a method called append that accepts two integer arrays as parameters and returns a new array that contains the\n" +
                "result of appending the second array’s values at the end of the first array. For example, if arrays list1 and list2\n" +
                "store [2, 4, 6] and [1, 2, 3, 4, 5] respectively, the call of append(list1, list2) should return a new\n" +
                "array containing [2, 4, 6, 1, 2, 3, 4, 5]. If the call instead had been append(list2, list1), the method\n" +
                "would return an array containing [1, 2, 3, 4, 5, 2, 4, 6].";

        int[] list1 = {2, 4, 6};
        int[] list2 = {1, 2, 3, 4, 5};
        int[] appendArray = appendArray(list1, list2);

        System.out.println("new append array is " + Arrays.toString(appendArray));
        System.out.println("new append array is by for loop " + Arrays.toString(apprendArrayManual(list1, list2)));
    }

    private static int[] appendArray(int[] list1, int[] list2) {
        if (list1 == null && list2 == null) return new int[0];

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        int[] appendArray = new int[list1.length + list2.length];

        System.arraycopy(list1, 0, appendArray, 0, list1.length);
        System.arraycopy(list2, 0, appendArray, list1.length, list2.length);

        return appendArray;

    }

    private static int[] apprendArrayManual(int[] list1, int[] list2) {
        if (list1 == null && list2 == null) return new int[0];

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        int[] newArray = new int[list1.length + list2.length];

        for (int i = 0; i < list1.length; i++) {
            newArray[i] = list1[i];
        }

        for(int i = 0; i < list2.length; i++) {
            newArray[list1.length + i] = list2[i];
        }

        return newArray;
    }
}
