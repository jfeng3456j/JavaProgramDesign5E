package ReadProperties;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesFileMain {

    public static void main (String[] args) throws Exception {
        Properties prop = new Properties();

        try {
            FileInputStream file = new FileInputStream("./src/resource/config.properties");
            prop.load(file);
            System.out.println(prop.getProperty("username"));
            System.out.println(prop.getProperty("password"));
            System.out.println(prop.getProperty("email"));
        } catch (Exception e) {
            throw new Exception("File is not found \n " + e);
        }

    }
}
