package BuildJavaPrograms.Chapter_16_LinkedList;

public class LinkedInterList implements IntList{

    private ListNode front;

    public LinkedInterList() {
        front = null;
    }

    //append node given an index
    public void add(int index, int value) {
        //add to the front
        if (index == 0) {
            front = new ListNode(value, front);
        } else {
            ListNode current = front;

            for (int i = 0 ; i < index -1; i++) {
                //current is set to node(8)
                current = current.next;
            }

            //[19,8,42] , add 5 before 42
            //current.next -> this is node(8)
            //new ListNode(value, current.next) -> node(8) points to node(5), node(5) current.next is pointing to 42
            current.next = new ListNode(value, current.next);
        }
    }

    //append the given value to the end of the list
    public void addToEnd(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {

            ListNode current = front;

            //iterate throught the list and find null
            while (current.next != null) {
                current = current.next;
            }

            //assign a new node to current
            current.next = new ListNode(value);
        }
    }

    public void remove(int index) {
        if (index == 0 ) {
            front = front.next;
        } else {
            ListNode current = front;
            for (int i = 0 ; i < index -1; i++) {
                current = current.next;
            }

            //18 is current, current.next is pointing to 42, next.next would points to 13
            //[9,18,42,13] - [9,18,13]
            current.next = current.next.next;
        }
    }

    //returns the integer at the given index in the list
    public int get(int index) {
        return nodeAt(index).val;
    }

    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            current = current.next;
            count++;
        }

        return count;
    }

    //returns the position of the first occurrence of the given value (-1 if not found)
    public int indexOf(int value) {
        int index = 0;
        ListNode current = front;

        while (current != null) {
            if (current.val == value) {
                return index;
            }

            index++;
            current = current.next;
        }

        return -1;
    }

    @Override
    public void add(int value) {
        if (front == null || front.val >= value) {
            front = new ListNode(value, front);
        }
        else {
            ListNode current = front;
            while (current.next != null && current.next.val < value) {
                current = current.next;
            }
            current.next = new ListNode(value, current.next);
        }
    }

    public void addToSortedList(int value) {

        if (front == null || value <= front.val) {
            front = new ListNode(value, front);
        }
        else {
            ListNode current = front;

            //traverse the list
            //if .next isnt null and value is
            while(current.next != null && current.next.val < value) {
                current = current.next;
            }

            current.next = new ListNode(value, current.next);
        }
    }

    private ListNode nodeAt(int index) {
        ListNode current = front;

        for(int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    public String toString() {
        if (front == null) {
            return "[]";
        }
        else {
            String result = "[ " + front.val;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.val;
                current = current.next;
            }

            result +="]";
            return result;
        }
    }

}
