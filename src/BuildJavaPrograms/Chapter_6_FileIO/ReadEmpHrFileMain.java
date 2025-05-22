package BuildJavaPrograms.Chapter_6_FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadEmpHrFileMain {

    public static void main (String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/BuildJavaPrograms/Chapter_6_FileIO/Input_Files/emp.dat"));
            calculateEmpHr(input);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void calculateEmpHr(Scanner input) {
        while (input.hasNext()) {
            String name = input.next();
            double sum = 0.0;
            while (input.hasNextDouble()) {
                sum += input.nextDouble();
            }

            System.out.println("Total hours word by " + name + " = " + sum);
        }
    }
}
