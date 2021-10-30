package BuildJavaPrograms.Chapter_7_Arrays;

public class ReverseStringMain {

    public static void main (String[] args) {
        String word = "mississippi";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            /**
             * 1st result = m
             * 2nd word.charAt(1) = i
             * i +m = im
             * 3rd word.charAt(2) = s
             * s+im = sim
             */
            result = word.charAt(i) + result;
        }

        System.out.printf("%s " , result);

    }
}
