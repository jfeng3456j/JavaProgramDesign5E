package RandomJavaProblems.heap;

public class HeapApp {
    public static void main(String[] args) {

        HeapImplementation a = new HeapImplementation();
        int[] arr = {10, 7, 11, 30, 20, 38, 2, 45};

        a.insertNewValue(arr[0]);
        a.insertNewValue(arr[1]);
        a.insertNewValue(arr[2]);

        System.out.println(a.getMax());

        a.insertNewValue(arr[3]);
        a.insertNewValue(arr[4]);
        System.out.println(a.getMax());

        a.insertNewValue(arr[5]);
        System.out.println(a.getMax());

        a.insertNewValue(arr[6]);
        a.insertNewValue(arr[7]);
        System.out.println(a.getMax());

        a.removeMax();
        System.out.println(a.getMax());

        a.buildMaxHeap(arr);

    }
}
