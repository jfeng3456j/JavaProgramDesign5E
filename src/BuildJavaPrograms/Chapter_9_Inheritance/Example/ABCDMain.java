package BuildJavaPrograms.Chapter_9_Inheritance.Example;

public class ABCDMain {

    public static void main(String[] args) {
        A[] elements = {new A(), new B(), new C(), new D()};
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
            elements[i].method1();
            elements[i].method2();
            System.out.println();

        }
    }
}
