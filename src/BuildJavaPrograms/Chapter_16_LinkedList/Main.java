package BuildJavaPrograms.Chapter_16_LinkedList;

import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {
        ListNode p = new ListNode(2, new ListNode(4, new ListNode(4, new ListNode(6, null))));
        ListNode dup = new ListNode(6, new ListNode(6, new ListNode(6, null)));
        ListNode q = new ListNode(3, new ListNode(9, null));

        //change p -> [2,4,6,3]
        //change q -> [9]
//        System.out.println(swapNode(p, q));

        //print p -> [2,4,3]
//        traverseNode(p);

        //add to sortedLink
//        addToSortedList(5,p);
//        addToSortedList(3,p);
//        addToSortedList(0,p);
//        addToSortedList(7,p);
//        System.out.println("what is p after sorted " + p);
//
//
//        System.out.println("Reverse a linklist: " + reverseLinkList(p));

        System.out.println(removeDuplicate(p));

    }

    public static ListNode removeDuplicate(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            while (curr.next != null && curr.val == curr.next.val) {
                curr.next = curr.next.next;
            }

            curr = curr.next;
        }

        return head;
    }


    public static ListNode reverseLinkList(ListNode p) {
        ListNode prev = null;
        ListNode curr = p;
        ListNode next = null;

        while (curr != null) {
            //set next to point to the next node
            next = curr.next;

            //set next node point to the pre
            curr.next = prev;

            //set pre to current node
            prev = curr;

            //iterate through the list until it find a null
            curr = next;

        }

        p = prev;

        return p;
    }

    public static ListNode swapNode(ListNode p, ListNode q) {
        ListNode Head = q.next; //pointer to 9

        if (p.next.next == null) {
//            q.next = null; //destroy the pointer to 9, now q only has 3
            p.next.next = q;
            p.next.next.next = null; //destroy pointer to 9
        }

        q = Head;
        return p;
    }

    public static void traverseNode(ListNode p) {

//        ListNode current = p;

//        while (current != null) {
//            System.out.println("node value is " + current.val);
//            current = current.next;
//        }

        //using for loop
        for (ListNode current = p; current != null; current = current.next) {
            System.out.println("node value is " + current.val);
        }
    }

    public static void addToSortedList(int value, ListNode p) {
        if (p == null || p.val >= value) {
            p = new ListNode(value, p); //creates a new object without no reference object
        } else {
            ListNode prev = p;
            ListNode current = p;

            //traverse the list
            while (current.next != null && current.next.val < value) {
                prev = current;
                current = current.next;

            }
            prev.next = new ListNode(value, prev.next);
        }
    }

}

