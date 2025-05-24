package RandomJavaProblems.StringsProblems;

public class CapitalizeFirstChar {
    public static void main (String[] args)
    {
        String pr_description = "Convert first letter in each words in a given sentence:";
        System.out.println("Problem description: " + pr_description);

        String words = "hello, today is a ' good o'ld day!";

        System.out.println("Capitalize each starting character in word: " + capitalizeFirstChar(words));

    }

    public static String capitalizeFirstChar(String words)
    {
        // check edge cases: null or empty input
        if (words == null || words.isEmpty())
        {
            return "";
        }

        // split string by space and store each word into an array
        String[] wordsArray = words.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word: wordsArray)
        {
            // check if word is not empty and character is a letter
            if (!word.isEmpty() && Character.isLetter(words.charAt(0)))
            {
                // apply logic: case conversion
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                sb.append(word).append(" ");
            }
        }

        // trim off the last space
        return sb.toString().trim();
    }
}
