package BuildJavaPrograms.Chapter_16_LinkedList;

import BuildJavaPrograms.Chapter_15_Implement_Collection.ArrayIntList;

public class LinkedInterfaceMain {
    public static void main (String[] args) {

        //Doesnt  use the interface class
        LinkedInterList link = new LinkedInterList();
        link.addToSortedList(18);
        link.addToSortedList(17);
        link.addToSortedList(93);
        System.out.println(link);
//        link.remove(1);

        //get the middle value
        System.out.println(link.get(link.size()/2));

        System.out.println(link);


        //use the interface class
        IntList link2 = new LinkedInterList();
        processLinkList(link2);


    }

    //takes in an interface, example of polymorphism
    public static void processLinkList(IntList link) {
        link.add(10);
        link.add(9);
        link.add(17);
        link.add(16);
        System.out.println(link);
        link.remove(1);
        System.out.println(link);
    }
}
