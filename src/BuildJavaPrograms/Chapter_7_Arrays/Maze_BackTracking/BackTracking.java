package BuildJavaPrograms.Chapter_7_Arrays.Maze_BackTracking;

import java.util.Arrays;

public class BackTracking {

    static boolean isSafe(int[][] maze, int row, int col) {
        return (row < maze.length && col < maze.length && col >= 0 && row >= 0 && maze[row][col] == 1);
    }

    static boolean findPathUtil(int[][] maze, int[][] solu, int row, int col) {
        //base case, get the last row, col
        if (row == maze.length -1 && col == maze.length -1 && maze[row][col] == 1) {
            solu[row][col] = 1;
            return true;
        }

        if (isSafe(maze, row, col)) {
            solu[row][col] = 1;

            //down
            if (findPathUtil(maze, solu, row+1, col)) return true;

            //left
            if(findPathUtil(maze,solu, row, col+1)) return true;

            //backtracking
            solu[row][col] = 0;
            return false;
        }

        return false;
    }

    static void printSolutionMaze(int[][] maze) {
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[row].length; col++) {
                System.out.print(maze[row][col] + " ");
            }
            System.out.println();
        }
    }

    static void findPath(int[][] maze, int n) {
        int[][] solution = new int[n][n];

        //start at 0,0
        if (findPathUtil(maze, solution,0, 0)) {
            //print solution array
            printSolutionMaze(solution);
//            System.out.println(Arrays.deepToString(solution));
        } else {

        }
    }

    public static void main (String[] args) {
        int maze[][] = {
                {1,1,1,0},
                {0,0,1,0},
                {1,0,1,0},
                {0,1,1,1}
        };

        int n = maze.length; //4

        findPath(maze, n);
    }
}
