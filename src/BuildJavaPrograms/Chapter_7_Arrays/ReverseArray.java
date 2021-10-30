package BuildJavaPrograms.Chapter_7_Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main (String[] args) {

        int[] list = {1,3,4,56,7,8,9,13,70};

        if (list.length <=1) {
            System.out.println(Arrays.toString(list));
        }

        else {
            for (int i = 0; i < list.length / 2; i++) {
                int j = list.length - i - 1;
                swap(list, i, j);
            }

            System.out.println(Arrays.toString(list));
        }
    }

    public static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
