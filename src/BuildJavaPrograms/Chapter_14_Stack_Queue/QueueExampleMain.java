package BuildJavaPrograms.Chapter_14_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExampleMain {

    public static void main (String[] args) {
        String[] data = {"to", "be", "or", "not","to","be"};
        Queue<String> q = new LinkedList<String>();

        for (String str: data) {
            q.add(str);
        }

        System.out.println("queue = " + q);
        System.out.println("size = " + q.size());
        System.out.println("peek = " + q.peek());

        while(!q.isEmpty()) {
            System.out.println(q.remove() + " ");
        }
        System.out.println();
    }
}
