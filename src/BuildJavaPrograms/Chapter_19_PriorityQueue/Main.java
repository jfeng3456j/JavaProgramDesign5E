package BuildJavaPrograms.Chapter_19_PriorityQueue;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {

    public static void main (String[] args) {
        PriorityQueue<Student> studentQ = new PriorityQueue<>();

        //use collections.reverseOrder
//        PriorityQueue<Student> studentReverse = new PriorityQueue<>(Collections.reverseOrder());

        studentQ.add(new Student("joe", 1));
        studentQ.add(new Student("jay", 10));
        studentQ.add(new Student("joey", 6));
        studentQ.add(new Student("james", 9));
        studentQ.add(new Student("joy", 2));
        studentQ.add(new Student("jane", 4));

        System.out.println("size of the queue is " + studentQ.size());

        Iterator<Student> ite = studentQ.iterator();
        while(ite.hasNext()) {
            System.out.println("The item in the queue is" + studentQ.poll().toString());
        }
    }




}
