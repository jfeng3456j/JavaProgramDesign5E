package BuildJavaPrograms.Chapter_12_Recursion.queens1;

import java.util.Scanner;

public class Queens {

    //https://www.buildingjavaprograms.com/code-files/3ed/ch12/
    public static void main(String[] args) {
        giveIntro();
        Scanner console = new Scanner(System.in);
        System.out.print("What size board do you want to use? ");
        int size = console.nextInt();
        System.out.println();
        Board b = new Board(size);
        solve(b);
    }

    private static void giveIntro() {
        System.out.println("This program solves the classic '8 queens'");
        System.out.println("problem, placing queens on a chessboard so");
        System.out.println("that no two queens threaten each other - horizontally, vertically, diagonally.");
        System.out.println();
    }

    private static boolean explore(Board b, int col) {
        if (col > b.size()) {
            return true;
        }
        else {
            for (int row = 1; row <= b.size(); row++) {
                //make decision
                if (b.safe(row, col)) {
                    b.place(row, col);

                    //explore
                    if (explore(b, col + 1)) {
                        return true;
                    }

                    //undo

                    b.remove(row, col);


                }
            }

            return false;
        }
    }

    public static void solve(Board solution) {
        if (!explore(solution, 1)) {
            System.out.println("No Solution");
        }

        else {
            System.out.println("one solution is as follow: ");
            solution.print();
        }
    }
}
