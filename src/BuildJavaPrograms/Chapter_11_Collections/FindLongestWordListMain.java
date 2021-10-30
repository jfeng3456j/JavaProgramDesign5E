package BuildJavaPrograms.Chapter_11_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindLongestWordListMain {

    public static void main (String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("World");
        wordList.add("Hi");
        wordList.add("Thank you");
        wordList.add("Work Harder Dude");
        wordList.add("Keep biting the bullet");

        System.out.printf("The longest element in the list is -> %s" , findLongestList(wordList));

    }

    public static String findLongestList(List<String> wordList) {
        Iterator<String> i = wordList.iterator();
        String result = i.next();

        while (i.hasNext()) {
            String next = i.next();

            if (next.length() > result.length()) {
                result = next;
            }
        }

        return result;
    }
}
