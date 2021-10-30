package BuildJavaPrograms.Chapter_12_Recursion;

public class GCDMain {


    public static void main (String[] args) {
        System.out.println(findGreatestCommonDivider(4, 0));
    }

    public static int findGreatestCommonDivider(int x , int y) {

        if (Math.min(x, y) == 0) {
            return Math.max(x,y);
        }

        if ((y > x)) {
            return findGreatestCommonDivider(x, y % x);
        } else {
            return findGreatestCommonDivider(x % y, y );
        }
    }
}
