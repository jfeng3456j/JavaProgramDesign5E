package BuildJavaPrograms.Chapter_14_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class SumUpQueueMain {
    public static void main (String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Random ran = new Random();
        for (int i = 0; i < 10; i ++) {
            q.add(ran.nextInt(100));
        }

        int j = 0;
        int sum = 0 ;
        System.out.println("queue " + q);
        while (!q.isEmpty()) {
            int n = q.remove();
            sum += n;
        }
        System.out.println("sum of the queue is " + sum);


    }
}
