package BuildJavaPrograms.Chapter_10_ArrayList;

public class ComparableInterface  {

    public static void main (String[] args) {
        //Integer class implements the comparable class
        Integer x = 7;
        Integer y = 42;
        Integer z = 7;
        System.out.println(x.compareTo(y));
        System.out.println(x.compareTo(z));
        System.out.println(y.compareTo(x));
    }
}
