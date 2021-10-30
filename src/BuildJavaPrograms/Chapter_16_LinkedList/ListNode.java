package BuildJavaPrograms.Chapter_16_LinkedList;

public class ListNode {
    int val;
    public ListNode next;

    //post: construct a node with data 0 and null link
    public ListNode() {
        this(0, null);
    }

    //post: constructs a node with given data and null link
    public ListNode(int data) {
        this(data, null);
    }

    //post: construct a node with given data and give link
    public ListNode(int data, ListNode next) {
        this.val = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
