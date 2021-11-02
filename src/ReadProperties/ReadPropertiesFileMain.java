package ReadProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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


        ReadPropertiesFileMain RPF = new ReadPropertiesFileMain();
        RPF.test(prop);

    }

    public void test(Properties prop) throws IOException {
        InputStream file = null;
        file = getClass().getClassLoader().getResourceAsStream("resource/classpath.properties");
        prop.load(file);

        System.out.println(prop.getProperty("email"));
    }
}
