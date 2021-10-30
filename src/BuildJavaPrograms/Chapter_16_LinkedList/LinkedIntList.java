package BuildJavaPrograms.Chapter_16_LinkedList;

public class LinkedIntList {

    private ListNode front;

    public LinkedIntList() {
        front = null;
    }

    //post: add to the end of the list
    public void add(int value) {

        if (front == null) {
            front = new ListNode(value, null);
        } else {
            ListNode current = front;

            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value, null);
        }
    }

    //post: add to the list given an index
    public void add(int index, int value) {
        //add to the front of the list
        if (index == 0) {
            front = new ListNode(value, front);
        }
        //add to list by index
        else {
            ListNode current = front;
            for (int i = 0 ; i < index - 1; i++) {
                current = current.next;
            }

            current.next = new ListNode(value, current.next);
        }
    }

    public void addToSortList(int value) {
        //add to the front
        if (front == null || value < front.val) {
            front = new ListNode(value, front);
        } else {
            ListNode current = front;

            while (current.next != null && current.next.val < value) {
                current = current.next;
            }


            //if current is null, then this code will run
            current.next = new ListNode(value, current.next);

        }
    }

    //post: remove from list given an index
    public void remove(int index) {
        //remove from the front
        if (index == 0 ) {
            front = front.next;
        }
        //remove from list by index
        else {
            ListNode current = front;
            for (int i = 0; i < index - 1; i++) {
             current = current.next;
            }
            current.next = current.next.next;
        }
    }

    //post: return a value at a given index
    public int get(int index) {
        ListNode current = front;
        for (int i = 0 ; i < index; i++) {
            current = current.next;
        }

        return current.val;
    }

    //toString()
    public String toString() {

        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.val;
            ListNode current = front.next;

            while (current != null) {
                result += "," + current.val;
                current = current.next;
            }

            result += "]";
            return result;
        }
    }

}
