package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

import java.util.Arrays;

public class MultiDimensionArray {

    public static void main(String[] args) {
        String pr_description = "What elements does the array numbers contain after the following code is executed?";
        System.out.println("Problem description: " + pr_description);

        int[][] num = new int[3][4];

        for (int r = 0; r < num.length; r++)
        {
            for (int col = 0; col < num[r].length; col++)
            {
                num[r][col] = r + col;
            }
        }

        System.out.println("2d array values are: " + Arrays.deepToString(num));
    }
}
