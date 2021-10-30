package BuildJavaPrograms.Chapter_7_Arrays;

public class PascalTriangleMultiArrayMain {

    public static void main (String[] args) {
        int[][] pascalTri = new int[7][];

        fillIn(pascalTri);
        print(pascalTri);
    }

    public static void fillIn(int[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            //i == row, creates a new columns
            triangle[i] = new int[i+1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            //add the middle value which is
            //previous row i with the middle value -1 + middle value
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }
    }

    private static void print(int[][] pascalTri) {
        for (int i = 0; i < pascalTri.length; i++) {
            for (int j = 0; j < pascalTri[i].length; j++) {
                System.out.print(pascalTri[i][j] + " ");
            }
            System.out.println();
        }
    }
}
