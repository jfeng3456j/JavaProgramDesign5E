package BuildJavaPrograms.Chapter_6_FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadEmpIdHrFileMain {

    public static void main (String[] args ) {
       try {
           Scanner input = new Scanner(new File("./src/BuildJavaPrograms/Chapter_6_FileIO/Input_Files/empId.dat"));
           while (input.hasNextLine()) {
                   String data = input.nextLine();
                    processFile(data);
           }
       } catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
       }

    }

    public static void processFile(String data) {
        Scanner lineData = new Scanner(data);
        double sum = 0.0;
        int id = lineData.nextInt();
        String name = lineData.next();
        while (lineData.hasNextDouble()) {
            sum += lineData.nextDouble();
        }

        System.out.println("Total hours word by " + name + " and id= " + id + " = " + sum);

    }
}
