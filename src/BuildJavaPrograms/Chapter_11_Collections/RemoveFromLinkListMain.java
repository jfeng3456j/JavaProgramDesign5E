package BuildJavaPrograms.Chapter_11_Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveFromLinkListMain {

    public static void main (String[] args) {
        LinkedList<String> wordList = new LinkedList<>();
        wordList.add("Hello");
        wordList.add("NiHao");
        wordList.add("konichiwa");
        wordList.add("Bonjour");
        wordList.add("Hola");

        Iterator<String> itList = wordList.iterator();

        while(itList.hasNext()) {
            if (itList.next().length() % 2 == 0) {
                itList.remove();
            }
        }

        System.out.printf("%s", wordList);

    }
}
