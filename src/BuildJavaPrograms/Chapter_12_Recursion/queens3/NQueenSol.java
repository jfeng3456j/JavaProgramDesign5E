package BuildJavaPrograms.Chapter_12_Recursion.queens3;

public class NQueenSol {

    public static void main(String[] args) {

        NQueenSol nqs = new NQueenSol();

        nqs.initialize();
    }

    //https://www.youtube.com/watch?v=eMkqz0pxb1s
    private void initialize() {
        // 4x4
        int[][] board = {
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
        };

        if (findSol(board, 0) == false) {
            System.out.println("No solution exists");
        }
        printBoard(board);
    }

    private boolean findSol(int[][] board, int col) {
        //if col reaches to the end of board, this means we have a solution
        if (col >= board.length) {
            return true;
        }

        //recursive call
        for(int row = 0; row < board.length; row++) {
            //make decision
            if (placeQueenOrNot(board, row, col) == true) {
                board[row][col] = 1;

                //explore
                if (findSol(board, col + 1) == true) {
                    return true;
                }

                //backtracking reset cell to 0;
                board[row][col] = 0;
            }
        }

        return false;

    }

    private boolean placeQueenOrNot(int[][] board, int row, int col) {
        //col
        for(int i = 0; i < col; i++) {
            if (board[row][i] == 1) return false;
        }

        //left top diag
        for(int i = row, j = col ; i>= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }

        //left bottom diag
        for(int i = row, j = col; j > 0 && i < board.length; i++, j--) {
            if (board[i][j] == 1) return false;
        }

        return true;
    }

    private void printBoard(int[][] board) {

        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {

                if (board[row][col] == 0) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" Q ");
                }
            }
            System.out.println();
        }
    }
}
