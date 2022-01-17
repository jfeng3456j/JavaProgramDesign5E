package BuildJavaPrograms.Chapter_7_Arrays;

import java.util.Arrays;

public class TwoDArrayMain {

    public static void main (String[] args) {
        String[][] matrix = new String[3][5];


        int rowCount = matrix.length;
        System.out.println("The row length is " + rowCount);

        int colCount = matrix[0].length;
        System.out.println("The column length per row is " + colCount);


        //loop through matrix and fill it
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                 matrix[i][j] = i + "."+  j;
            }
        }

        //loop through matrix and print
//        for (int i = 0; i < rowCount; i++) {
//            for (int j = 0; j < colCount; j++) {
//                System.out.println(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
