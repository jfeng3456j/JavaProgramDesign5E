package BuildJavaPrograms.Chapter_17_BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class FindNextGreaterElement {

    public static void main (String[] args) {

//        int[] arr = {3,2,5,6,9,8};
        int[] arr = {1,7,5,9,8};

        //[2,2,3,4,-1,-1]
        //[5,5,6,9,-1,-1]

        //find the next largest element and stop
        List<Integer> result = new ArrayList<>();

        //find the max num
        int max = 0;
        for (int i = 0 ; i < arr.length -1; i++) {
             if (arr[i] > arr[i+1]) {
                 max = arr[i];
             } else {
                 max = arr[i+1];
             }
        }

        System.out.println("max number is " + max);

        for (int i = 0; i < arr.length; i++) {
            int next = -1;
             for (int j = i + 1; j < arr.length; j++) {
                 if (arr[i] < arr[j]) {
                     next = arr[j];
                     break;
                 }

             }
//             if ( arr[i] == max || i == arr.length -1) {
//                 result.add(-1);
//             }
            result.add(next);
        }

        System.out.println(result);
    }
}
