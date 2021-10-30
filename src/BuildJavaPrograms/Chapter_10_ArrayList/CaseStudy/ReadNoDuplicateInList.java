package BuildJavaPrograms.Chapter_10_ArrayList.CaseStudy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadNoDuplicateInList {

    public static void main (String[] args) {
        try {
            Scanner file1 = new Scanner(new File("./src/BuildJavaPrograms/Chapter_10_ArrayList/CaseStudy/test1.txt"));
            Scanner file2 = new Scanner(new File("./src/BuildJavaPrograms/Chapter_10_ArrayList/CaseStudy/test2.txt"));

            ArrayList<String> inList1 = getWords(file1);
            ArrayList<String> inList2 = getWords(file2);

            System.out.printf("list 1 = %s" , inList1);
            System.out.println();
            System.out.printf("list 2 = %s" , inList2);
            System.out.println();
            System.out.printf("Over Lap words = %s", getOverLap(inList1, inList2));

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static ArrayList<String> getWords (Scanner file) {
        ArrayList<String> wordList = new ArrayList<>();
        ArrayList<String> NoDuplicateList = new ArrayList<>();

        // ignore all but alphabetic characters and apostrophes
        file.useDelimiter("[^a-zA-Z']+");
        while(file.hasNext()) {
            String data = file.next().toLowerCase();
            wordList.add(data);
        }

        Collections.sort(wordList);
        //remove duplicates
        if (wordList.size() > 0) {
            NoDuplicateList.add(wordList.get(0));
        }

        for (int i = 1; i < wordList.size(); i++ ) {
                if (!wordList.get(i).equals(wordList.get(i-1))) {
                    NoDuplicateList.add(wordList.get(i));
                }
        }

        return NoDuplicateList;
    }

    public static ArrayList<String> getOverLap(ArrayList<String> list1, ArrayList<String> list2) {
        int index1 = 0;
        int index2 = 0;
        ArrayList<String> overLapList = new ArrayList<>();

        while (index1 < list1.size() && index2 < list2.size()) {
             int num = list1.get(index1).compareTo(list2.get(index2));
             if (num == 0) {
                 overLapList.add(list1.get(index1));
                 index1++;
                 index2++;
             } else if (num < 0) {
                 index1++;
             } else {
                 index2++;
             }
        }
        return overLapList;
    }
}
