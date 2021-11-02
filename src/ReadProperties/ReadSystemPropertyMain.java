package ReadProperties;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadSystemPropertyMain {

    public static void main (String[] args) throws Exception {
        Properties prop = new Properties();

        try {
            String dir = System.getProperty("user.dir");
            System.out.println(dir);
            //pass the file path as vm arg in edite configuration -Dfile="src/resource/config.properties
            String path = System.getProperty("file");
            FileInputStream file = new FileInputStream(dir+path);

            prop.load(file);
            System.out.println(prop.getProperty("username"));
            System.out.println(prop.getProperty("email"));
        } catch (Exception e) {
            throw new Exception("File is not found "+ e);
        }
    }
}
