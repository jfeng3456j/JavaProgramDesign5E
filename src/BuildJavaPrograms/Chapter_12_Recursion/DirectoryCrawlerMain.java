package BuildJavaPrograms.Chapter_12_Recursion;

import java.io.File;
import java.util.Scanner;

public class DirectoryCrawlerMain {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a file or directory name");
        String name= input.next();
        File f = new File("./src/" + name);
        if (!f.exists()) {
            System.out.println("No such file/directory");
        } else {
            print(f, 0);
        }
    }

    public static void print(File f, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print(" ");
        }

        System.out.println(f.getName());

        if (f.isDirectory()) {
            for (File subFile: f.listFiles()) {
                print(subFile, level + 1);
            }
        }
    }
}
