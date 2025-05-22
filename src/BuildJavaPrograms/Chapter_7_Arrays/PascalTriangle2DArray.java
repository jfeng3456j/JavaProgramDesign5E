package BuildJavaPrograms.Chapter_7_Arrays;

public class PascalTriangle2DArray {

    public static void main(String[] args) {

        int rowCount = 10;

        printTriangle(rowCount);
    }

    private static void printTriangle(int rowCount) {
        int[][] pascalTriangle = new int[rowCount][];
        for (int i = 0; i < pascalTriangle.length; i++) {
            //create column per row
            pascalTriangle[i] = new int[i + 1];

            //fill the first and last cell with 1
            pascalTriangle[i][0] = 1;
            pascalTriangle[i][i] = 1;

            //fill the middle cell by using previous row cell
            for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
        }

        //print the triangle
        for (int i = 0; i < pascalTriangle.length; i++) {
            for (int j = 0; j < pascalTriangle[i].length; j++) {
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
