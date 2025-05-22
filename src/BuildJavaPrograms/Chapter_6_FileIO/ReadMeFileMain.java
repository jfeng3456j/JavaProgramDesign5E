package BuildJavaPrograms.Chapter_6_FileIO;


import java.io.FileNotFoundException;
import java.io.PrintStream;


public class ReadMeFileMain {

    public static void main(String[] args) {
        try {
            PrintStream output = new PrintStream("./src/BuildJavaPrograms/Chapter_6_FileIO/Output_Files/output.txt");
            output.println("Testing,");
            output.println("1,2,3.");
            output.println();
            output.println();
            output.println("this is my output file");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
