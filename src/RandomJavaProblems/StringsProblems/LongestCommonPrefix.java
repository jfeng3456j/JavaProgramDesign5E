package RandomJavaProblems.StringsProblems;

public class LongestCommonPrefix {
    public static void main(String[] args)
    {
        String one = "Like one said hello";
        String two = "Like and Subcribe hello";

        //output is Like
        System.out.println("Longet commone prefix substring is: " + longetCommonPrefix(one, two));
    }

    public static String longetCommonPrefix(String one, String two)
    {
        if ((one == null || one.isEmpty()) || (two == null || two.isEmpty()))
        {
            return "";
        }

        int commonPrefixLength = 0;

        int minLength = Math.min(one.length(), two.length());

        while (commonPrefixLength <= minLength
                && Character.isLetter(one.charAt(commonPrefixLength)) && Character.isLetter(two.charAt(commonPrefixLength))
                && one.charAt(commonPrefixLength) == two.charAt(commonPrefixLength))
        {
            commonPrefixLength++;
        }
        System.out.println("what is commone prefix:" + commonPrefixLength);
        return one.substring(0, commonPrefixLength);
    }
}
