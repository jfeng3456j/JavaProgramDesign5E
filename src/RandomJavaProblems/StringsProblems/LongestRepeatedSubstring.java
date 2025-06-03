package RandomJavaProblems.StringsProblems;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatedSubstring {
    public static String longestRepeatedSubstring(String s) {
        int n = s.length();
        String longest = "";

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String substring = s.substring(i, j);
                if (s.indexOf(substring, j) != -1 && substring.length() > longest.length()) {
                    longest = substring;
                }
            }
        }

        return longest;
    }


    public static String longestRepeatedSubstringContain(String word)
    {
        if (word == null || word.isEmpty())
        {
            return "";
        }

        String[] words = word.toLowerCase().split("\\s+");
        String repeatedLongWord = "";

        for (String s : words) {
            String currentWord = s.replaceAll("[^a-z]", "");

            for (int j = 1; j < words.length; j++) {
                String nextWord = words[j].replaceAll("[^a-z]", "");
                if (currentWord.contains(nextWord) && currentWord.length() > repeatedLongWord.length()) {
                    repeatedLongWord = currentWord;
                    continue;
                }
            }
        }

        return repeatedLongWord;
    }

    public static void main(String[] args) {
        //String input = "banana";
        //System.out.println("Longest Repeated Substring: " + longestRepeatedSubstring(input));

        //String input2 = " a test tested string with repeated repeated words"; //output repeat
        //System.out.println("Longest Repeated Substring using Map: " + longestRepeatedWordMap(input2));

        String input3 = "repeated repeated words is a test test"; //output repeat
        System.out.println("Longest Repeated Substring containing: " + longestRepeatedSubstringContain(input3));
    }
}
