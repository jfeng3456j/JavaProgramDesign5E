package BuildJavaPrograms.Chapter_12_Recursion;

public class PrintStartMain {
    public static void main(String[] args) {
        printRecursivelyStart(1);
    }

    public static void printRecursively(int n) {
        //base case
        if (n == 0 ) {
            return;
        }

        System.out.print(n + " ");
        printRecursively(n - 1);
    }

    public static void printRecursivelyStart(int n) {
        //base case
        if (n >= 10) {
            return;
        }
        printRecursively(n);
        System.out.println();
        printRecursivelyStart(n + 1);
    }
}
