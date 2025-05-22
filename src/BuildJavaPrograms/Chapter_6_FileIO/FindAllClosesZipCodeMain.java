package BuildJavaPrograms.Chapter_6_FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindAllClosesZipCodeMain {

    public static void main(String[] args) {

        try {
            //ask user to enter a zip code and closest zip code by mile
            Scanner input = new Scanner(System.in);
            System.out.println("please enter a zipcode");
            String zipCode = input.next();
            System.out.println("And what proximity (in miles)?");
            double miles = input.nextDouble();

            Scanner file = new Scanner(new File("./src/BuildJavaPrograms/Chapter_6_FileIO/Input_Files/zipcode.txt"));
            String coordinates = find(zipCode, file);

            //find all match zip within the giving miles using haversine formula but start from beginning in zip file
            file = new Scanner(new File("./src/BuildJavaPrograms/Chapter_6_FileIO/Input_Files/zipcode.txt"));
            findAllMatchZip(file, miles, coordinates);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String find(String zipCode, Scanner file) {
        while(file.hasNextLine()) {
             String fileZip = file.nextLine();
             String fileCity = file.nextLine();
             String fileCoord = file.nextLine();

             if (fileZip.equals(zipCode)) {
                 System.out.println(fileZip + ": " + fileCity);
                 return fileCoord;
             }
        }
        return "";
    }

    public static void findAllMatchZip(Scanner file, double miles, String coord) {
        Scanner coordData = new Scanner(coord);
        double lat1 = coordData.nextDouble();
        double long1 = coordData.nextDouble();

        System.out.println("Zip codes within " + miles + " miles");
        while (file.hasNextLine()) {
            String fZip = file.nextLine();
            String fCity = file.nextLine();
            String fCoord = file.nextLine();

            coordData = new Scanner(fCoord);
            double fLat1 = coordData.nextDouble();
            double fLong1 = coordData.nextDouble();

            double distances = distance(lat1, long1, fLat1, fLong1);

            if (distances <= miles) {
                System.out.printf("    %s %s, %3.2f miles\n" , fZip, fCity, distances);
            }

        }
    }

    private static double distance(double lat1, double long1, double fLat1, double fLong1) {
        //convert lat, long degreed to radian angle
        lat1 = Math.toRadians(lat1);
        long1 = Math.toRadians(long1);

        fLat1 = Math.toRadians(fLat1);
        fLong1 = Math.toRadians(fLong1);

        double theCos = Math.sin(lat1) * Math.sin(fLat1) +
                Math.cos(lat1) * Math.cos(fLat1) * Math.cos(long1 - fLong1);

        double arcLength = Math.acos(theCos);

        return arcLength * 3956.6;

    }
}
