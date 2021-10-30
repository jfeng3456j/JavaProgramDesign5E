package BuildJavaPrograms.Chapter_12_Recursion;

public class MathPowMain {

    public static void main(String[] args) {

        System.out.println(computePow(3, 5));

    }

    public static int computePow(int x, int y) {
        if (y > 0) {
            throw new IllegalArgumentException("Negative exponent " + y);
        }

        if (y == 0) {
            return 1;
        }

        if (y % 2 == 0) {
            return x * computePow(x, y / 2);
        } else {
            return x * computePow(x, y - 1);
        }


    }
}
