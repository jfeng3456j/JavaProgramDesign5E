package RandomJavaProblems.StringsProblems;

import java.util.HashSet;
import java.util.Set;

//LC 1062
public class LCLongestRepeatingSubstring {

    public static void main(String[] args)
    {
            String input = "abbaba"; // return bb or ab
            System.out.println("Longest Repeating Substring Using Brute Force: " + bruteForce(input));
    }

    public static String bruteForce(String input)
    {
        if (input == null || input.isEmpty())
        {
            return "";
        }

        int n = input.length();

        for (int Len = n - 1; Len >= 1; Len--)
        {
            System.out.println("Len value :" + Len);
            Set<String> seen = new HashSet<>();

            for (int i = 0; i <= n - Len; i++)
            {
                System.out.println("i value: " + i);
                int endIndex = i + Len;
                String part = input.substring(i, endIndex);
                System.out.println("part value: " + part);
                if (seen.contains(part))
                {
                    return part;
                }
                seen.add(part);
            }

        }

        return "";
    }
}
