package BuildJavaPrograms.Chapter_7_Arrays;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayScoreCountMain {

    public static void main(String[] args) {
        try {

            int[] scoreCount = new int[5];
            //Scanner file = new Scanner(new File("./src/BuildJavaPrograms/Chapter7_Arrays/score.dat"));
            Scanner file = new Scanner(new File("src/BuildJavaPrograms/Chapter_7_Arrays/score.dat"));

            while(file.hasNext()) {
                int score = file.nextInt();
                scoreCount[score]++;

            }

            printScoreCount(scoreCount);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void printScoreCount(int[] scoreCount) {
        for (int n: scoreCount) {
            System.out.println(n);
        }
    }


}
