package BuildJavaPrograms.Chapter_7_Arrays.ProgramProjects.largeint;

import java.util.Scanner;

public class AddMaxInt {

    public static void main(String[] args) {
        String question = "1. Java’s type int has a limit on how large an integer it can store. This limit can be circumvented by representing an\n" +
                "integer as an array of digits. Write an interactive program that adds two integers of up to 50 digits each.";

        System.out.println(question);
        System.out.println();

        Scanner input = new Scanner(System.in);

        LargeInteger l1 = new LargeInteger(getInt(input));
        LargeInteger l2 = new LargeInteger(getInt(input));

        LargeInteger result = LargeInteger.add(l1, l2);

        System.out.println("the result is " + result.toString());

    }

    private static String getInt(Scanner input) {
        System.out.print("Integer: ");

        String n = input.next();

        while (!isValidPositiveInt(n)) {
            System.out.println("Please enter a positive integer: ");
            n = input.next();
        }

        return n;
    }

    public static boolean isValidPositiveInt(String n) {
        for (int i = 0; i < n.length(); i++) {
            if (!Character.isDigit(n.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
