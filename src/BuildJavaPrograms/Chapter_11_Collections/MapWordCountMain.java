package BuildJavaPrograms.Chapter_11_Collections;

import java.util.Map;
import java.util.TreeMap;

public class MapWordCountMain {

    public static void main (String[] args) {
        String sentence = "it is a great day today, today, is sun day";
        System.out.println(getWordCount(sentence));
    }

    public static Map<String, Integer> getWordCount(String sentence) {
        String[] arr = sentence.replaceAll(",","").split("[\\s+,]");
        Map<String, Integer> wordCount = new TreeMap<>();
        for (String word : arr) {

             if (wordCount.containsKey(word)) {
                 int count = wordCount.get(word);
                 wordCount.put(word, count+1);
             } else {
                 wordCount.put(word, 1);
             }
        }

        return wordCount;
    }
}
