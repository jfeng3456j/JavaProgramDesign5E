package RandomJavaProblems.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueMaxHeap {

    public static void main (String[] args) {
        int[] arr = {10,7,11,5,2,13,1,45};
        PriorityQueueMaxHeap.maxHeap(arr);
        PriorityQueueMaxHeap.minHeap(arr);


    }

    public static void minHeap(int[] arr) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        System.out.print("min heap: ");
        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
            System.out.print( heap.peek() + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            heap.poll();
            System.out.print( heap.peek() + " ");
        }
    }
    public static void maxHeap(int[] arr) {
        //add
        //poll - remove
        //peek - check top value
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        System.out.print("max heap: ");
        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
            System.out.print(heap.peek() + " ");
        }

        System.out.println();

    }
}
