package BuildJavaPrograms.Chapter_11_Collections;

import java.util.HashSet;
import java.util.Set;

public class SetDifference {
    public static void main (String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("1");
        set1.add("2");
        set1.add("3");

        set2.add("1");
        set2.add("2");
        set2.add("4");

        totalElements(set1,set2);
    }

    public static int totalElements(Set<String> set1, Set<String> set2) {
        Set<String> union = new HashSet<>(set1);
        union.removeAll(set2);
        System.out.printf("return unique elements in left sets not in right  %s", union);
        return union.size();
    }
}
