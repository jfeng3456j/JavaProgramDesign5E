package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

public class MaxtrixAdd {

    public static void main(String[] args) {
        String question = "Write a method called matrixAdd that accepts a pair of two-dimensional arrays of integers as parameters, treats the arrays\n" +
                "as two-dimensional matrixes, and returns their sum. The sum of two matrixes A and B is a matrix C, where for every row i\n" +
                "and column j, Cij =  Aij + Bij. You may assume that the arrays passed as parameters have the same dimensions.";

        int maze[][] = {
                {1,1,1,0},
                {0,0,1,0},
                {1,0,1,0},
                {0,1,1,1}
        };

        int sum = maxtrixAdd(maze);
        System.out.println("the total sum in the maze is " + sum);
    }

    private static int maxtrixAdd(int[][] maze) {
        int sum = 0;

        if (maze == null || maze.length < 1) return sum;

        for(int i = 0; i < maze.length; i++) {

            for (int j = 0; j < maze[i].length; j++) {
                sum += maze[i][j];
            }
        }

        return sum;
    }
}
