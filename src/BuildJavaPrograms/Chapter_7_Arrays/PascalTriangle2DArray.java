package BuildJavaPrograms.Chapter_7_Arrays;

public class PascalTriangle2DArray {

    public static void main(String[] args) {

        int rowCount = 10;

        int[][] pascalTriangle = createPasacalTriangle(rowCount);

        printTriangle(pascalTriangle);
    }

    private static int[][] createPasacalTriangle(int rowCount)
    {
        int[][] PascalTriangle = new int[rowCount][];

        //create the first row and initiaze it to 1
        for (int row = 0; row < rowCount; row++)
        {
            // create column
            PascalTriangle[row] = new int[row + 1];

            // fill first cell 0:0
            PascalTriangle[row][0] = 1;

            // fill last cell row: row
            PascalTriangle[row][row] = 1;

            //fill the middle with column < Prev row length - 1 or column < row
            for (int col = 1; col < PascalTriangle[row].length -1; col++)
            {
                //System.out.println("what is row length" + );
                // add prev rows - 2 cells [row-1][col-1] [row-1][col] together
                PascalTriangle[row][col] = PascalTriangle[row -1][col - 1] + PascalTriangle[row - 1][col];
            }

        }

        return PascalTriangle;
    }

    private static void printTriangle(int[][] pascalTriangle)
    {
        for (int row = 0; row < pascalTriangle.length; row++)
        {
            for (int col = 0; col < pascalTriangle[row].length; col++)
            {
                System.out.print(pascalTriangle[row][col] + " ");
            }
            System.out.println();
        }
    }

}
