package BuildJavaPrograms.Chapter_12_Recursion.queens1;

public class Board {
    private int[] board;
    private static final int UNASSIGNED = 100; //unassigned column

    public Board(int size) {
        if (size < 0) {
            throw new IllegalArgumentException();
        }

        board = new int[size];
        for(int i = 0; i < size; i++) {
            board[i] = 100;
        }
    }


    /**
     * return true if safe place to a queen
     */
    public boolean safe(int row, int col) {
        //set row and col to array range (0...size - 1);
        row--;
        col--;

        //check of row && col in bound
        if (!legal(row,col)) {
            throw new IllegalArgumentException();
        }

        //check current col is empty
        if (board[col] != UNASSIGNED) return false;

        //check for conflicts with other col
        for (int currCol = 0; currCol < board.length; currCol++) {
            int distance = col - currCol;

            //check diagonally
            if (board[currCol] == row - distance) return false;
            //check row
            if (board[currCol] == row) return false;
            //check other diagonally conflict
            if (board[currCol] == row + distance) return false;

        }
        return true;
    }

    //pleace queen at position (row, col)

    public void place(int row, int col) {
        if (!safe(row, col)) {
            throw new IllegalArgumentException();
        }

        board[col -1] = row - 1;
    }


    //remove queen at position (row, col)
    public void remove(int row, int col) {
        if (!legal(row - 1, col - 1) || board[col - 1] != row - 1)
            throw new IllegalArgumentException();
        board[col - 1] = UNASSIGNED;
    }

    //return size of board
    public int size() {
        return board.length;
    }

    //display
    public void print() {

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (board[col] == row)
                    System.out.print(" Q ");
                else
                    System.out.print(" - ");

            }
            System.out.println();
        }
    }


    private boolean legal(int row, int col) {
        return row >= 0 && row < board.length && col >=0 && col < board.length;
    }

}
