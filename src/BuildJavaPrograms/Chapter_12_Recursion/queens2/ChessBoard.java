package BuildJavaPrograms.Chapter_12_Recursion.queens2;

public class ChessBoard {

    private int[][] board;
    private int numQueens;

    public ChessBoard() {

        numQueens = 0;
        //8 x 8 2d array
        board = new int[8][8];

        //set cell to 0
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                board[row][col] = 0;
            }
        }
    }

    public int getNumQueens() {
        return numQueens;
    }

    public void start() {

        solve(0);

    }

    public int validMove(int x, int y) {
        for (int row = 0; row < board.length; row++) {

            if (get(x,row) == 1) {
                //invalid move
                return -1;
            }

             if (get(row,y) == 1) {
                 return -1;
             }

        }
        //diagonal
        for (int row = 0; row < board.length; row++) {
            if (get(x - row, y - row) == 1) return -1;

            if (get(x - row, y + row) == 1) return -1;

            if (get(x + row, y - row) == 1) return -1;

            if (get(x + row, y + row) == 1) return -1;

        }

        //valid
        return 0;
    }

    public boolean solve(int numQueens) {
        if (numQueens == 8) {
            System.out.println("DONE");
            this.print();
            return true;
        } else {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 8; k++) {
                    if (validMove(j, k) == 0) {
                        this.placeQueen(j, k, 0);
                        numQueens++;

                        if (solve(numQueens)) {
                            return true;
                        } else {
                            this.placeQueen(j, k, 1);
                            numQueens--;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int placeQueen(int x, int y, int cell) {

        if (cell == 0){
            board[x][y] = 1;
            numQueens++;
            return 0;
        }

        //backtracking
        else if (cell == 1){
            board[x][y] = 0;
            return 0;
        }

        System.out.println("wrong cell");
        return -3;
    }

    public int get(int x, int y) {
        if (x < 0 || x > board.length -1  || y < 0 || y > board.length - 1) {
            return -1;
        }
        return board[x][y];
    }

    public void print() {
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board.length; col++) {

                System.out.print(get(row,col) + " ");
            }
            System.out.println();
        }
    }
}
