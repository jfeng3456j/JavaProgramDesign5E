package BuildJavaPrograms.Chapter_11_Collections;

import java.util.*;

public class DuplicateLinkedListMain {

    public static void main (String[] args) {

        LinkedList<Integer> numList = new LinkedList<>(
                Arrays.asList(1, 1, 1, 3, 3, 5, 5, 5, 5, 5, 7, 7, 11)
        );

        System.out.println(findDuplicate(numList));

    }

    public static Map<Integer, Integer> findDuplicate(List<Integer> list) {
        Map<Integer, Integer> duplicateMap = new TreeMap<>();
        Iterator<Integer> iterator = list.iterator();
        //find the 1st element in the linkedlist
        int prev = iterator.next();

        while (iterator.hasNext()) {
             int next = iterator.next();
              if (prev == next) {
                  if (duplicateMap.containsKey(prev)) {
                      int count = duplicateMap.get(prev);
                      duplicateMap.put(prev, count+1);
                  } else {
                      duplicateMap.put(prev, 1);
                  }

              } else {
                  duplicateMap.put(next, 0);
              }
              prev = next;
        }
        return duplicateMap;
    }
}
