package BuildJavaPrograms.Chapter_15_Implement_Collection;


public class ArrayIntListIteratorMain {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 7};
        ArrayIntList arrayIntList = new ArrayIntList();

        for (int num: arr) {
            arrayIntList.add(num);
        }

        //create an iterator
        ArrayListIterator iterator = arrayIntList.iterator();
        int product = 1;

        while(iterator.hasNext()) {
            int n = iterator.next();
            product *= n;
        }

        System.out.println("product = " + product);

    }
}
