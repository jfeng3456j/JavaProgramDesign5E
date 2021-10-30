package BuildJavaPrograms.Chapter_16_LinkedList;

public class ConstructLinkedListMain {
    //construct and prints the list [3,7,12]
    public static void main (String[] args) {
        ListNode list = new ListNode();
        list.val = 3;
        list.next = new ListNode();
        list.next.val = 7;
        list.next.next = new ListNode();
        list.next.next.val = 12;
        list.next.next.next = null;

        System.out.println(list.val + " " + list.next.val + " " + list.next.next.val);


        //the above code can be shorten using listnode constructor
        ListNode list2 = new ListNode(3, new ListNode(7, new ListNode(12 ,null)));
        System.out.println(list2.val + " " + list2.next.val + " " + list2.next.next.val);


        //remove listnode(3) -> 7,12
        list2 = list2.next;
        System.out.println(list2.val + " " + list2.next.val);

        //traverse list
        ListNode current = list;
        while( current != null) {
            System.out.println("values in the list are " + current.val);
            current = current.next;
        }
    }
}
