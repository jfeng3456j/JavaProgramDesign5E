package BuildJavaPrograms.Chapter_12_Recursion;

public class SumUpArrayRecursively {

    public static void main (String[] args) {
        int[] num = {3,4,5,6,7,8};
        System.out.println(sum(num));
    }

    public static int sum(int[] num) {
       return sum(num, 0);
    }

    public static int sum(int[] num, int index) {
        if (index == num.length) {
            return 0;
        }

        return num[index] + sum(num, index + 1);
    }
}
