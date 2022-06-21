package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

public class MagicSquare {

    public static void main(String[] args) {

        String question = "Write a method called isMagicSquare that accepts a two-dimensional array of integers as a parameter and returns true\n" +
                "if it is a magic square. A square matrix is a magic square if all of its row, column, and diagonal sums are equal. For\n" +
                "example, [[2, 7, 6], [9, 5, 1], [4, 3, 8]] is a square matrix because all eight of the sums are exactly 15.";

        int[][] magicNum = {
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}
        };

        boolean isMagicNum = findMagicNum(magicNum);

        System.out.println("check if sum of row, column and diagonal are all equal: " + isMagicNum);
    }

    private static boolean findMagicNum(int[][] magicNums) {

        if (magicNums  == null) throw new NullPointerException();

        if (magicNums.length < 1) return true;

        //make sure row length is same as col length
        for(int i = 0; i < magicNums.length; i++) {
            if (magicNums.length != magicNums[i].length) return false;
        }

        int rSum = 0;
        int dSum = 0;

        //row sum
        for (int i = 0; i < magicNums[0].length; i++) {
            rSum += magicNums[0][i];
        }

        //check row sum with every row sum
        for (int i = 1; i < magicNums.length; i++) {
             int sum = 0;

             //add up row sum
             for (int j = 0; j < magicNums[i].length; j++) {
                 sum += magicNums[i][j];
             }

             if (rSum != sum) return false;
        }

        //check row sum with every column sum
        for (int col = 0; col < magicNums.length; col++) {
            int sum = 0;

            for (int row = 0; row < magicNums.length; row++) {
                sum += magicNums[row][col];
            }

            if (rSum != sum) return false;
        }

        //diagonal 1
        /*
        * [2,0,0]
        * [0,5,0]
        * [0,0,8]
        * */
        for (int row = 0; row < magicNums.length; row++) {
             dSum += magicNums[row][row];
        }

        if (rSum != dSum) return false;

        dSum = 0;
        for (int row = 0; row < magicNums.length; row++) {
            dSum += magicNums[row][magicNums.length - row - 1];
        }

        if (rSum != dSum) return false;

        return true;

    }
}
