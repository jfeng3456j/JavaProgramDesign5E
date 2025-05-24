package BuildJavaPrograms.Chapter_4_Conditions.PrExerciseFiles;

public class RepeatString {

    public static void main (String[] args)
    {
        String pr_description = "Write a method called repl that accepts a String and a number of repetitions as parameters and returns the\n" +
                "String concatenated that many times. For example, the call repl(\"hello\", 3) should return\n" +
                "\"hellohellohello\". If the number of repetitions is zero or less, the method should return an empty string.";

        System.out.println("Problem description: " + pr_description);

        System.out.println("Repeat string by x times: " + repeatString("hello", 3));

    }

    public static String repeatString(String input, int times)
    {
        String repString = "";
        if (times < 1)
        {
            return "";
        }

        while (times > 0)
        {
            repString = repString.concat(input);

            times--;
        }

        return repString;
    }
}
