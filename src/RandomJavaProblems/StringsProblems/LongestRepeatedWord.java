package RandomJavaProblems.StringsProblems;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatedWord {
    public static void main(String[] args)
    {
        String word = "watching a long long video to pass a day by day";
        System.out.println("Longest Repeated Word: " + longestRepeatedWord(word));
    }

    public static String longestRepeatedWord(String word)
    {
        if (word == null || word.isEmpty())
        {
            return "";
        }

        String longestWord = "";
        String[] words = word.toLowerCase().split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String w: words)
        {
            wordCount.put(w, wordCount.getOrDefault(w, 0)+1);

            if (wordCount.get(w) > 1 && w.length() > longestWord.length())
            {
                longestWord = w;
            }
        }
        return longestWord;
    }
}
