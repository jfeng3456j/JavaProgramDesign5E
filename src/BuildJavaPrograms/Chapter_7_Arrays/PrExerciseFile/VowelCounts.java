package BuildJavaPrograms.Chapter_7_Arrays.PrExerciseFile;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class VowelCounts {

    public static void main(String[] args) {
        String question = "Write a method called vowelCount that accepts a String as a parameter and produces and returns an array of inte\u0002gers representing the counts of each vowel in the string. The array returned by your method should hold five elements: the first is the count of As, the second is the count of Es, the third Is, the fourth Os, and the fifth Us. Assume\n" +
                "that the string contains no uppercase letters. For example, the call vowelCount(\"i think, therefore i am\")\n" +
                "should return the array [1, 3, 3, 1, 0].";

        int[] vowelCounts = vowelCounts("i'm think, :therefore i a'm");

        System.out.println("counts of vowels in the string are: " + Arrays.toString(vowelCounts));


        System.out.println("use map counts of vowels in the string are: " + Arrays.toString(vowelCountsMap("i'm think, :therefore i a'm")));

    }

    private static int[] vowelCounts(String s) {

        int[] vowels = new int[5];

        if (s.length() < 1) return vowels;

        //conver to lowercase, remove special characters
//      String newS = s.toLowerCase().replaceAll("[^{a-zA-Z0-9}\\s+]", "");

        //convert to charArray
        char[] chars = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();

        System.out.println(Arrays.toString(chars));

        //loop through the char arr and find all vowels and add them up

        for(int i = 0; i < chars.length; i++) {
            switch(chars[i]) {
                case 'a':
                    vowels[0] +=1;
                    break;
                case 'e':
                    vowels[1] +=1;
                    break;
                case 'i':
                    vowels[2]+=1;
                    break;
                case 'o':
                    vowels[3] +=1;
                    break;
                case 'u':
                    vowels[4] +=1;
                    break;
                default: break;
            }
        }
        return vowels;
    }

    private static int[] vowelCountsMap(String s) {
        int[] vowels = new int[5];

        if (s.length() < 1) return vowels;

        //convert to lowercase and remove spcial characters
        String newString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");

        //<char, count>
        Map<Character, Integer> map = new HashMap<>();

        for(char ch: newString.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("map " + map.toString());

        for(char ch: map.keySet()) {
            switch (ch)
                {
                    case 'a':
                        vowels[0] += map.get('a');
                        break;
                    case 'e':
                        vowels[1] += map.get('e');
                        break;
                    case 'i':
                        vowels[2]+= map.get('i');
                        break;
                    case 'o':
                        vowels[3] += map.get('o');
                        break;
                    case 'u':
                        vowels[4] +=map.get('u');
                        break;
                    default: break;
                }
        }

        return vowels;
    }
}
