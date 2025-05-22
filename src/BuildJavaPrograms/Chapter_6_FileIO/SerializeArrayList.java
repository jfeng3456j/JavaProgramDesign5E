package BuildJavaPrograms.Chapter_6_FileIO;

import java.io.*;
import java.util.ArrayList;

public class SerializeArrayList {

    public static void main(String[] args) throws Exception {
        //https://howtodoinjava.com/java/collections/arraylist/serialize-deserialize-arraylist/
        System.out.println("Serialize Array Data");
        serializeArrayList();
        System.out.println("Deserialize Array Data");
        deserializeArrayList();
    }

    private static void serializeArrayList() {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("john");
        nameList.add("james");
        nameList.add("jane");
        nameList.add("joey");


        try {
            FileOutputStream outputStream = new FileOutputStream("listData");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(nameList);
            System.out.println("serializing array data:" + objectOutputStream.toString());
            objectOutputStream.close();
            outputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializeArrayList() {
        ArrayList<String> nameList = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream("listData");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            nameList = (ArrayList)objectInputStream.readObject();

            fileInputStream.close();
            objectInputStream.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c) {
            System.out.println("class not found");
            c.printStackTrace();
            return;
        }
        System.out.print("deserialize: ");
        nameList.forEach(e -> System.out.print(e + " "));
    }
}
